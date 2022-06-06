package DonguOdevler;
import java.util.Scanner;

public class HarmonikHesap {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int harmoSayi;
        double toplamSonuc=0;

        System.out.print("Bir sayi giriniz :");
        harmoSayi=input.nextInt();

        for(double i=1;i<=harmoSayi;i++){

            toplamSonuc+=(1/i);
        }

        System.out.println("Toplam Seri :"+toplamSonuc);

    }
}
