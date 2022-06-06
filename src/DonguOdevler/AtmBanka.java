package DonguOdevler;
import java.util.Scanner;

public class AtmBanka {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String kullaniciAdi,kullaniciParola,geciciAd,geciciParola;
        int userRight=3,kullaniciBakiye=0,menuSecim,degisenMiktar;

        System.out.println("Kayit Ekranina Hosgeldiniz.");
        System.out.print("Kullanici Adi Giriniz :");
        kullaniciAdi=input.nextLine();
        System.out.print("Parola Giriniz :");
        kullaniciParola=input.nextLine();
        System.out.println("-------------------------------------------\n\n");
        while(userRight>0){

            System.out.println("Musteri Giris Ekranina Hosgeldiniz");
            System.out.print("Kullanici Adi Giriniz :");
            geciciAd=input.nextLine();
            System.out.print("Parola Giriniz :");
            geciciParola=input.nextLine();


            if(kullaniciAdi.equals(geciciAd) && kullaniciParola.equals(geciciParola)){

                System.out.println("Menuye Hosgeldiniz.");
                do{

                    System.out.println("1-Para Yatirma\n"+"2-Para Cekme\n"+"3-Bakiye Sorgulama\n"+"4-Cikis Yapma");

                    System.out.print("Seciminiz :");
                    menuSecim= input.nextInt();

                    switch (menuSecim){

                        case 1:{

                            System.out.println("Bakiyeniz :"+kullaniciBakiye);
                            System.out.print("Yatiracaginiz Miktar :");
                            degisenMiktar= input.nextInt();

                            kullaniciBakiye+=degisenMiktar;

                            break;
                        }
                        case 2:{

                            System.out.println("Bakiyeniz :"+kullaniciBakiye);
                            System.out.print("Cekeceginiz Miktar :");
                            degisenMiktar= input.nextInt();

                            if(degisenMiktar<kullaniciBakiye){

                                kullaniciBakiye-=degisenMiktar;
                            }

                            else{
                                System.out.println("Bakiye Yetersiz!");
                            }
                            break;
                        }
                        case 3:{

                            System.out.println("Bakiyeniz :"+kullaniciBakiye);

                            break;
                        }
                        case 4:{

                            break;
                        }
                    }
                }while(menuSecim!=4);

                System.out.println("Tekrar Gorusmek Uzere.");
                break;

            }
            else{
                userRight--;
                System.out.println("Bilgilerinizi Yanlis Girdiniz.Tekrar Deneyiniz!");

                if(userRight==0){
                    System.out.println("Hesabiniz Bloke Oldu.Bankaniz Ile Iletisime Geciniz");
                }
                else {
                    System.out.println("Kalan Hakkiniz :"+userRight);
                }
            }
        }
    }
}
