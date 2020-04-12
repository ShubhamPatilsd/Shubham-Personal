import java.util.Scanner;
public class consonantCounter {
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     String userinput=input.nextLine();
     int inputlength=userinput.length();
     int vowels=0;
     int consonants=0;
     int specialcharacters=1;

     for (int i=0;i<inputlength;i+=1) {
         char characterspecific=userinput.charAt(i);
         if(characterspecific=='a'||characterspecific=='e'||characterspecific=='i'||characterspecific=='o'|| characterspecific=='u'){
             vowels+=1;
         }else if(characterspecific=='!'||characterspecific=='@'||characterspecific=='#'||characterspecific=='$'||characterspecific=='%'||characterspecific=='^'||characterspecific=='&'||characterspecific=='*'||characterspecific=='('||characterspecific==')'){
             specialcharacters+=1;
         }else{
             consonants+=1;
         }
     }
     System.out.println("OUt of loop");
     System.out.println(consonants);

    }

}
