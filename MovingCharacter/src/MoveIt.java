import javax.swing.*;

public class MoveIt {
    public static void main(String args[]){
        JFrame frame=new JFrame("Move it");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setFocusable(true);
        frame.setResizable(true);
        sickmoves s=new sickmoves();
        frame.add(s);
        frame.setSize(800,750);

        frame.setVisible(true);
    }
}
