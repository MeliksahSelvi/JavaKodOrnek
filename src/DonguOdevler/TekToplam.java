package DonguOdevler;
import java.util.Scanner;

public class TekToplam {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int girdiSayi,toplamSayi=0;


        do{
            System.out.print("Bir sayi giriniz :");
            girdiSayi=input.nextInt();

            if(girdiSayi%4==0){
                toplamSayi+=girdiSayi;
            }

        }while(girdiSayi%2==0);

        System.out.println("Girdiginiz 4'e tam bolunen cift sayilarin toplami :"+toplamSayi);

    }
}
