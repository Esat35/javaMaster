package practice_basic_day03;

import java.util.Locale;
import java.util.Scanner;

public class Q09_ForLoop04 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
 değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
 1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
 Sesli harfler:

 Test Data:
 a
 Beklenen Çıktı:
 a harfi sesli harfdir.

 Test Data:
 d
 Beklenen Çıktı:
 d harfi sesiz harftir.

 Test Data:
 we  yada  %

 Beklenen Çıktı:
 Yanlis karakter girdiniz!

  */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir harf giriniz : ");
        String harf = scan.next();
        char karakter = harf.toLowerCase(Locale.ROOT).charAt(0);

        String seslıHarf = "aeiou";
        boolean seslıMı = false;

        if (harf.length() == 1 && (karakter >= 'A' && karakter <= 'z')) {
            for (char i = 'A'; i <= 'z'; i++) {

                if (seslıHarf.contains(harf)) {

                    seslıMı = true;
                    break;
                }


            }
            if (seslıMı) {
                System.out.println(harf + " harfi sesli harftır.");
            } else System.out.println(harf + " harfi sessiz harftır.");


        } else System.out.println("hatalı karakter girişi!");


    }


}
