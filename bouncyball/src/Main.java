import javax.swing.*;
import java.awt.*;

public class Main{
    public static boolean init=true;

public static void main(String[] args){
    JFrame frame=new JFrame("Bouncy");

    frame.setResizable(false);
    frame.setSize(800,600);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    //j.showConfirmDialog(null,"Do you want to play?");


    Ball b=new Ball();

    frame.add(b);




    frame.setVisible(true);
    while (true){
        b.movearound(frame);


    }

}




}
