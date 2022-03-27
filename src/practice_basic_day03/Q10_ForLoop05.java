package practice_basic_day03;

import java.util.Scanner;

public class Q10_ForLoop05 {
   /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("1 den buyuk bır rakam gırınız : ");
        int rakam=scan.nextInt();
        int toplam=0;

        if (rakam>=0&&rakam<10){

            for (int i = 1; i <rakam ; i++) {
                toplam+=i*i;
            }

            System.out.println("1 den "+rakam+" rakamına kadar olana sayıların karelerı toplamı : "+toplam);
        }else System.out.println("hatalı verı gırısı yaptınız !");


    }

}
