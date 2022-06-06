package DonguOdevler;
import java.util.Scanner;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int boyutDizi,elemanDizi,diziMax,diziMin;

        System.out.print("Kac Tane Sayi Gireceksiniz? :");
        boyutDizi= input.nextInt();

        int [] diziArray=new int[boyutDizi];

        for(int i=0;i<boyutDizi;i++){

            System.out.print((i+1)+". Sayiyi Giriniz :");
            elemanDizi= input.nextInt();

            diziArray[i]=elemanDizi;
        }

        diziMax=diziArray[0];
        diziMin=diziArray[0];

        for(int i=1;i<boyutDizi;i++){

            if(diziArray[i]>diziMax){

                diziMax=diziArray[i];
            }
        }

        for(int i=1;i<boyutDizi;i++){

            if(diziArray[i]<diziMax){

                diziMin=diziArray[i];
            }
        }

        System.out.println("En Buyuk Eleman :"+diziMax);
        System.out.println("En Kucuk Eleman :"+diziMin);

    }
}
