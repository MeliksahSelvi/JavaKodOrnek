package MethodOdevler;
import java.util.Scanner;

public class PalindromHesap {

    static boolean isPalindrom(int isPalind ){

        int kacBasamak=basamakSayisi(isPalind),temp=isPalind,sonDeger=0,lastNumber;


        while(temp!=0){

            lastNumber=temp%10;
            sonDeger+=lastNumber*Math.pow(10,kacBasamak-1);
            kacBasamak--;

            temp/=10;
        }

        if(sonDeger==isPalind)
            return true;
        else
            return false;
    }

    static int basamakSayisi(int kacBasamak){

        int basamak=0;

        while(kacBasamak!=0){

            basamak++;
            kacBasamak/=10;
        }

        return basamak;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int palindRom;

        System.out.print("Bir Sayi Giriniz :");
        palindRom= input.nextInt();

        if(isPalindrom(palindRom))
            System.out.println(palindRom+" palindrom sayidir.");

        else
            System.out.println(palindRom+" palindrom sayi degildir.");

    }
}
