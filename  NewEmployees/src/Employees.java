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
    setRobert();
    setSam();
    setJohn();
    ask();
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
        robert.yoj=1999;
        robert.salary=90000;
        robert.address="26B- WallsStreat";

    }

static void getRobert(){



    //System.out.println("Debug");
    //if (robert.name == test){

        System.out.println("Name\tYear\tSalary\t\tAddress\t\t");
        System.out.println(robert.name + "\t" + robert.yoj + "\t" + robert.salary + "\t\t" + robert.address);
    //}
}

static void ask(){
    System.out.print("Who would you like to get details on: ");
    String employee=nameinput.nextLine();


    System.out.println(nameinput);
    if(employee=="Robert"){
        getRobert();
    }
}


}


