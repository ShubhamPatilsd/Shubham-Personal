import java.util.ArrayList;

class Main {
    public static ArrayList password=new ArrayList();
    static String apassword="something";
    public static void main(String[] args) {
        encrypt();


    }
    static void encrypt(){
        for(int i=0;i<apassword.length();){
            char newchar=apassword.charAt(i);
            newchar++;
            password.add(newchar);
            i++;
        }
        System.out.println(password);
    }



}