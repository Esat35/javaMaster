package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("isminizi giriniz : ");
String isim= scan.nextLine();
        System.out.print("Soy isminizi giriniz : ");
        String soyIsim= scan.next();

        if (isim.length()>soyIsim.length()){
            System.out.println("isminiz daha uzun.");
        }else if (soyIsim.length()>isim.length()){
            System.out.println("Soy isminiz daha uzun");
        }else{
            System.out.println("isim ve soy isminiz aynı uzunlukta");
        }

    }

}
