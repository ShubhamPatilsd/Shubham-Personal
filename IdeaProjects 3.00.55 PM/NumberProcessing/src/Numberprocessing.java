import java.util.Scanner;

public class Numberprocessing {
    public static void main(String[] args) {
        Scanner integerinput = new Scanner(System.in);
        int n = integerinput.nextInt();
        while(n>1) {
            n--;

            if (n % 2 == 0) {
                n/=2;



            } else {
                n = 3 * n + 1;


            }

        }
        System.out.println(n);



        }


        /*for (int i = n; i >= 1; i -= 1) {
            if (n % 2 == 0) {
                int result = n / 2;
                System.out.println(result);

            } else {
                int result = 3 * n + 1;
                System.out.println(result);
            }
        }
    */
    }






