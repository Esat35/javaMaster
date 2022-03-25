package practice_basic_day03;

import java.util.Scanner;

public class Q11_ForLoop06 {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("satır numarası : ");
        int satır=scan.nextInt();
        System.out.print("sutun numarası : ");
        int sutun=scan.nextInt();

        for (int i = 0; i <satır ; i++) {
            for (int j = 0; j <sutun ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }



    }


}
