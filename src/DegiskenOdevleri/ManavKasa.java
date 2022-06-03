package DegiskenOdevleri;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner girdiler=new Scanner(System.in);
        double elmaFiyat=3.67,armutFiyat=2.14,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00,toplamUcret;
        int elmaKilo,armutKilo,domatesKilo,muzKilo,patlicanKilo;

        System.out.print("Elma Kac Kilo? :");
        elmaKilo= girdiler.nextInt();
        System.out.print("Armut Kac Kilo? :");
        armutKilo= girdiler.nextInt();
        System.out.print("Domates Kac Kilo? :");
        domatesKilo= girdiler.nextInt();
        System.out.print("Muz Kac Kilo? :");
        muzKilo= girdiler.nextInt();
        System.out.print("Patlican Kac Kilo? :");
        patlicanKilo= girdiler.nextInt();

        toplamUcret=(elmaFiyat*elmaKilo)+(armutFiyat*armutKilo)+(domatesFiyat*domatesKilo)+(muzFiyat*muzKilo)+(patlicanFiyat*patlicanKilo);

        System.out.println("Toplam Ucret :"+toplamUcret);

    }
}
