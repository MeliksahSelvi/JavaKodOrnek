package KosulOdevler;
import java.util.Scanner;

public class BiletHesap {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int toplamKm,musteriYas,yolculukTipi;
        double normalUcret,sonUcret=0,indirimYas,indirimCiftYon;


        System.out.print("Mesafeyi Km Turunden Giriniz :");
        toplamKm=input.nextInt();
        System.out.print("Yasinizi Giriniz :");
        musteriYas=input.nextInt();
        System.out.print("Yolculuk Tipi Giriniz(1-Tek Yon , 2-Gidis Donus) :");
        yolculukTipi=input.nextInt();

        normalUcret=toplamKm*0.1;

        if(toplamKm<1){
            System.out.println("Mesafeyi Yanlis Girdiniz.");
        }
        else if(musteriYas<1){
            System.out.println("Yas Bilgisini Yanlis Girdiniz.");
        }
        else if(yolculukTipi !=1 && yolculukTipi!=2){
            System.out.println("Yolculuk Tipini Yanlis Girdiniz.");
        }
        else{

            if(musteriYas<12){
                indirimYas=normalUcret*0.5;
                sonUcret=normalUcret-indirimYas;
            }
            else if(musteriYas>=12 && musteriYas<=24){
                indirimYas=normalUcret*0.1;
                sonUcret=normalUcret-indirimYas;
            }
            else if(musteriYas>65){
                indirimYas=normalUcret*0.3;
                sonUcret=normalUcret-indirimYas;
            }
            else{
                sonUcret=normalUcret;
            }

            switch (yolculukTipi){

                case 1:{

                    System.out.println("Toplam Tutar :"+sonUcret);
                    break;
                }

                case 2:{
                    indirimCiftYon=sonUcret*0.2;
                    sonUcret-=indirimCiftYon;
                    System.out.println("Toplam Tutar :"+sonUcret*2);
                    break;
                }

            }
        }

    }
}
