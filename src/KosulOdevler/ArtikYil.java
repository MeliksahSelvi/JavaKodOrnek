package KosulOdevler;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int artikYil;
        boolean sonuc=false;

        System.out.print("Yil Giriniz :");
        artikYil=input.nextInt();

        if(artikYil%4==0){

            if(artikYil%100==0 && artikYil %400 !=0){
                System.out.println(artikYil+" bir artik yil degildir.");
            }
            else {
                System.out.println(artikYil+" bir artik yildir.");
            }
        }

        else {
            System.out.println(artikYil+" bir artik yil degildir.");
        }


    }
}
