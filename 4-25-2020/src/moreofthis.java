import java.security.cert.TrustAnchor;
import java.util.Arrays;

public class moreofthis {
    static int[] search={1,2,3,4,5,6,7,8,9,0};
public static void main(String args[]){

    getFirstnumber(search);
    nextEdge(5,6);
    modulus(4,2);
}



    static void getFirstnumber(int [] arr){
    int u=arr[0];
    System.out.println(u);
}

static void nextEdge(int a, int b){
    System.out.println(a+b-1);
}
    static void modulus(int a, int b){
     if(a%b==0){
         System.out.println(true);
     }else{
         System.out.println(false);
     }
    }

}

