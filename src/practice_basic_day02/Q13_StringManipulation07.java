package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("bir string giriniz : ");

        String str= scan.nextLine().toLowerCase(Locale.ROOT);
        boolean contains=false;

        if(str.contains("xyz")){
            contains=true;
        }else {
            contains=false;

        }

        System.out.println(contains);
    }
}
