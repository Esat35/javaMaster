package practice_basic_day03;

import java.util.Scanner;

public class Q16_DoWhileLoop02 {
    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir kelime giriniz : ");

        String kelime = "";

        do {
            kelime = scan.next();
            if (kelime.length() > 3 && kelime.length() % 2 != 0) {
                System.out.println("kelımenın ortasındakı har : " + kelime.substring(kelime.length() / 2, kelime.length() / 2 + 1));

            } else {
                System.out.println("hatalı kelıme gırısı!");
            }
        } while (kelime.length() >= 3&&kelime.length() % 2 != 0);

    }

}
