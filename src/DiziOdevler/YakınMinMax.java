package DiziOdevler;

import java.util.Arrays;
import java.util.Scanner;

public class YakınMinMax {
    public static void main(String[] args) {

        int []dizi={15,12,78,1,-1,-78,2,0,64,53,98,-5};
        int sayi,gecicifark,azFark,cokFark,yakinKucuk=0,yakinBuyuk=0;

        Scanner input=new Scanner(System.in);

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        System.out.print("Girilen Sayi :");
        sayi=input.nextInt();

        azFark=dizi[dizi.length-1]-dizi[0];
        cokFark=azFark;

        for(int i=0;i< dizi.length;i++){

            if(dizi[i]<sayi){

                gecicifark=sayi-dizi[i];

                if(gecicifark<=azFark){

                    yakinKucuk=dizi[i];
                    azFark=gecicifark;
                }
            }

            if(dizi[i]>sayi){

                gecicifark=dizi[i]-sayi;

                if(gecicifark<=cokFark){

                    yakinBuyuk=dizi[i];
                    cokFark=gecicifark;
                }
            }
        }

        System.out.println("Girilen Sayidan Kucuk Olan En Yakin Sayi :"+yakinKucuk);
        System.out.println("Girilen Sayidan Buyuk Olan En Yakin Sayi :"+yakinBuyuk);
    }
}
