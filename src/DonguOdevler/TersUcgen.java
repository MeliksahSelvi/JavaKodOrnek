package DonguOdevler;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int katmanSayisi,satirGenislik;

        System.out.print("Bir Sayi Giriniz :");
        katmanSayisi= input.nextInt();



        for(int i=1;i<=katmanSayisi;i++){

            satirGenislik=2*katmanSayisi;
            satirGenislik-=i;

            for(int j=1;j<i;j++){

                System.out.print(" ");
                satirGenislik--;
            }

            for(int k=1;k<=satirGenislik;k++){

                System.out.print("*");
            }

            System.out.println();
        }

    }
}
