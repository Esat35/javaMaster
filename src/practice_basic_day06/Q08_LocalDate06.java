package practice_basic_day06;

import java.time.LocalDate;

public class Q08_LocalDate06 {

    // Bugunun tarihi aliniz, yazdiriniz...
    // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
    // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();
        System.out.println(trh);

        trh=trh.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println(trh);

        trh=trh.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println(trh);


    }
}
