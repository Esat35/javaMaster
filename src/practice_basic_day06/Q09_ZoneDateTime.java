package practice_basic_day06;

import java.time.LocalTime;
import java.time.ZoneId;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(saat);
    }
}
