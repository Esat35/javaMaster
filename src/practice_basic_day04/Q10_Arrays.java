package practice_basic_day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */

        Scanner scan=new Scanner(System.in);
        System.out.print("bır cumle gırınız : ");
        String str=scan.nextLine();

        String[]arr=str.split(" ");

        System.out.println(Arrays.toString(arr));
        int karakterSayısı=0;

        for (int i = 0; i <arr.length ; i++) {
            karakterSayısı+=arr[i].length();

        }
        System.out.println("girdiğiniz cumledekı boşluk dısındakı karakter sayısı : "+karakterSayısı);
    }
}
