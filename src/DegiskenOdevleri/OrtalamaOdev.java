package DegiskenOdevleri;
import java.util.Scanner;

public class OrtalamaOdev {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,turkce,fizik,kimya,biyo,tarih;
        double ortalama;
        String sonuc;

        System.out.print("Matematik Notunuzu Giriniz :");
        mat= input.nextInt();
        System.out.print("Turkce Notunuzu Giriniz :");
        turkce=input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz :");
        fizik= input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz :");
        kimya= input.nextInt();
        System.out.print("Biyoloji Notunuzu Giriniz :");
        biyo= input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz :");
        tarih= input.nextInt();

        ortalama=(mat+turkce+fizik+kimya+biyo+tarih)/6;

        sonuc=ortalama >=60 ? "Gectiniz":"Gecemediniz";

        System.out.println("Ortalamaniz : "+ortalama);
        System.out.println("Donem Gecme Durumunuz : "+ sonuc);

    }
}
