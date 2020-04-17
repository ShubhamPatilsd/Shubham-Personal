package com.company;
import  java.util.Scanner;


public class Main {
static Scanner userinput=new Scanner(System.in);
    public static void main(String[] args) {
//divideandremainder();
ascii();
    }

public static void divideandremainder (){
    System.out.print("Input your first number: ");
        int divide1= (int) userinput.nextDouble();
    System.out.print("Input your first number: ");
        int divide2= (int) userinput.nextDouble();

        int quotient=divide1/divide2;
        int remainder=divide1%divide2;
    System.out.println("Quotient of "+divide1+" and "+divide2+" is: "+quotient);
    System.out.println("Remainder of "+divide1+" and "+divide2+" is: "+remainder);
}
public static void ascii(){
        String input=userinput.next();
        char val=input.charAt(0);
        int value=val;

    System.out.println(value);
}



public static void lcm() {

}


}
