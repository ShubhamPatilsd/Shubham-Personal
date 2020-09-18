import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Ball extends JPanel implements KeyListener {

    public Ball(){
        addKeyListener(this);

        setFocusable(true);
    }
    //private int playerx=100;
    private int playerx=42;
    //private int playery=675;
    private int playery=375;

    //private int floorheight=980;
    private int floorheight=544;

    private final int GRAVITY=1;
    private int pillarx=556;
    private int newpillarx;
    private int newpillary=0;
    private int pillary=0;
    private int secondpillar;
    private boolean up=false;
    private Random rand=new Random();
    private int firstpillarheight=rand.nextInt((306 - 56) + 1) + 56;
    private int thirdpillarheight=rand.nextInt((306 - 56) + 1) + 56;
    private int secondpillarheight;
    private int fourthpillarheight;
    private boolean gameover;
    private boolean userinput=true;
    private int gametextx;
    private int score=0;
    private boolean happened=true;
    private int fourthpillar;
    private boolean newpillars;

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        setBackground(Color.CYAN);



        g.setColor(Color.BLACK);
        g.fillRect(playerx,playery,20,20);
        Font scorefont=new Font("Helvetica",Font.PLAIN,36);
        g.setFont(scorefont);
        g.drawString(String.valueOf(score),765,35);

        g.setColor(Color.GREEN);

        g.fillRect(pillarx,pillary,29,firstpillarheight);
        secondpillar=(firstpillarheight)+56;
        secondpillarheight=600-firstpillarheight-56;

        g.fillRect(pillarx,secondpillar,29,secondpillarheight);
        if(newpillars) {
            g.fillRect(newpillarx, newpillary, 29, thirdpillarheight);
            fourthpillar = (thirdpillarheight) + 56;
            fourthpillarheight = 600 - thirdpillarheight - 56;

            g.fillRect(newpillarx, fourthpillar, 29, fourthpillarheight);
        }

        Color floorcolor=new Color(150,75,0);
        g.setColor(floorcolor);
        g.fillRect(0,floorheight,800,56);
        Color grasscolor=new Color(6,150,64);
        g.setColor(grasscolor);
        g.fillRect(0,floorheight,800,16);



        if(gameover){

            Font gameoverfont=new Font("Helvetica",Font.PLAIN,36);
            g.setFont(gameoverfont);
            g.setColor(Color.RED);

            g.drawString("GAMEOVER!!!\nPress 'p' to play again. Press 'q' to quit", pillarx-100,250);



        }
    }

public void movearound(JFrame frame) {

        if(gameover){
            gametextx=400;
            playerx=2000;
            playery=0;
            repaint();

        }


        try {
        TimeUnit.MILLISECONDS.sleep(5);
        if(playerx==pillarx || playerx==newpillarx){
            score++;
        }
        if(up){
          playery-=GRAVITY;
        }else{
            playery+=GRAVITY;
        }
        if(playery>=floorheight-14){
            playery=floorheight-14;

        }

        if(pillarx<0){
            pillarx=792;

            firstpillarheight=rand.nextInt((306 - 56) + 1) + 56;


        }
        if(pillarx==250){
            newpillars=true;
            newpillarx=800;
        }

        if(((playerx<=pillarx&&playerx>=pillarx-10) && playery>=0 && playery<=firstpillarheight+2) || ((playerx<=pillarx&&playerx>=pillarx-10) &&(playery<=600 && playery>=600-secondpillarheight+2))){
            TimeUnit.MILLISECONDS.sleep(200);
            gameover=true;
            userinput=false;

        }


        pillarx--;
        if(newpillars){
            newpillarx--;
        }
        //playerx++;

    }catch(Exception e){
      e.printStackTrace();
    }

    repaint();
    }


    @Override
    public void keyTyped(KeyEvent keyEvent) {
        //System.out.println(keyEvent.getKeyCode());

          if(keyEvent.getKeyCode()==32 && userinput){
            up=true;


          }else{
            up=false;
          }

          if(keyEvent.getKeyChar()=='q' && gameover){
              System.exit(0);
          }

        if(keyEvent.getKeyChar()=='p' && gameover){
            playerx=42;
            //private int playery=675;
              playery=375;

            //private int floorheight=980;
              floorheight=544;


             pillarx=556;
            pillary=0;
             secondpillar=0;
             up=false;

             firstpillarheight=rand.nextInt((306 - 56) + 1) + 56;
             secondpillarheight=0;
             gameover=false;
             userinput=true;
             gametextx=0;
             score=0;
             happened=true;


        }









            }





    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode()==32 && userinput){
            up=true;
        }else{
          up=false;
        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if(keyEvent.getKeyCode()==32 && userinput){
          up=false;
        }else{

        }
    }
}
