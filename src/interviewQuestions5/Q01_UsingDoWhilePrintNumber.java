package interviewQuestions5;

import java.util.Scanner;

public class Q01_UsingDoWhilePrintNumber {
    /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

    public static void main(String[] args) {
        int sayı=4;

        do{
            System.out.print(sayı+" ");
            sayı+=5;
        }while(sayı<100);
    }
    }


