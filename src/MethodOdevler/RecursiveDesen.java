package MethodOdevler;
import java.util.Scanner;

public class RecursiveDesen {

    static void recursiveDesen(int desenEleman,int geciciEleman,int desenYon){


        System.out.print(" "+geciciEleman);
        if(geciciEleman<=0)
            desenYon++;

        if(desenYon==0)
            geciciEleman-=5;

        else
            geciciEleman+=5;


        if(desenEleman+5==geciciEleman && desenYon==1)
            return;


        else
        recursiveDesen(desenEleman,geciciEleman,desenYon);

    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayiDesen;

        System.out.print("N sayisi giriniz :");
        sayiDesen= input.nextInt();

        recursiveDesen(sayiDesen,sayiDesen,0);




    }
}
