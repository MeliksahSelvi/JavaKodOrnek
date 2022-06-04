package KosulOdevler;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {

        String userName,userPassword,geciciName,geciciPassword,kullaniciCevap;

        Scanner input=new Scanner(System.in);

        System.out.println("Kayit Sayfasina Hosgeldiniz");
        System.out.print("Kullanici Adi Olusturun :");
        userName=input.nextLine();
        System.out.print("Sifre Olusturun :");
        userPassword=input.nextLine();

        System.out.println("Giris Sekmesine Hosgeldiniz");
        System.out.print("Kullanici Adi :");
        geciciName=input.nextLine();
        System.out.print("Sifre :");
        geciciPassword=input.nextLine();

        if(userName.equals(geciciName) && userPassword.equals(geciciPassword))
            System.out.println("Giris Yaptiniz.");

        else{

            System.out.println("Bilgileriniz Yanlis.");
            System.out.println("Sifre Sifirlamak Istiyorsaniz 'evet' Yazin :");
            kullaniciCevap=input.nextLine();

            switch (kullaniciCevap){

                case "evet":

                    System.out.println("Yeni Sifre Girin :");
                    geciciPassword=input.nextLine();

                    while(userPassword.equals(geciciPassword)){
                        System.out.println("Sifre Olusturulamadi, Lutfen Baska Sifre Giriniz.");
                        geciciPassword=input.nextLine();
                    }

                    System.out.println("Sifreniz Sifirlandi.");
                    userPassword=geciciPassword;

                    break;

                default :
                    System.out.println("Sifreniz Isteginiz Uzere Sifirlanmadi.");
                    break;
            }

        }

    }
}
