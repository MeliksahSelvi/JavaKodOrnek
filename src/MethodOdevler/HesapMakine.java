package MethodOdevler;
import java.util.Scanner;

public class HesapMakine {

    static void plusFonk(){

        Scanner input=new Scanner(System.in);
        int girdiSayi,toplamSayi=0,satirSayi=1;

        while(true){

            System.out.print((satirSayi++)+". sayi :");
            girdiSayi= input.nextInt();

            if(girdiSayi==0){

                break;
            }

            toplamSayi+=girdiSayi;
        }

        System.out.println("Sonuc :"+toplamSayi);
    }

    static void diffFonk(){

        Scanner input=new Scanner(System.in);
        int birinciSayi,digerSayi,sayiAdet,sonucSayi=0,satirSayi=1;

        System.out.print("Hangi Sayidan Cikarma Yapacagiz? :");
        birinciSayi= input.nextInt();
        sonucSayi+=birinciSayi;

        System.out.print("Kac Tane Sayi Cikaracagiz? :");
        sayiAdet= input.nextInt();

        for(int i=1;i<=sayiAdet;i++){

            System.out.print((satirSayi++)+". sayi :");
            digerSayi= input.nextInt();

            if(sonucSayi>digerSayi)
                sonucSayi-=digerSayi;

            else
                System.out.println("Cikarmak Istediginiz Sayi Elinizdekinden Buyuk!");
                continue;

        }

        System.out.println("Sonuc :"+sonucSayi);
    }

    static void multiplyFonk(){

        Scanner input=new Scanner(System.in);
        int girdiSayi,sonucSayi=1,satirSayi=1;

        while(true){

            System.out.print((satirSayi++)+". Sayi :");
            girdiSayi= input.nextInt();

            sonucSayi*=girdiSayi;

            if(girdiSayi==0)
                break;;
        }

        System.out.println("Sonuc :"+sonucSayi);
    }
    static void dividFonk(){

        Scanner input=new Scanner(System.in);
        int birinciSayi,digerSayi,sayiAdet,satirSayi=1;
        double sonucSayi=0.0;

        System.out.print("Hangi Sayiyi Bolecegiz? :");
        birinciSayi= input.nextInt();
        sonucSayi+=birinciSayi;

        System.out.print("Kac Tane Sayiya Bolecegiz? :");
        sayiAdet= input.nextInt();

        for(int i=1;i<=sayiAdet;i++){

            System.out.print((satirSayi++)+". sayi :");
            digerSayi= input.nextInt();

            if(digerSayi==0){

                System.out.println("Bolenleri 0 Giremezsiniz!");
                continue;
            }

            sonucSayi/=digerSayi;
        }

        System.out.println("Sonuc :"+sonucSayi);

    }

    static void powFonk(){

        Scanner input=new Scanner(System.in);
        int tabanSayi,kuvvetSayi,satirSayi=1,sonucUs=1;

        System.out.print("Taban Giriniz :");
        tabanSayi= input.nextInt();
        System.out.print("Kuvvet Giriniz :");
        kuvvetSayi= input.nextInt();

        for(int i=1;i<=kuvvetSayi;i++){

            sonucUs*=tabanSayi;
        }

        System.out.println("Sonuc :"+sonucUs);
    }
    static void factorFonk(){

        Scanner input=new Scanner(System.in);
        int factorSayi,satirSayi=1,sonucFactor=1;

        System.out.print("Factoriyel Icin Sayi Giriniz :");
        factorSayi= input.nextInt();


        for(int i=factorSayi;i>1;i--){

            sonucFactor*=i;
        }

        System.out.println("Sonuc :"+sonucFactor);
    }

    static void modFonk(){

        Scanner input=new Scanner(System.in);
        int modSayi,digerSayi,sonucMod;

        System.out.print("Modu Alinacak Sayiyi Giriniz :");
        modSayi= input.nextInt();
        System.out.print("Hangi Sayiya Gore Modu Alinacak? :");
        digerSayi= input.nextInt();
        sonucMod=modSayi;

        while(sonucMod>digerSayi)
            sonucMod-=digerSayi;

        System.out.println("Mod :"+sonucMod);
    }

    static void areaPerimeterFonk(){

        Scanner input=new Scanner(System.in);
        int birinciKenar,ikinciKenar,areaPerimet;

        System.out.print("Bir Kenar Giriniz :");
        birinciKenar= input.nextInt();
        System.out.print("Baska Bir Kenar Giriniz :");
        ikinciKenar= input.nextInt();

        System.out.println("Cevre :"+(birinciKenar+ikinciKenar)*2);
        System.out.println("Alan :"+birinciKenar*ikinciKenar);

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int menuSecim;

        System.out.println("1-Toplama Islemi\n2-Cikarma Islemi\n3-Carpma Islemi\n4-Bolme Islemi");
        System.out.println("5-Uslu Sayi Hesabi\n6-Faktoriyel Hesabi\n7-Mod Alma");
        System.out.println("8-Dikdortgen Alan Ve Cevre Hesabi\n9-Cikis");


        do{

            System.out.print("Seciminiz :");
            menuSecim=input.nextInt();

            switch (menuSecim){

                case 1:{

                    plusFonk();
                    break;
                }

                case 2:{

                    diffFonk();
                    break;
                }

                case 3:{

                    multiplyFonk();
                    break;
                }

                case 4:{

                    dividFonk();
                    break;
                }

                case 5:{

                    powFonk();
                    break;
                }

                case 6:{

                    factorFonk();
                    break;
                }

                case 7:{

                    modFonk();
                    break;
                }

                case 8:{

                    areaPerimeterFonk();
                    break;
                }

                case 9:{

                    break;
                }

                default:{

                    System.out.println("Yanlis Secim Yaptiniz.Tekrar Deneyiniz!");
                }
            }
        }while(menuSecim!=9);

    }
}
