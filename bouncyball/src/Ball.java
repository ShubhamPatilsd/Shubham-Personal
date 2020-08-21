import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ball extends JPanel implements ActionListener {
int x=0;
int y=0;
int velx=15;
int vely=15;
Timer t=new Timer(5,this);

public void paintComponent(Graphics g){
    t.start();
    super.paintComponent(g);

    g.setColor(Color.BLACK);
    g.fillRect(x,y,50,50);

}


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    if(x<0 || x>750){
        velx=-velx;
    }

    if(y<0 || y>750){
            vely=-vely;
        }

    x+=velx;
        y+=vely+1;

        repaint();
    }
}
