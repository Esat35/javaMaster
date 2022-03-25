package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı gırınız : ");
        int sayı=scan.nextInt();

        int rakamToplamı=0;

        while (sayı>0) {
            rakamToplamı+=sayı%10;
            sayı/=10;

        }
        System.out.println("girilen sayının rakamlar toplamı : "+rakamToplamı);

    }

}