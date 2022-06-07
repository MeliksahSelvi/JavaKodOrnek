package DonguOdevler;
import  java.util.Scanner;


public class FibonaSeri {

    static int fibo(int fiboSayi){

        if(fiboSayi>0){

            return fiboSayi+fibo((fiboSayi-1));
        }

        else{

            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int fiboSayi;


        System.out.print("Sayi Girin :");
        fiboSayi= input.nextInt();

        int dizi[]=new int[fiboSayi+1];

        dizi[0]=0;
        dizi[1]=1;

        for(int i=2;i< dizi.length;i++){

            dizi[i]=dizi[i-1]+dizi[i-2];
        }

        for(int j=0;j< dizi.length-2;j++){

            System.out.println(dizi[j]+" + "+dizi[j+1]+" = "+(dizi[j]+dizi[j+1]));
        }


    }
}
