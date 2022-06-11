package StringOdevler;

import java.util.Scanner;

public class PalindromikKelime {

    static boolean isPalindrome(String kelime){

        int i=0,j=kelime.length()-1;

        while(i<j){

            if(kelime.charAt(i)!=kelime.charAt(j)){

                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String kelime;

        System.out.print("Bir Kelime Yazin :");
        kelime= input.nextLine();

        if(isPalindrome(kelime)){
            System.out.println("Girdiginiz Kelime Palindromdur.");
        }

        else {
            System.out.println("Girdiginiz Kelime Palindrom Degildir.");
        }
    }
}
