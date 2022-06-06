package DonguOdevler;
import  java.util.Scanner;



public class KombinasyonHesap {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int elemanSayisi, grupSayisi,toplamDeger;

        System.out.print("Kumeniz Kac Elemanli? :");
        elemanSayisi= input.nextInt();

        System.out.print("Gruplar Kac Elemanli Olacak? :");
        grupSayisi= input.nextInt();

        toplamDeger=KombinasyonHesap(elemanSayisi)/(KombinasyonHesap(grupSayisi)*KombinasyonHesap(elemanSayisi-grupSayisi));

        System.out.println("Kombinasyon Degeri :"+toplamDeger);
    }
    public static int KombinasyonHesap(int gelenParametre){

        if(gelenParametre>1){
            return gelenParametre*KombinasyonHesap(gelenParametre-1);
        }

        else{
            return 1;
        }
    }
}
