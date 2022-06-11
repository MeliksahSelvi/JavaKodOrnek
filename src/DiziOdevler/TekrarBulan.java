package DiziOdevler;
import java.util.Arrays;

public class TekrarBulan {

    static boolean isFind(int []list,int value){

        for(int i:list){

            if(i==value){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int [ ] arrayy={8,7,4,4,2,9,10,2,1,33,8,1};

        int [] duplicate=new int[arrayy.length];
        int startIndex=0;

        for(int i=0;i<arrayy.length;i++){

            for(int j=0;j<arrayy.length;j++){

                if((i!=j) && (arrayy[i]==arrayy[j]) && arrayy[i]%2==0){

                    if(!isFind(duplicate,arrayy[i])){

                        duplicate[startIndex++]=arrayy[i];
                    }

                    break;
                }
            }
        }

        for(int i:duplicate){

            if(i!=0){

                System.out.print(i+" ");
            }
        }
    }
}
