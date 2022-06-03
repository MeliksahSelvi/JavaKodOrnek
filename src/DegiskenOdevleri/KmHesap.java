package DegiskenOdevleri;
import java.util.Scanner;

public class KmHesap {
    public static void main(String[] args) {
        int acilisUcret=10,kmToplam;
        double kmBasi=2.20,toplamUcret;
        Scanner input=new Scanner(System.in);

        System.out.print("Gidilen Kilometre Girin :");
        kmToplam=input.nextInt();

        toplamUcret=(acilisUcret+kmToplam*kmBasi);

        toplamUcret=(toplamUcret<20) ? 20:toplamUcret;

        System.out.print("Toplam Ucret :"+toplamUcret);
    }
}
