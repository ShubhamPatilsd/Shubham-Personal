import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class sickmoves extends JPanel implements KeyListener, ActionListener {
    int delay=15;
    Timer t=new Timer(delay,this);

    private int x=340;
    private int y=558;
    private int vx=30;
    private int yx=10;
    private int counter=0;


    private int bluey= 2;

    private int randx=(int) (Math.random()*750);

    private int randy=0;

    public sickmoves(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }



    public void paintComponent(Graphics g){
        t.start();
        //System.out.println(randx);

        if(randx%2==0){

            vx=8;
        }
        //System.out.println(vx);
        super.paintComponent(g);


        g.setColor(Color.RED);
        g.fillRect(x,y,30,30);


        g.setColor(Color.BLUE);
        g.fillRect(randx,randy,30,30);

        g.setColor(Color.BLACK);
        String counterstr=String.valueOf(counter);
        g.setFont(new Font("Helvetica",Font.BOLD,23));

        g.drawString("Counter: "+counterstr,340,20);

    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        char key=keyEvent.getKeyChar();



        if(key=='d' && x>=0 && x<=800){
            x+=vx;
            repaint();
            //System.out.println(x+" "+y);

            /*if(x==randx && y==randy){
                System.out.println("You Lose");
            }*/
        }

        if(key=='a' && x>=0 && x<=800){
            x-=vx;
            repaint();
            //System.out.println(x+" "+y);

        }

        /*if(key=='w' && y>=0 && y<=600){
            y-=yx;
            repaint();
            //System.out.println(x+" "+y);

        }*/

        /*if(key=='s' && y>=0 && y<=600){
            y+=vx;
            repaint();
            System.out.println(x+" "+y);

        }*/
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(x>=758){
            x=758;
        }
        if(x<=0){
            x=0;
        }

        if(y<=0){
            y=0;
        }

        if(y>=558){
            y=558;
        }






        randy+=bluey;
        //System.out.println(randy);

        if(x>=randx-30 && x<=randx+30 && y==randy+4){
            //System.out.println("In the loop");
            counter+=5;
            File bloop=new File("bloop.wav");
            Sound.playSound(bloop);
            boolean ishundred=false;
            if(counter>=100 && ishundred==false){
                ishundred=true;
                delay-=5;
            }
        }



        if(randy>=558){
            randy=0;
            randx=(int) (Math.random()*751);
            //System.out.println("In the loop");
        }


        repaint();

    }
}
