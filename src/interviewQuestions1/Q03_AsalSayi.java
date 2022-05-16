package interviewQuestions1;

import java.util.Scanner;

public class Q03_AsalSayi {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();

        boolean asalMi = true;

        if (sayi>=2){

                for (int i = 2; i < sayi; i++) {
                    if (sayi % i == 0) {
                        asalMi = false;
                        break;
                    }
                }
                if (asalMi) {
                    System.out.println("girilen " + sayi + " sayisi asal sayıdır.");
                } else {
                    System.out.println("girilen " + sayi + " sayisi asal degil..");
                }

        }else  System.out.println("girilen " + sayi + " sayisi asal degil..");

    }

}
