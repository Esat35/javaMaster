package interviewQuestions3;

import java.util.Scanner;

public class Q03_WhileCountSum {
    //  Kullanicidan toplanmak uzere sayilar isteyin
    // sayi adedi 10'u gecerse veya toplam 500 'u gecerse
    // bu kadar sayi yeter
    // ".. adet sayi girdin, toplami..." yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayıAdedi = 0;
        int toplam = 0;
        while ((sayıAdedi <= 10 )) {
            System.out.print("toplamak için bir sayı gırınız : ");
            int sayi = scan.nextInt();
            sayıAdedi++;

                toplam += sayi;


            if (toplam>500){
                break;
            }
        }
        System.out.println(sayıAdedi + " sayı gırdın, toplamları : " + toplam);
    }
}
