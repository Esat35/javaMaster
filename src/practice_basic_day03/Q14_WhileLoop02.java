package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı gırınız : ");
        int sayı=scan.nextInt();

        int count=0;

        while (count<=sayı){

            if (count%2!=0){
                System.out.print(count+" ");

            }
            count++;
        }



    }


}
