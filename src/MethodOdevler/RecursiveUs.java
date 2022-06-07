package MethodOdevler;
import  java.util.Scanner;

public class RecursiveUs {

    static int UsRecursive(int taban,int us){

        if(us!=0){

            us--;
            return taban*UsRecursive(taban,us);
        }

        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int tabanSayi,kuvvetSayi;

        System.out.print("Taban Giriniz :");
        tabanSayi= input.nextInt();
        System.out.print("Kuvvet Giriniz :");
        kuvvetSayi= input.nextInt();

        int sonucUs=UsRecursive(tabanSayi,kuvvetSayi);

        System.out.println("Sonuc :"+sonucUs);

    }
}
