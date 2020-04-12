import java.util.Scanner;
import java.util.Random;
public class thisishorrible {
    private static String[] characters={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9","!","@","#","$","%","^","&",".",",","_","-"};


    public static void main(String args[]){

    randomness();

    }
    public static void randomness(){
        Scanner password=new Scanner(System.in);

        int passencryp=password.nextInt();





        for(int i=0;i<passencryp;i++){





             Random itneger=new Random();



             int encrypty=itneger.nextInt(73);
            String encryptedpassword=characters[encrypty];





            System.out.print(encryptedpassword);

        }


    }
}
