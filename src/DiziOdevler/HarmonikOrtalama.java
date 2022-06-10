package DiziOdevler;

import java.util.Arrays;
public class HarmonikOrtalama {

    public static void main(String[] args) {

       double [] dizi=new double[5];
       double sum=0.0;

       for(int i=0;i<dizi.length;i++){

           dizi[i]=1.0/(i+1);
           sum+=dizi[i];
       }

        System.out.println("Harmonik Ortalama :"+(dizi.length/sum));
    }
}
