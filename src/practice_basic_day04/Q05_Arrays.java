package practice_basic_day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner scan=new Scanner(System.in);

        int arr[]=new int[8];
        int kacTane=0;

        for (int i=0; i<arr.length; i++){
            System.out.print((i+1)+". elemanı gırınız : ");
            int eleman= scan.nextInt();
            arr[i]=eleman;
            if (eleman%3==0){
                kacTane++;
         }
        }

        System.out.println(Arrays.toString(arr)+"\narray'inde 3'e bolunen eleman sayısı: "+kacTane);

    }
}
