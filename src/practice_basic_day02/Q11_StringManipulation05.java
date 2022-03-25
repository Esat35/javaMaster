package practice_basic_day02;

import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" 4 kelıme gırınız.\nher kelımeden sonra ENTER tusuna basınız.");
String kelime1=scan.next();
String kelime2=scan.next();
String kelime3=scan.next();
String kelime4=scan.next();

String cumle=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1)+" "+kelime2.toLowerCase()+" "+kelime3.toLowerCase()+" "+kelime4.toLowerCase()+".";

        System.out.println(cumle);


    }
}
