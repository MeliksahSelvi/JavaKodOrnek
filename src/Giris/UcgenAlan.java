package Giris;
import java.util.Scanner;


public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int kenar1,kenar2,kenar3;
        double alan,cevrecik;
        System.out.print("1.Kenari Giriniz :");
        kenar1= input.nextInt();
        System.out.print("2.Kenari Giriniz :");
        kenar2= input.nextInt();
        System.out.print("3.Kenari Giriniz :");
        kenar3= input.nextInt();
        cevrecik=(kenar1+kenar2+kenar3)/2;
        alan=Math.sqrt(cevrecik*(cevrecik-kenar1)*(cevrecik-kenar2)*(cevrecik-kenar3));
        System.out.print("Ucgenin Alani :"+alan);
    }
}

