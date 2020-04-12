package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner inches=new Scanner(System.in);

    public static void main(String[] args) {
        convert();
    }
    public static void convert(){
        System.out.print("Enter the number you want to calculate: ");
        double inchinput=inches.nextDouble();
        double conversioncalculated=inchinput*0.0254;
        System.out.println(inchinput+" inches equals: "+conversioncalculated+" meters");

    }
}
