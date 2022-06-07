package MethodOdevler;
import  java.util.Scanner;

public class RecursiveAsal {

    static boolean RecursiveAsal(int sayiAsal,int temp){

        while(true){

            if(temp!=2)
                temp--;

            else break;

            if(sayiAsal%temp!=0){
                return RecursiveAsal(sayiAsal,temp);
            }
            else{

                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayiAsal;
        boolean isAsal;

        System.out.print("Sayi Giriniz :");
        sayiAsal= input.nextInt();
        isAsal=RecursiveAsal(sayiAsal,sayiAsal);

        if(isAsal)
            System.out.println(sayiAsal+" Sayisi Asaldir.");

        else
            System.out.println(sayiAsal+" Sayisi Asal Degildir.");

    }
}
