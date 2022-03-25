package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir String giriniz : ");
        String str = scan.nextLine();
        if (str.length() == 0) {
            System.out.println("girilen String boş");
        } else {
            System.out.println("girilen String bos degil.");

        }

            if (str.contains(" ")) {
                System.out.println("cumle bosluk içeriyor.");
            } else {
                System.out.println("cumle boşluk içermiyor");
            }
        }
    }

