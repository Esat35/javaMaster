package practice_basic_day02;

import java.util.Scanner;

public class Q14_StringManipulation08 {

    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("num1 : ");
String num1=scan.next();
        System.out.println("num2 : ");
        String num2=scan.next();


        if (num1.length()%2==0){
            num1=num1.substring(0,num1.length()/2)+num2+num1.substring(num1.length()/2);
            System.out.println(num1);
        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }


    }
}
