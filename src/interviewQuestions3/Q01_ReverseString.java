package interviewQuestions3;

public class Q01_ReverseString {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak


     String    str="hersey cok guzel olacak.";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("sb = " + sb);
        sb.reverse();

        System.out.println("sb tersten : " + sb);


        //2. yol
        System.out.print("2.yol ıle : ");
        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.substring(str.length()-1-i,str.length()-i));
        }

//3. yol
        System.out.println();
        terstenYaz(str);

    }


    public static void terstenYaz(String str){
        System.out.print("3.yol ıle : ");
        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));
        }
    }

}
