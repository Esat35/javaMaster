package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("cm olarak uzunlugu ve yapmak ıstedıgıız ıslemi yazınız  ");
        System.out.print("uzunluk : ");
        double uzunluk=scan.nextDouble();
        System.out.print("1.Metreye cecir \n2.Km ye cevir.\n\nLüyfen işleminizi secınız : ");
        int ıslem=scan.nextInt();

        donustur(ıslem,uzunluk);




    }

    private static void donustur(int ıslem, double uzunluk) {

        switch(ıslem) {
            case 1:
                System.out.println(uzunluk+" cm : "+(uzunluk/100)+" metredir.");
                break;
                case 2:
                    System.out.println(uzunluk+" cm : "+(uzunluk/10000)+" km'dir.");
                    break;
                    default:
                        System.out.println("hatalı işlem secımı yaptınız ");
        }
    }


}