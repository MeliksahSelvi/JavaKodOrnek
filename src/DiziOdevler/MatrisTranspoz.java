package DiziOdevler;


public class MatrisTranspoz {

    static void printMatris(int [][] matris){

        for(int i=0;i< matris.length;i++){

            for(int j=0;j<matris[0].length;j++){

                System.out.print(matris[i][j]+"   ");
            }
            System.out.println();
        }
    }

    static int [][] getTranspoz(int [][] matris){

        int [][] transpoz=new int[matris[0].length][matris.length];

        for(int i=0;i<matris.length;i++){

            for(int j=0;j<matris[0].length;j++){

                transpoz[j][i]=matris[i][j];

            }
        }

        return transpoz;
    }

    public static void main(String[] args) {

        int [][] matrisTr={ {1,2,3}, {4,5,6} };

        int [][] transpozTr=new int[matrisTr[0].length][matrisTr.length];

        System.out.println("Matris :");

        printMatris(matrisTr);

        transpozTr=getTranspoz(matrisTr);


        System.out.println("Transpoze :");
        printMatris(transpozTr);



    }
}
