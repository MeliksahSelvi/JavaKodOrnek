package KosulOdevler;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int matNotu,turkceNotu,fizikNotu,kimyaNotu,muzikNotu;
        double studentAverage=0;

        System.out.print("Matematik Notunuzu Giriniz :");
        matNotu=input.nextInt();
        System.out.print("Turkce Notunuzu Giriniz :");
        turkceNotu=input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz :");
        fizikNotu=input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz :");
        kimyaNotu=input.nextInt();
        System.out.print("Muzik Notunuzu Giriniz :");
        muzikNotu=input.nextInt();

        if(matNotu>0 && matNotu<=100){
            studentAverage+=matNotu;
        }
        if(turkceNotu>0 && turkceNotu<=100){
            studentAverage+=turkceNotu;
        }
        if(fizikNotu>0 && fizikNotu<=100){
            studentAverage+=fizikNotu;
        }
        if(kimyaNotu>0 && kimyaNotu<=100){
            studentAverage+=kimyaNotu;
        }
        if(muzikNotu>0 && muzikNotu<=100){
            studentAverage+=muzikNotu;
        }

        System.out.println("Donem Sonu Ortalamaniz :"+studentAverage/5);

        if(studentAverage/5>=55){
            System.out.println("Donemi Gectiniz Tebrik Ederiz.");
        }
        else{
            System.out.println("Donemi Gecemediniz Uzgunuz.");
        }

    }
}
