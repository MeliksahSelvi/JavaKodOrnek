package DegiskenOdevleri;
import java.util.Scanner;

public class KdvOdev {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double para,kdv,toplam;
        System.out.print("Para Miktari Giriniz :");
        para= input.nextInt();
        kdv=(para>0 && para<=1000) ? 0.18 : 0.08;
        toplam=para+para*kdv;
        System.out.println("KDV'siz Fiyat :"+para);
        System.out.println("KDV Orani :"+kdv);
        System.out.println("KDV'Li Fiyat :"+toplam);
        System.out.println("KDV Tutari :"+(para*kdv));

    }
}
