package DonguOdevler;
import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int anaSayi,sonSayi=0,basamakSayisi=0,geciciSayi,basamakGecis;

        System.out.print("Sayi Giriniz :");
        anaSayi= input.nextInt();

        geciciSayi=anaSayi;

        while(geciciSayi !=0){

            geciciSayi/=10;
            basamakSayisi++;
        }

        geciciSayi=anaSayi;

        while(geciciSayi!=0){

            basamakGecis=geciciSayi%10;

            sonSayi+=UsBulma(basamakGecis,basamakSayisi);

            geciciSayi/=10;
        }

        if(sonSayi==anaSayi){
            System.out.println(anaSayi+" bir armstrong bir sayidir.");
        }

        else{
            System.out.println(anaSayi+" bir armstrong bir sayi degildir.");
        }
    }

    public static int UsBulma(int sayiTaban,int sayiKuvvet){

        int sayiSonuc=1;

        for(int i=1;i<=sayiKuvvet;i++){

            sayiSonuc*=sayiTaban;
        }

        return sayiSonuc;
    }
}
