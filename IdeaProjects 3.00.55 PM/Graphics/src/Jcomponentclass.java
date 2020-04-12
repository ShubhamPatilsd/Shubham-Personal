import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyListener;



public class Jcomponentclass extends JComponent {
    public void paintComponent(Graphics g){

        Graphics2D g2=(Graphics2D) g;
        Rectangle rect1=new Rectangle(10,20,50,50);
        g2.setColor(new Color(154,76,76));
        g2.fillRect(10,20,50,50);
        g2.draw(rect1);

        Rectangle rectplatform=new Rectangle(400,600,90,800);
        Graphics2D g3=(Graphics2D) g;
        g3.setColor(Color.GRAY);
        g3.fillRect(400,600,90,800);
        g3.draw(rectplatform);
        /*Rectangle rectplatform1=new Rectangle(10,280,150,80);
        g3.fillRect(10,280,150,80);
        g3.draw(rectplatform1);*/










            }
            }







