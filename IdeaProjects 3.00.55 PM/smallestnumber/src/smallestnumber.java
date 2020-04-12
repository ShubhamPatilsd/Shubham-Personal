import java.util.Scanner;
public class smallestnumber {
    public static void main(String[] args){
        while(true) {
            Scanner scan1 = new Scanner(System.in);


            System.out.println("Enter the first number: ");
            int scan11 = scan1.nextInt();
            System.out.println("Enter the second number: ");
            int scan22 = scan1.nextInt();
            System.out.println("Enter the third number: ");
            int scan33 = scan1.nextInt();
            if (scan11 <= scan22 && scan11 <= scan33) {
                int y = scan11;
                System.out.println("The smallest number is: " + y);
            } else if (scan22 <= scan11 && scan22 <= scan33) {
                int y = scan22;
                System.out.println("The smallest number is: " + y);

            } else if (scan33 <= scan22 && scan33 <= scan11) {
                int y = scan33;
                System.out.println("The smallest number is: " + y);
            }else if(scan33==scan22 && scan33==scan11){
                System.out.println("There is no smallest number. All of them are the same.");
            }

        }
    }
}
