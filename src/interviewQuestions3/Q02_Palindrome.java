package interviewQuestions3;

import java.util.Scanner;

public class Q02_Palindrome {
      /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("String bir ifade giriniz : ");
          String ifade = scan.nextLine();

          palindomeWithStringBuilder(ifade);
       palindromeWithForLoop(ifade);

      }

    private static void palindromeWithForLoop(String ifade) {
          String yeniIfade="";
        for (int i = ifade.length()-1; i >=0 ; i--) {
            yeniIfade+=ifade.charAt(i);
        }

        if (ifade.equalsIgnoreCase(yeniIfade))  {
            System.out.println("bu bir palındrom");
    }else System.out.println("bu bir palındrom degil!");
    }

    private static void palindomeWithStringBuilder(String ifade) {
          StringBuilder sb= new StringBuilder(ifade);
          if (sb.reverse().toString().equalsIgnoreCase(ifade)){
              System.out.println("bu bir palındrom");
          }else System.out.println("bu bir palındrom degil!");
    }

}
