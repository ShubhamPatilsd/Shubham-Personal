//Reverses the inputted string


import java.util.Scanner;
import java.lang.StringBuffer;


public class systemoutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String s=scan.nextLine();

        StringBuffer snew = new StringBuffer(s);

        snew.reverse();
        System.out.println(snew);





    }
}


