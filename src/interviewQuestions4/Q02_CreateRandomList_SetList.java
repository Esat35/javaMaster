package interviewQuestions4;

import java.util.ArrayList;


import java.util.ArrayList;
import java.util.List;


public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        randomEkle(list);

    }

    private static void randomEkle(List<Integer> list) {

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*20));

        }
        System.out.println("listenin ilk hali : " + list);
        boolean ciftVarMı = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, 111);
                ciftVarMı = false;
            }
        }

        System.out.println("Listenın son hali : "+list);

        if (ciftVarMı) {
            System.out.println("cift sayı yoktur.");
        }
    }


}
