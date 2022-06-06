package DonguOdevler;

public class AsalBulma {
    public static void main(String[] args) {

        int asalMi;

        for(int i=2;i<=100;i++){

            asalMi=0;

            for(int j=i-1;j>0;j--){

                if(i%j==0){
                    asalMi++;
                }
            }

            if(asalMi==1){
                System.out.print(i+" ");
            }
        }
    }
}
