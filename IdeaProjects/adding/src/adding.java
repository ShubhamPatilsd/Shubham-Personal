import java.util.Scanner;

public class adding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inumber = input.nextInt(); 

        int isum = 0;

        while (inumber > 0) {
            isum = isum + inumber;
            inumber -= 1;
        }
        System.out.println(isum);


    }
}
