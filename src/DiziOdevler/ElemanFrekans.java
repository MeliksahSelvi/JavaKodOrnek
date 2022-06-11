package DiziOdevler;

import java.util.Arrays;


public class ElemanFrekans {
    public static void main(String[] args) {

        int []dizi={10,15,35,35,5,25,15,25,6,5};
        int tekrarSayi=1;

        System.out.println(Arrays.toString(dizi));
        Arrays.sort(dizi);

        System.out.println("Tekrar Sayilari :");

        for(int i=0;i<dizi.length;i++){

            int j=(i+1);

            while(dizi[i]==dizi[j]){

                j++;
                i++;
                tekrarSayi++;

                if(j== dizi.length){

                    break;
                }
            }

            System.out.println(dizi[i]+" sayisi "+tekrarSayi+" kere tekrar edildi.");
            tekrarSayi=1;
        }
    }
}
