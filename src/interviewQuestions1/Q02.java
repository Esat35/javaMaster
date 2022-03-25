package interviewQuestions1;
import java.util.Scanner;
public class Q02 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bİr string giriniz :");
        String str = scan.nextLine();
        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();

      //  ilkSonHarf(str, sayi);   method olusturmak ıcın yazdık

        System.out.println("girilen stringin ilk ve son harfinin istenen sayi kadar birlesik hali :" +ilkSonHarf(str,sayi));
    } //main Sonu



    private static String ilkSonHarf(String str, int sayi) {
        String s = str.substring(0,1) + str.substring(str.length() - 1);
        String b = "";
        for (int i = 1; i <=sayi; i++){
            b+=s ; // b= b+s
        }
        return b;
    }
}
