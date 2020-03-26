import java.util.Scanner;

public class vowelcounter {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        //Takes input
        String userinput1 = userinput.nextLine();
        //Makes input lowercase
        userinput1 = userinput1.toLowerCase();
        int countVowels = 0;


        for (int i = 0; i < userinput1.length(); i += 1) {
            char userinput2 = userinput1.charAt(i);
            if (userinput2 == 'a' || userinput2 == 'e' || userinput2 == 'i' || userinput2 == 'o' || userinput2 == 'u') {
                countVowels++;
            }

        }
        System.out.println("There are " + countVowels + " vowels in this text");
    }
}
