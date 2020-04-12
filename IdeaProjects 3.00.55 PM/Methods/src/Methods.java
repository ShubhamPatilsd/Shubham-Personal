public class Methods {

    public static void main(String[] args){
        //Welcome();
        System.out.println("Welcome to this calculator. This is a method.");
        multiply(5,10);
        multiply(2,3);
        multiply(6,8);
        divide(20, 5);
        divide(100,10);
        divide(66,11);
        //Welcome();

        System.out.println("........................" +
                "...........................");
        Welcome(3);
        Welcome(5);


    }
    public static void Welcome(int a){
        String hi= "Welcome to this calculator. This is a method.";
        for (int i=a;i>0;i--){
            System.out.println(hi+i);


        }

    }
    public static void multiply(int a, int b) {
        System.out.println(a * b);


    }
    public static void divide(int a, int b){
        System.out.println(a/b);
    }

}

