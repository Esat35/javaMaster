package practice_basic_day02;

import java.util.Locale;
import java.util.Scanner;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("gun ısmı gırınız : ");
        String day = scan.next().toLowerCase(Locale.ROOT);
        switch (day) {
            case "pazartesi":
            case "sali":
                System.out.println(" Java dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "carsamba":
            case "cumarresi":
                System.out.println(" SQL dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");

        }


    }
}
