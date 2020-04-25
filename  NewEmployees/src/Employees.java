import java.util.Scanner;


public class Employees {

    static Employees robert=new Employees();
static Employees sam=new Employees();
static Employees john=new Employees();
public static String name;
public static int yoj;
public int salary;
public String address;
    public static Scanner nameinput=new Scanner(System.in);
public static void main(String args[]){


    setdetails();

    while(true) ask();
}

public static void setdetails(){
    setRobert();
    setSam();
    setJohn();
}
public static void setRobert(){
    robert.name="Robert";
    robert.yoj=1994;
    robert.salary=90000;
    robert.address="64C- WallsStreat";

}
    public static void setSam(){
        sam.name="Sam";
        sam.yoj=2000;
        sam.salary=75000;
        sam.address="68D- WallsStreat";

    }

    public static void setJohn(){
        john.name="John";
        john.yoj=1999;
        john.salary=90000;
        john.address="26B- WallsStreat";

    }

static void getRobert(){
    System.out.println("Name\tYear\tSalary\tAddress\t\t");
    System.out.println(robert.name + "\t" + robert.yoj + "\t" + robert.salary + "\t\t" + robert.address);
}

    static void getSam(){
        //System.out.println("You are in Sam");
    System.out.println("Name\tYear\tSalary\tAddress\t\t");
        System.out.println( "You are in sam"+sam.name);
    System.out.println(sam.name + "\t" + sam.yoj + "\t" + sam.salary + "\t\t" + sam.address);

    }

    static void getJohn(){
        System.out.println("Name\tYear\tSalary\tAddress\t\t");
        System.out.println(john.name + "\t" + john.yoj + "\t" + john.salary + "\t\t" + john.address);
    }

static void ask(){
    System.out.print("Who would you like to get details on: ");
    String employee=nameinput.nextLine();




    switch(employee){
        case("Robert"):
            getRobert();
            System.out.println("");
            break;
        case("Sam"):
            getSam();
            System.out.println("");
            break;
        case("John"):
            getJohn();
            System.out.println("");
            break;
    }
}


}


