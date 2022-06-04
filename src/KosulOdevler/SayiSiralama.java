package KosulOdevler;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a,b,c;

        System.out.print("1.Sayiyi Giriniz :");
        a=input.nextInt();
        System.out.print("2.Sayiyi Giriniz :");
        b=input.nextInt();
        System.out.print("3.Sayiyi Giriniz :");
        c=input.nextInt();

        if(a<b && a<c && b<c){
            System.out.println(a+"<"+b+"<"+c);
        }
        else if(a<b && a<c && b>c){
            System.out.println(a+"<"+c+"<"+b);
        }
        else if(a>b && a<c && b<c){
            System.out.println(b+"<"+a+"<"+c);
        }
        else if(a<b && a>c && b>c){
            System.out.println(c+"<"+a+"<"+b);
        }
        else if(a>b && a>c && b<c){
            System.out.println(b+"<"+c+"<"+a);
        }
        else if(a>b && a>c  && b>c){
            System.out.println(c+"<"+b+"<"+a);
        }

    }
}
