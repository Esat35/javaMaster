package interviewQuestions1;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.print(" bir kelime giriniz : ");
        String kelime = scan.next();
        System.out.print("tekrar sayısını gırınız : ");
        int tekrarSayısı=scan.nextInt();

        ilkVeSonHarfTekrarliYaz(kelime,tekrarSayısı);



    }

    private static void ilkVeSonHarfTekrarliYaz(String kelime, int tekrarSayısı) {
        String tekrarlı="";
        for (int i = 0; i <tekrarSayısı ; i++) {
          tekrarlı+= kelime.substring(0,1)+kelime.substring(kelime.length()-1);
        }
        System.out.println(tekrarlı);
    }

}
