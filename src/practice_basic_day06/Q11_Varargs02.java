package practice_basic_day06;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {

        double sayı1=10;
        double sayı2=20;
        int sayı4=3;
        double sayı5=4;
        double sayı3=50;
        double sayı6=6;

        double carpım=sayılarıCarp(sayı1,sayı3,sayı6,sayı2,sayı4,sayı5);
        System.out.println(" carpımlar : "+carpım);
    }

    private static double sayılarıCarp(double... sayılar) {
        double carpım=1;
        for (double x : sayılar
             ) {
    carpım*=x;

        }
        return carpım;
    }


}
