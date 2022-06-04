package KosulOdevler;
import java.util.Scanner;

public class BurcHesap {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int kullaniciGun;
        String kullaniciAy,burc=" ";
        boolean gunError=false,ayError=false;

        System.out.println("Ay Isimleri");
        System.out.println("ocak,subat,mart,nisan,mayis,haziran,temmuz,agustos,eylul,ekim,kasim,aralik");
        System.out.print("Ay Giriniz(Kucuk Harflerle) :");
        kullaniciAy=input.nextLine();
        System.out.print("Gun Giriniz(Aylarin Gun Sayilarina Dikkat Ediniz) :");
        kullaniciGun=input.nextInt();

        if(kullaniciAy.equals("ocak")){

            if(kullaniciGun>0 && kullaniciGun<32){

                if(kullaniciGun<22){
                    burc="Oglak";
                }
                else{
                    burc="Kova";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("subat")){

            if(kullaniciGun>0 && kullaniciGun<29){

                if(kullaniciGun<20){
                    burc="Kova";
                }
                else{
                    burc="Balık";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("mart")){

            if(kullaniciGun>0 && kullaniciGun<32){

                if(kullaniciGun<21){
                    burc="Balık";
                }
                else{
                    burc="Koc";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("nisan")){

            if(kullaniciGun>0 && kullaniciGun<31){

                if(kullaniciGun<21){
                    burc="Koc";
                }
                else{
                    burc="Boga";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("mayis")){

            if(kullaniciGun>0 && kullaniciGun<32){

                if(kullaniciGun<22){
                    burc="Boga";
                }
                else{
                    burc="Ikizler";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("haziran")){

            if(kullaniciGun>0 && kullaniciGun<31){

                if(kullaniciGun<22){
                    burc="Ikizler";
                }
                else{
                    burc="Yengec";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("temmuz")){

            if(kullaniciGun>0 && kullaniciGun<32){

                if(kullaniciGun<23){
                    burc="Yengec";
                }
                else{
                    burc="Aslan";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("agustos")){

            if(kullaniciGun>0 && kullaniciGun<32){

                if(kullaniciGun<23){
                    burc="Aslan";
                }
                else{
                    burc="Basak";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("eylul")){

            if(kullaniciGun>0 && kullaniciGun<31){

                if(kullaniciGun<23){
                    burc="Basak";
                }
                else{
                    burc="Terazi";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("ekim")){

            if(kullaniciGun>0 && kullaniciGun<32){

                if(kullaniciGun<23){
                    burc="Terazi";
                }
                else{
                    burc="Akrep";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("kasim")){

            if(kullaniciGun>0 && kullaniciGun<31){

                if(kullaniciGun<22){
                    burc="Akrep";
                }
                else{
                    burc="Yay";
                }
            }
            else {
                gunError=true;
            }
        }
        else if(kullaniciAy.equals("aralik")){

            if(kullaniciGun>0 && kullaniciGun<32){

                if(kullaniciGun<22){
                    burc="Yay";
                }
                else{
                    burc="Oglak";
                }
            }
            else {
                gunError=true;
            }
        }
        else {
            ayError=true;
        }

        if(gunError || ayError){
            System.out.println("Ay veya Gun Bilgisini Hatali Girdiniz.");
        }
        else {
            System.out.println("Burcunuz :"+burc);
        }

    }
}
