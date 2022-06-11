package DiziOdevler;
import java.util.Scanner;


public class DiziSıralama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int diziBoyut,geciciDeger=0,geciciIndis=0,enKucuk,degisim=0;

        System.out.print("Dizinin Boyutunu Girin :");
        diziBoyut= input.nextInt();

        int [] diziSort=new int[diziBoyut];

        for(int i=0;i<diziBoyut;i++){

            System.out.print((i+1)+". Elemani :");
            diziSort[i]= input.nextInt();
        }

        for(int i=0;i<diziBoyut;i++){

            enKucuk=diziSort[i];

            for(int j=i+1;j<diziBoyut;j++){

                if(diziSort[j]<enKucuk){

                    enKucuk=diziSort[j];
                    geciciIndis=j;
                    degisim++;
                }

            }

            if(degisim!=0){

                geciciDeger=diziSort[i];
                diziSort[i]=enKucuk;
                diziSort[geciciIndis]=geciciDeger;
            }

            degisim=0;

        }

        System.out.print("Siralama :");
        for(int i:diziSort)
            System.out.print(i+" ");
    }
}
