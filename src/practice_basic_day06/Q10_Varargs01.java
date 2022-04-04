package practice_basic_day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_Varargs01 {

    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments

        int sayı1=10;
        int sayı2=20;
        int sayı4=30;
        int sayı5=40;
        int sayı3=50;
        int sayı6=60;

        sayılarıTopla(sayı1,sayı3,sayı6,sayı2,sayı4,sayı5);

    }

    private static void sayılarıTopla(int ...sayılar) {
int toplam=0;
        for (int each:sayılar
             ) {
            toplam+=each;
        }
        System.out.println("gırılen sayıların toplamı : "+toplam);
    }


}
