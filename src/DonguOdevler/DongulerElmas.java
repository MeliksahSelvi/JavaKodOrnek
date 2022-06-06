package DonguOdevler;
import java.util.Scanner;

public class DongulerElmas {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int elmasKatman;

        System.out.print("Elmasiniz kac katmanli olsun? :" );
        elmasKatman= input.nextInt();

        for(int i=1;i<=elmasKatman;i++){

           for(int j=1;j<=(elmasKatman-i);j++){

               System.out.print(" ");
           }
           for(int k=1;k<=(2*i-1);k++){

               System.out.print("*");
           }

            System.out.println();
        }

        for(int i=elmasKatman;i>=1;i--){

            for(int j=elmasKatman-i;j>=1;j--){

                System.out.print(" ");
            }
            for(int k=(2*i-1);k>=1;k--){

                System.out.print("*");
            }

            System.out.println();
        }

    }
}
