package DonguOdevler;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int mukemmelSayi,toplamSayi=0;

        System.out.print("Bir Sayi Giriniz :");
        mukemmelSayi= input.nextInt();

        for(int i=1;i<mukemmelSayi;i++){

            if(mukemmelSayi%i==0){

                toplamSayi+=i;
            }
        }

        if(mukemmelSayi==toplamSayi){

            System.out.println(mukemmelSayi+" Mukemmel Sayidir.");
        }

        else {

            System.out.println(mukemmelSayi+" Mukemmel Sayi Degildir.");
        }
    }
}
