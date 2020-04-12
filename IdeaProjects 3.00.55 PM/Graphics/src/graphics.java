import javax.swing.JFrame;
import java.awt.*;

public class graphics {
    public static void main(String[] args){
       JFrame window=new JFrame();
       window.setSize(1920,1080);
       window.setTitle("Gotem");
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.getContentPane().setBackground(Color.DARK_GRAY);
       window.setVisible(true);
       Jcomponentclass rectangle=new Jcomponentclass();
       window.add(rectangle);
       window.add(rectangle);


    }
}

