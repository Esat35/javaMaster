package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("ilk kelimeyi giriniz : ");
        String str1=scan.next();
        System.out.print("ikinci kelimeyi giriniz : ");
        String str2=scan.next();

        System.out.println(str1.concat(str2));
        System.out.println(str1.substring(1)+str2.substring(1));

    }
}
