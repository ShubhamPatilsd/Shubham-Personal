package com.company;
import java.util.Scanner;

public class Main {
public static Scanner timeinput=new Scanner(System.in);
    public static void main(String[] args) {
	difference();
    }

public static void difference(){
    System.out.println("This is for the first time: ");
    System.out.print("Hours: ");
    int hours=timeinput.nextInt();
    System.out.print("Minutes: ");
    int minutes=timeinput.nextInt();
    if (minutes<0||minutes>=60) {System.out.println("You cannot have more than 60 minutes and less than 0 minutes."); System.exit(0);}
    System.out.print("Seconds: ");

    int seconds=timeinput.nextInt();
    if (seconds<0||seconds>=60) {System.out.println("You cannot have more than 60 seconds and less than 0 seconds."); System.exit(0);}

    System.out.println("This is for the second time: ");
    System.out.print("Hours: ");
    int hours2=timeinput.nextInt();
    System.out.print("Minutes: ");
    int minutes2=timeinput.nextInt();
    if (minutes2<0||minutes2>=60) {System.out.println("You cannot have more than 60 minutes and less than 0 minutes."); System.exit(0);}

    System.out.print("Seconds: ");
    int seconds2=timeinput.nextInt();
    if (seconds2<0||seconds2>=60) {System.out.println("You cannot have more than 60 seconds and less than 0 seconds."); System.exit(0);}

    int newhours=hours-hours2;
    if (newhours<0){
        int absoluteh=newhours-(newhours*2);
        int morehours=absoluteh;
        newhours=morehours;
    }
    int newminutes=minutes-minutes2;
    if (newminutes<0){
        int absolutem=newminutes-(newminutes*2);
        int moreminutes=absolutem;
        newminutes=moreminutes;
    }
    int newseconds=seconds-seconds2;
    if (newseconds<0){
        int absolutes=newseconds-(newseconds*2);
        int moreseconds=absolutes;
        newseconds=moreseconds;

    }
    System.out.println("The time difference is "+newhours+":"+newminutes+":"+newseconds);
    }



}
