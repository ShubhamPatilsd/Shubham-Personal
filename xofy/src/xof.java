import java.util.Random;
public class xof {
static boolean trueing=true;
static Random rand=new Random();
static int y;
static int x;
public static void main (String args[]){
xofy();
}

public static void xofy(){
   while (trueing=true) {
        x=rand.nextInt();
        y =rand.nextInt();

       double xdiv = x / 100;
       double ydiv = y / 100;
       //System.out.println(x+" "+y);
       if (xdiv * y != ydiv * x) {
           System.out.println(x + " and " + y);

       }else{
           System.out.println(" ");
       }
   }
}
}
