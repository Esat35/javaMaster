package interviewQuestions3;

public class Q06_MultiDimensolArray {
        /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */
        public static void main(String[] args) {
            int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};

            System.out.println("eleman sayisi " + elemanSayisi(arr)); //eleman sayisi 13


        }

    private static int elemanSayisi(int[][] arr) {
            int elemeanSayısı=0;

        for (int [] each:arr) {
            elemeanSayısı +=each.length;
        }

            return elemeanSayısı;

    }


}
