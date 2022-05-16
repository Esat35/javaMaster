package interviewQuestions1;

import java.util.*;

public class Q01_CountsOfCharacters {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bır cumle gırınız : ");
        String str = scan.nextLine();

        karakterSayısıBul(str);


    }

    private static void karakterSayısıBul(String str) {
        String strArr[] = str.split("");
        List<String> harfList = new ArrayList<>();

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        int count = 0;

        for (int i = 0; i <strArr.length-1 ; i++) {
            if (strArr[i].equals(strArr[i + 1])){
                count++;
            }else  {
                System.out.println(strArr[i]+" harfinden "+(count+1)+ " adet var");
                count = 0;
            }
            if (i==strArr.length - 2){
                System.out.println(strArr[i]+" harfinden "+(count+1)+ " adet var");
            }
        }
    }

}


