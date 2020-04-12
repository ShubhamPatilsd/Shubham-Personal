package com.company;
import java.util.Scanner;

public class Main {
    static Scanner number=new Scanner(System.in);
    public static void main(String[] args) {
        comparing();
        signcheck();
        floydstriangle();
        calculator();
    }


static void comparing(){

    System.out.print("Enter the first number: ");
        double int1=number.nextDouble();
    System.out.println("");
    System.out.print("Enter the second number: ");
    double int2=number.nextDouble();
    System.out.println("");
    System.out.print("Enter the third number: ");
    double int3=number.nextDouble();




        if(int1>int2 && int1>int3){
            System.out.println(int1+" is the greatest");
        }else if(int2>int1 && int2>int3){
            System.out.println(int1+" is the greatest");
        }else if(int3>int1 && int3>int2){
        System.out.println(int3+" is the greatest");
    }else if(int1==int2 && int1==int3){
            System.out.println("They are all the same");
}

}
static void signcheck() {
    System.out.print("Enter number to check: ");
    int plusorminus = number.nextInt();
    if (plusorminus >0) {
        System.out.println("Your number is positive");

    } else if (plusorminus == 0) {
        System.out.println("Your number is zero. Zero is neither positive nor negative");
    } else if (plusorminus < 0) {
        System.out.println("Your number is negative");
    }
}

static void floydstriangle(){
    System.out.print("Enter number of rows: ");
        int rows=number.nextInt();
    int num=1;
    for(int i=1;i<=rows;i++){


        System.out.println("");


    for(int write=0;write<i;write++) {



        System.out.print(num+" ");

        num++;



    }



    }
    System.out.println("\n");
    }

static void calculator(){
    System.out.print("Enter your first number: ");
        double first=number.nextInt();
    System.out.print("Enter your second number: ");
    double second=number.nextInt();



        System.out.print("What do you want to do (+, -, *, or /): ");
        String input=number.next();
        switch(input){
            case("+"):
               double sum=first+second;
                System.out.println("The sum of "+first+" and "+second+" is "+sum);
                break;
            case("-"):
                double subtract=first-second;
                System.out.println("The subtraction of "+first+" and "+second+" is "+subtract);
                break;
            case("*"):
                double product=first*second;
                System.out.println("The product of "+first+" and "+second+" is "+product);
                break;
            case("/"):
                double quotient=first/second;
                System.out.println("The quotient of "+first+" and "+second+" is "+quotient);
                break;
        }

}
}