package interviewQuestions4;

public class Q06_MultipleMethodVarargs {
    /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */

    public static void main(String[] args) {
        System.out.println(ortalamaBul(6, 4, 3, 5));
    }

    private static int ortalamaBul(int...sayi) {
        int toplam = 0;
        int ortalama=0;
        for (int each:sayi
             ) {
            toplam +=each;
        }

        return ( ortalama=toplam/sayi.length);
    }

}
