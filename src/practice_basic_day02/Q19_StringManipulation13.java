package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("4 harfli bir kelime giriniz : ");
        String str=scan.next();

        String tersStr=str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1)+
        str.substring(str.length()-3,str.length()-2)+str.substring(str.length()-4,str.length()-3);

        System.out.println(tersStr);


    }
}
