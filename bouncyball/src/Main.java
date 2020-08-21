import javax.swing.*;

public class Main {

public static void main(String[] args){
    JFrame frame=new JFrame("Bouncy");
    frame.setResizable(true);
    frame.setSize(800,800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Ball b=new Ball();
    frame.add(b);
    frame.setVisible(true);
}
}
