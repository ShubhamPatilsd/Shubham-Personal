import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

public class Ball extends JPanel implements KeyListener {

    public Ball(){
        addKeyListener(this);

        setFocusable(true);
    }
    private int playerx=100;
    private int playery=675;
    private int jumpstrength;
    private int weight=10;
    private int floorheight=980;
    private boolean onfloor;
    private final int GRAVITY=1;
    private int pillarx=800;
    private int pillary=(int) (Math.random()*1080);
    private int secondpillar;
    private boolean up=false;

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,floorheight,1920,100);

        g.setColor(Color.BLACK);
        g.fillRect(playerx,playery,30,30);

        g.setColor(Color.GREEN);
        g.fillRect(pillarx,pillary,70,580);
        if(pillary<=1080/2){
            secondpillar=pillary+700;
        }else{
            secondpillar=pillary-700;
        }
        g.fillRect(pillarx,secondpillar,70,580);



        setBackground(Color.CYAN);
    }

public void movearound(JFrame frame) {
    try {
        TimeUnit.MILLISECONDS.sleep(5);
        if(up){
          playery-=GRAVITY;
        }else{
            playery+=GRAVITY;
        }
        if(playery>=floorheight-25){
            playery=floorheight-25;
            onfloor=true;
        }
        if(playery<floorheight-25){
            onfloor=false;
        }
        if(pillarx<0){
            pillarx=1900;
            System.out.println(pillary);
            if(pillary<600){
                pillary=(int) (Math.random()*1080);
            }
            if( pillary>=600){
                pillary=(int) (Math.random()*700);
            }

        }
        pillarx--;
        //playerx++;

    }catch(Exception e){
      e.printStackTrace();
    }

    repaint();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        //System.out.println(keyEvent.getKeyCode());

          if(keyEvent.getKeyCode()==32){
            up=true;
          }else{
            up=false;
          }









            }





    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode()==32){
            up=true;
        }else{
          up=false;
        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode()==32){
          up=false;
        }else{

        }
    }
}
