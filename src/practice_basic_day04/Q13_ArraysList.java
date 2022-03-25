package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
int arr[]={1,2,3,4,5,6,7,8};
        Scanner scan=new Scanner(System.in);
        System.out.print("maximum olan kac sayı goruntıulemek ıstıyorsunuz : ");
        int n=scan.nextInt();

        if (n>arr.length){
            System.out.println("arrayın boyutundan fazla eleman istiyorsunuz. o kadar eleman yok.");
        }else{
            Arrays.sort(arr);
            for (int i = 0; i <arr.length ; i++) {
              if (i>=arr.length-n){
                  System.out.print(arr[i]+" ");
              }


            }

        }


    }

}
