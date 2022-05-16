package interviewQuestions2;

import java.util.Scanner;

public class Q04_MukemmelSayi {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();
        System.out.println("mukemmelSayi("+sayi+") = " + mukemmelSayi(sayi));
        System.out.println("******************************************");
        girilenSayiyaKadarMukemmelSayılarıYaz(sayi);

    }

    private static void girilenSayiyaKadarMukemmelSayılarıYaz(int sayi) {
        System.out.print(sayi+" sayısına kadar olan mukemmel sayılar : ");
        for (int i = 1; i <=sayi ; i++) {
            if (mukemmelSayi(i)){
                System.out.print(i+" ");
            }

        }
    }

    private static boolean mukemmelSayi(int sayi) {
        int toplam=0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam +=i;
            }
        }
        if (toplam==sayi){
            return true;
        }else {
            return false;
        }
    }
}