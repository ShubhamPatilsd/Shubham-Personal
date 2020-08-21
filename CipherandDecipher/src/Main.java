import org.w3c.dom.ls.LSOutput;

public class Main {
    static String secret="Hello how is everything going?";
    static String publicsecret="Mjqqt%mt|%nx%j{jw~ymnsl%ltnslD";




    public static void main(String[] args) {
        cipher();




        decipher();
    }
    public static void cipher(){
        char[] chararray=secret.toCharArray();
        for(char c : chararray){

            c+=5;
            System.out.print(c);

        }
        System.out.println();
    }
    public static void decipher(){
        char[] chararray=publicsecret.toCharArray();
        for(char c : chararray){

            c-=5;
            System.out.print(c);
        }
    }

}
