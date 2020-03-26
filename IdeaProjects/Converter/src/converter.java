import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Takes input from user
        System.out.print("Enter the number of inches: ");
        int input1 = input.nextInt();
        //Does conversion equation
        double conversion = input1 * 0.0254;
        //Prints out answer
        System.out.println(input1+" inches is equal to "+conversion+" meters");

    }
}
