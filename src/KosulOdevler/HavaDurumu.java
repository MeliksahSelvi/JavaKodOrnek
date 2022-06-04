package KosulOdevler;
import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);
        int havaSicaklik;

        System.out.print("Hava Sicakligi Giriniz :");
        havaSicaklik= girdi.nextInt();

        if(havaSicaklik<5)
            System.out.println("Kayak Yapabilirsiniz.");
        if(havaSicaklik>=5 && havaSicaklik<=15)
            System.out.println("Sinemaya Gidebilirsiniz.");
        if(havaSicaklik>=10 && havaSicaklik<=25)
            System.out.println("Piknige Gidebilirsiniz.");
        if(havaSicaklik>25)
            System.out.println("Yuzebilirsiniz.");

    }
}
