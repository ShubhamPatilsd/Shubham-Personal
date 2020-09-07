import javax.swing.*;
import java.awt.*;

public class Main{

public static void main(String[] args){
    JFrame frame=new JFrame("Bouncy");

    frame.setResizable(false);
    frame.setSize(1920,1080);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    Ball b=new Ball();

    frame.add(b);




    frame.setVisible(true);
    while (true){
        b.movearound(frame);

    }

}




}
