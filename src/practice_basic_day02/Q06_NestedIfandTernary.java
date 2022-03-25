package practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir rakam giriniz : ");
        int rakam = scan.nextInt();

        if (rakam >= 0 && rakam <= 9) {
            if (rakam == 0) {
                System.out.println("sıfır");
            } else if (rakam == 1) {
                System.out.println("bir");
            } else if (rakam == 2) {
                System.out.println("iki");
            } else if (rakam == 3) {
                System.out.println("uc");
            } else if (rakam == 4) {
                System.out.println("dort");
            } else if (rakam == 5) {
                System.out.println("bes");
            } else if (rakam == 6) {
                System.out.println("altı");
            } else if (rakam == 7) {
                System.out.println("yedi");
            } else if (rakam == 8) {
                System.out.println("sekiz");
            } else System.out.println("dokuz");


        } else {
            System.out.println("hatali giriş");
        }


        System.out.println("**********  ternary ile  ***********");

/*
        (rakam >= 0 && rakam <= 9) ?(rakam==0? System.out.println("sıfır")
                :(rakam==1? System.out.println("bir")
                :(rakam==2? System.out.println("iki")
                :rakam==3? System.out.println("üç")
                :rakam==4? System.out.println("dört")
                :rakam==5? System.out.println("beş")
                :rakam==6? System.out.println("alti")
                :rakam==7? System.out.println("yedi")
                :rakam==8? System.out.println("sekiz")
                :rakam==9?System.out.println("dokuz")
                :System.out.println("hatalı gırıs");

*/
    }
}
