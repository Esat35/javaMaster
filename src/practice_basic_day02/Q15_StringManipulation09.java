package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime giriniz : ");
        String str = scan.nextLine();

        if (str.length() % 2 == 1 && str.length() >= 0) {
            System.out.println(str.substring((str.length() - 1) / 2, (str.length() - 1) / 2 + 1));
        }


    }
}