package KosulOdevler;
import java.util.Scanner;

public class HesapMakine {
    public static void main(String[] args) {
        int birinciSayi,ikinciSayi;
        char menuSecim;

        Scanner input=new Scanner(System.in);

        System.out.print("Birinci Sayiyi Giriniz :");
        birinciSayi=input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz :");
        ikinciSayi=input.nextInt();

        System.out.println("Toplama Icin +\nCikarma Icin -\nCarpma Icin *\nBolme Icin / \n");
        System.out.print("Secim :");
        menuSecim=input.next().charAt(0);

        switch(menuSecim){

            case '+':
                System.out.println("Toplam : "+(birinciSayi+ikinciSayi));
                break;

            case '-':
                System.out.println("Cikarma : "+(birinciSayi-ikinciSayi));
                break;

            case '*':
                System.out.println("Carpma : "+(birinciSayi*ikinciSayi));
                break;

            case '/':
                if(ikinciSayi!=0)
                System.out.println("Bolme : "+(birinciSayi/ikinciSayi));

                else{
                    System.out.println("Hicbir sayi 0'a bolunemez.!");
                }
                break;
            default:
                System.out.println("Yanlis Secim Yaptiniz.!");
                break;
        }
    }
}
