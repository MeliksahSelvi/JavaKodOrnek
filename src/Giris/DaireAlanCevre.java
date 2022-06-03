package Giris;
import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int yariCap,merkezAci;
        double pi=3.14,alan,cevre;

        Scanner girdi=new Scanner(System.in);
        System.out.print("Yaricap Girin :");
        yariCap= girdi.nextInt();
        System.out.print("Daire Merkez Acisi Girin :");
        merkezAci= girdi.nextInt();

        alan=(pi*yariCap*yariCap*merkezAci)/360;

        System.out.println("Daire Alan :"+alan);
    }
}
