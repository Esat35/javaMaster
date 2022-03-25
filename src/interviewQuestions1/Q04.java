package interviewQuestions1;

import java.util.Scanner;

public class Q04 {
    //// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String pin = "hasan1201";
        int girisHakkı = 3;

        System.out.println("***** hos geldınız *****");

        while (true) {
            System.out.print("pın kodunuzu gırınız : ");
            String girilenKod = scan.nextLine();

            if (girilenKod.equals(pin)) {
                System.out.println("basarılı gırıs yaptınız...");
                break;
            } else {
                girisHakkı--;
                System.out.println("hatalı gırıs yaptınız!");
                System.out.println("kalan giriş hakkınız : " + girisHakkı);
            }
            if (girisHakkı == 0) {
                System.out.println("gırıs hakkınız kalmadı... kartınız bloke oldu");
                break;
            }
        }


    }
}
