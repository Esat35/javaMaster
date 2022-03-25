package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */


        Scanner scan = new Scanner(System.in);

        System.out.print("olusturmak istedıgınız listenin boyutunu gırınız : ");
        int listLength = scan.nextInt();


        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < listLength; i++) {
            System.out.print((i + 1) + "." + " elemanı gırınız : ");
            list.add(scan.nextInt());
        }

        TekrarliEleman(list);


    }

    private static void TekrarliEleman(List<Integer> list) {
        List<Integer> tekrarliList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && !tekrarliList.contains(list.get(i))) {
                    tekrarliList.add(list.get(i));
                }
            }
        }
        System.out.println(" tekrarlı listenın elemanları : " + tekrarliList);
    }
}
