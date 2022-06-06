package DonguOdevler;
import  java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int birinciSayi,ikinciSayi,ortakEbob=1,ortakEkok,geciciIndis;

        System.out.print("1.Sayi Giriniz :");
        birinciSayi= input.nextInt();
        System.out.print("2.Sayi Giriniz :");
        ikinciSayi= input.nextInt();

        geciciIndis=birinciSayi;

        while(true){

            if(birinciSayi%geciciIndis==0 && ikinciSayi%geciciIndis==0){
                ortakEbob=geciciIndis;
                System.out.println(birinciSayi+" ve "+ikinciSayi+"sayilarinin EBOB'u :"+ortakEbob);
                break;
            }

            geciciIndis--;
        }

        geciciIndis=1;


        while(true){

            if(geciciIndis%birinciSayi==0 && geciciIndis%ikinciSayi==0){

                ortakEkok=geciciIndis;
                System.out.println(birinciSayi+" ve "+ikinciSayi+"sayilarinin EKOK'u :"+ortakEkok);
                break;
            }

            geciciIndis++;
        }
    }
}
