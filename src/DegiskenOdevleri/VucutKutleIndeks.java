package DegiskenOdevleri;
import java.util.Scanner;

public class VucutKutleIndeks {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        double boyIndeks,kiloIndeks,kitleIndeks;

        System.out.print("Boy Metre Cinsinden Giriniz :");
        boyIndeks= girdi.nextDouble();
        System.out.print("Kilo Giriniz :");
        kiloIndeks= girdi.nextDouble();

        kitleIndeks=(kiloIndeks/Math.pow(boyIndeks,2));

        System.out.println("Vucut Kitle Indeksiniz :"+kitleIndeks);
    }
}
