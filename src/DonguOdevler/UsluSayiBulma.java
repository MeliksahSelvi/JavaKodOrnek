package DonguOdevler;
import java.util.Scanner;

public class UsluSayiBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int sayiTaban,sayiKuvvet,sayiSonuc=1;

        System.out.print("Sayi icin taban giriniz :");
        sayiTaban= input.nextInt();
        System.out.print("Sayi icin kuvvet giriniz :");
        sayiKuvvet= input.nextInt();

        for(int i=1;i<=sayiKuvvet;i++){

            sayiSonuc*=sayiTaban;
        }

        System.out.println("Sonuc :"+sayiSonuc);

    }
}
