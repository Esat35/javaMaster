package practice_basic_day03;

import java.util.Scanner;

public class Q15_DoWhileLoop01 {
    /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String giris="";
        System.out.println("cıkıs yapmak için x'e basmalısınız.");

        do {

            System.out.println("program calısıyor");

        }while(!scan.next().equalsIgnoreCase("x"));


        System.out.println("Program bitti.");
    }



}
