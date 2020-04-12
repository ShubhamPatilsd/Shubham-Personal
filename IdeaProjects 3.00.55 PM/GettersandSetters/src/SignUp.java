import java.util.Scanner;

public class SignUp {
    public void signingup(){
        Scanner sign = new Scanner(System.in);
        System.out.print("Sign Up? To sign up, enter the code 4670 to make sure you are not a robot: ");

        int signup=sign.nextInt();

        if (signup==4670){

        }else{


            System.exit(0);
        }
    }
}
