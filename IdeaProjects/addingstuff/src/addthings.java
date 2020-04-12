import java.util.ArrayList;
import java.util.Scanner;

public class addthings {
static Scanner inputting=new Scanner(System.in);
public static void main(String args[]){
additionthings();
factorial();
fibonacci();
}
public static void additionthings(){
    System.out.print("Input number for the sum: ");
    int a=inputting.nextInt();
    for(int i=a;i>0;){
        a--;
        a+=i;
        i--;
    }
    System.out.println("sum is: " +a);
}
static int hi=1;
static int heys=1;




public static void factorial(){
    System.out.print("Input number for the factorial: ");
    int a=inputting.nextInt();
    for(int i=0;i<a;i++){







            hi=i*heys;





            heys+=hi;






        }
        System.out.println("product is: " +heys);
    }
public static void fibonacci(){
    System.out.print("Input number for the Fibonnaci: ");
    int a=inputting.nextInt();
    int numbers[] = new int[a];
    int start=0;
    int first=1;
    ArrayList arr=new ArrayList();
    arr.add(start);
    arr.add(first);


    for(int i=0;i<a-2;i++){
    int b= (int) arr.get(i);
    int c=(int) arr.get(i+1);
    int d=b+c;
    arr.add(d);



    }
    System.out.print("First "+a+" numbers are: ");
    for(int i=0;i<a;i++){
        if(i==a-1) {
            System.out.print("and " +arr.get(i));
            break;
        }
        System.out.print(arr.get(i)+", ");



    }



}
}
