package interviewQuestions4;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q01_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {

        int arr[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        List<Integer> tekrarsızList=new ArrayList<>();

        for (int each:arr
             ) {
           if (!tekrarsızList.contains(each)){
               tekrarsızList.add(each);
           }

        }
        System.out.println("tekrarsız elemanlar : "+tekrarsızList);


        ////////////////////////////    ikinci yol     ////////////////////////////////////////////

        System.out.println("*******  set ile cözüm   ********");
        Set tekrarsızElemanlar=new HashSet();

        for (int each:arr) {
            tekrarsızElemanlar.add(each);

        }
        System.out.println("Set ile sonuc : "+tekrarsızElemanlar);
    }
}
