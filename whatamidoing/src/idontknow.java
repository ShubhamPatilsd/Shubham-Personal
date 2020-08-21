
import java.util.Arrays;
import java.util.Scanner;
public class idontknow {
    static Scanner scanman=new Scanner(System.in);
    static String a=scanman.nextLine();
    static char[] b={'a','0'};
    static int len=b.length-b.length;
    static char d;
    static char c;
 public static void main(String args[]){
     scan();
 }
public static void scan(){
     for(int i=0;i<26;){
         c=b[len];
         if(c==a.charAt(len)){
             b[len]=c;
             System.out.print(c);


             len++;
             for(int j=0;j<9;){
                 d=b[len]+=1;
                if(d == a.charAt(len)){
                    b[len]=d;
                    System.out.print(d);
                }else{
                    d=b[len]+=1;
                }
             j++;
             }
         }else{
             c=b[len]+=1;
         }
     i++;
     }
    //String strc=Character.toString(c);
    //String strd=Character.toString(d);
     //System.out.println(b);

}

}
