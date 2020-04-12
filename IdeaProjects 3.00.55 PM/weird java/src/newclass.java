import javax.swing.*;
import java.awt.*;
public class newclass {
public static void main(String args[]){
    //System.out.println("Hello World");
}
public static void newmethod(){
    for(int i=10; i<20;i++){
        System.out.println("Minecraft");
    }
}



    public class window {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
            f.setSize(600, 600);
            player p = new player();
            f.add(p);

            keyconfigofplayer key = new keyconfigofplayer();
            p.add(key);
            f.add(key);

        }
    }



    public class player extends JPanel {

        int x = 50;
        int y = 50;

        public void paint() {//This is where the graphic is painted to the screen
            repaint();
        }

        public void paintComponent(Graphics g) {
            //This is where the graphic is 'manufactured'
            super.paintComponent(g);
            g.setColor(Color.GREEN);
            int width = 20;
            int height = 20;
            g.fillRect(x, y, width, height);

            int width2 = 10;
            int height2 = 10;
            g.fillOval(x, y, width2, height2);

        }
    }
}
