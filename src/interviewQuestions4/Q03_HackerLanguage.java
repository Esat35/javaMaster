package interviewQuestions4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


import java.util.Scanner;


public class Q03_HackerLanguage {
    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String metin = scan.nextLine();

        hackerDili1(metin);
        hackerDili2(metin);


    }

    private static void hackerDili2(String metin) {
        //2.yol
        //******************************************************************

        String[] arr = metin.split("");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase("s")) {
                arr[i] = "5";
            }


            if (arr[i].equalsIgnoreCase("a")) {
                arr[i] = "4";
            }


            if (arr[i].equalsIgnoreCase("e")) {
                arr[i] = "3";
            }


            if (arr[i].equalsIgnoreCase("i")) {
                arr[i] = "1";
            }

            if (arr[i].equalsIgnoreCase("o")) {
                arr[i] = "0";
            }


        }
        System.out.println("ikinci yol ile : ");
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]);
}
    }

    private static void hackerDili1(String metin) {
        //1.yol
        metin = metin.replace("s", "5").replace("a", "4").replace("e", "3")
                .replace("i", "1").replace("o", "0");

        System.out.println(metin);


    }


}