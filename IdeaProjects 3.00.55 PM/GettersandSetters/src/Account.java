import java.util.Scanner;
public class Account extends SignUp{


    String name;
    int age;





    public void setName() {
        Scanner naming = new Scanner(System.in);
        System.out.print("Create your username: ");
        String name = naming.nextLine();

    }

    public void setAge() {
        Scanner ageset = new Scanner(System.in);
        System.out.print("State your age: ");
        int age = ageset.nextInt();

        if (age<13){
            System.out.println("You are not eligible to sign up. You need to be 13 or over to sign up.");
        }


    }
    public void setPass(){
        Scanner passset = new Scanner(System.in);
        System.out.print("Create your password: ");

        String newpass = passset.nextLine();
        //newpass.char for char('*');
    }
    public String getname(){
        return name;
    }


    public void getDetails(){
        System.out.println(name+age);
    }



    public static void main(String args[]) {


        Account a = new Account();
        Scanner naming = new Scanner(System.in);


        a.signingup();

        a.setName();
        a.setAge();
        a.setPass();
        


    }
    }

