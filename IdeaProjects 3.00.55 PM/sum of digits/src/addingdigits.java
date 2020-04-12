import java.util.Scanner;
public class addingdigits {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int scan1=scan.nextInt();
        String thenewscan=Integer.toString(scan1);
        int newscan=thenewscan.length();
        String scanning="hello";
        int scanning1=scanning.length();

        for(int i=0;i<newscan;i++) {
            char y = thenewscan.charAt(i);
            System.out.println(y);

        }
    }
}
