public class Vars {
public static void main(String args[]){
    int var1=5;
    int var2=10;
    add(5,10);
    subtract(5,10);
    times(5,10);
    divide(5,10);
    
}

    public static void add(int a, int b){
        int sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }
    public static void subtract(int a, int b){
        int sub=a-b;
        System.out.println("The subtraction of "+a+" and "+b+" is: "+sub);
    }
    public static void times(int a, int b){
        int multiply=a*b;
        System.out.println("The product of "+a+" and "+b+" is: "+multiply);

    }
    public static void divide(float a, float b){
        float div=a/b;
        System.out.println("The quotient of "+a+" and "+b+" is: "+div);
    }
}
