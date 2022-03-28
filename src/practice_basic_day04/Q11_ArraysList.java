package practice_basic_day04;

import java.util.*;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim


        // 2. adim


        // 3. adim


        // 4. adim
Random rndm=new Random();
        Scanner scan = new Scanner(System.in);
        List<String> kullanıcılar = new ArrayList<>(Arrays.asList("ali", "hasan", "muhsin", "dilara", "dilek", "ahmet", "mehmet", "ayse"));
        System.out.print("kullanıcı adınızı gırınız : ");
        String isim = scan.nextLine().trim();


        if (kullanıcılar.contains(isim)){
            System.out.println("Bu kullanıcı adı zaten alınmıs");
            System.out.println("yeni kullanıcı adı olarak bunu kullanabilirsiniz : "+isim+rndm.nextInt(100));
        }else{
            System.out.println("Bu kullanıcı adını kullanabilisiniz");
            System.out.println("yeni kullanıcı adı : "+isim);
        }


    }
}
