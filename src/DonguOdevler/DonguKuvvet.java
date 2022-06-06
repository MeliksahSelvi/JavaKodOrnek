package DonguOdevler;
import java.util.Scanner;

public class DonguKuvvet {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int girdiSayi;
        System.out.print("Bir sayi giriniz :");
        girdiSayi= input.nextInt();

        System.out.print("4'un Kuvvetleri :");

        for(int i=1;i<=girdiSayi;i*=4){

            if(i*4>girdiSayi){
                System.out.print(i);
            }
            else{
                System.out.print(i+",");
            }
        }

        System.out.print("\n5'in Kuvvetleri :");

        for(int j=1;j<=girdiSayi;j*=5){

            if(j*5>girdiSayi){
                System.out.print(j);
            }
            else{
                System.out.print(j+",");
            }

        }

    }
}
