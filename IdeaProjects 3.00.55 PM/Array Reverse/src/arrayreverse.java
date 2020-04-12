import java.util.Scanner;
public class arrayreverse {
    public static void main(String[] args) {




        int[] number = {8, 9, 10, 11, 12, 13, 14, 15, 16};

        System.out.print("The reversed string is: (");
        for (int i = number.length - 1; i >= 0; i -= 1) {



            if (i==0){

                System.out.print(number[i]+")");
            }else{

                System.out.print(number[i]+", ");
            }
        }
    }
}
