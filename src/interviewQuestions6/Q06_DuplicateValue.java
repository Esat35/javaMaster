package interviewQuestions6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06_DuplicateValue {
    /*
     Write a code that returns the duplicate chars in a String array.
     (interview Question)
     Input :
     String str=“Javaisalsoeasy”
     Output: [a, s]
      */
    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        List<String> tekarlıElemanlar = new ArrayList<String>();
        ;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (!tekarlıElemanlar.contains(str.substring(i,i+1))) {
                        tekarlıElemanlar.add(str.substring(i, i + 1));
                    }
                }
            }

        }
        System.out.println("tekrarlı olan elemanlar : "+tekarlıElemanlar);

    }
}

