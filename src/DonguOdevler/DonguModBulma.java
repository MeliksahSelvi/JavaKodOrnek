package DonguOdevler;
import  java.util.Scanner;

public class DonguModBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int girdiSayi,sayiMiktar=0,toplamSonuc=0;

        System.out.print("Bir sayi giriniz :");
        girdiSayi=input.nextInt();

        for(int i=0;i<=girdiSayi;i++){

            if(i%12==0 && i!=0){
                sayiMiktar++;
                toplamSonuc+=i;
            }
        }

        System.out.println("3 ve 4'e tam bolunen sayilarin ortalamasi : "+toplamSonuc/sayiMiktar);

    }
}
