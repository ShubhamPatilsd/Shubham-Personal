import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class sickmoves extends JPanel implements KeyListener, ActionListener, MouseListener {
    int delay = 15;
    Timer t = new Timer(delay, this);


    private int x = 340;
    private int y = 558;
    private int vx = 30;
    private int yx = 10;
    private int counter = 0;
    private int lives = 3;
    private boolean gameover = false;
    private boolean has = false;
    private boolean gamestart=true;
    private int mousex;
    private int mousey;
    private boolean anotherlife=false;
    //private boolean rules=false;
    private boolean rules=false;
    //private int i=0;
    private int i=0;
    private int j=0;



    private int bluey = 3;
    private int bady = 4;
    private int startingy = 0;
    private int greeny=0;
    private int anothery=0;
    private int anotherspeed=5;


    private int randx = (int) (Math.random() * 750);
    private int badx = (int) (Math.random() * 750);
    private int newx=(int)(Math.random()*750);
    private int greenx=(int)(Math.random()*750);
    private int randy = 0;

    private File select=new File("selectcharacter.wav");

    public sickmoves() {
        addKeyListener(this);
        addMouseListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }


    public void paintComponent(Graphics g) {
        t.start();

        if (this.gameover == false && this.gamestart==false ) {

            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.fillRect(x, y, 30, 30);

            g.setColor(Color.YELLOW);
            g.fillRect(randx, randy, 30, 30);



            g.setColor(Color.BLACK);
            g.drawString("Made by: Shubham Patil",630,720);
            String counterstr = String.valueOf(counter);
            g.setFont(new Font("Helvetica", Font.BOLD, 23));
            g.drawLine(0,588,800,588);

            g.drawString("Points: " + counterstr + "     Lives: " + lives, 250, 20);

            g.setColor(Color.RED);
            g.fillRect(badx, startingy, 30, 30);


            g.fillRect(newx, anothery, 30, 30);

                if(anotherlife) {
                    g.setColor(Color.GREEN);
                    g.fillRect(greenx, greeny, 30, 30);

                }

        }
        if (this.gameover && gamestart==false) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.drawString("Made by: Shubham Patil",630,720);

            g.setColor(Color.ORANGE);
            String gamestring = "GAME OVER";
            g.setFont(new Font("Helvetica", Font.BOLD, 46));
            g.drawString(gamestring, 400, 350);

            g.setColor(Color.GREEN);
            g.drawString("Play Again",400,400);

            g.setColor(Color.RED);
            g.drawString("Quit",400,458);


            g.setColor(Color.BLACK);
            g.drawString("You scored "+counter+" points",20,200);

            if(has==false) {

                File gamefile = new File("gameoversound.wav");
                Sound.playSound(gamefile);
                has = true;
            }



        }



        if(this.gamestart ){
            super.paintComponent(g);
            //System.out.println(rules);
            g.setColor(Color.BLACK);
            g.drawString("Made by: Shubham Patil",630,720);
            g.setColor(Color.ORANGE);
            //String gamestring = "Rules";
            g.setFont(new Font("Helvetica", Font.BOLD, 46));
            //g.drawString(gamestring, 400, 350);

            g.setColor(Color.GREEN);
            g.drawString("Play",400,400);

            g.setColor(Color.RED);
            g.drawString("Quit",400,458);

            g.setColor(Color.BLACK);
            g.drawString("Move It",20,200);


            g.setColor(Color.BLACK);
            g.setFont(new Font("Helvetica", Font.BOLD, 19));
            g.drawString("You are a blue block.", 20, 300);
            g.drawString("The yellow block falling from the sky", 20,350);
            g.drawString("gives you points.",20,375);
            g.drawString("The red blocks takes away lives",20,425);
            g.drawString("so stay away from them!",20,450);
            g.drawRect(10,255,350,250);
            g.drawString("Use 'A' to move left and 'D' to move right. Use them to catch blocks!", 50,30);


        }





        }






    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if(this.gameover == false && this.gamestart==false) {
            int key = keyEvent.getKeyCode();

            //System.out.println(key);
            if ((key == 68 || key==39) && x >= 0 && x <= 800) {
                x += vx;

            }

            if ((key == 65 || key==37) && x >= 0 && x <= 800) {
                x -= vx;


            }
        repaint();

        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(lives<0){
            lives=0;
        }




        //System.exit(0);
        if((this.mousex>=403 && this.mousex<=633) && (this.mousey>=379 && this.mousey<=400) && gameover==true){


            //System.out.println("In loop");
            Sound.playSound(select);
            this.gameover=false;
            x = 340;
            y = 558;
            vx = 30;
            yx = 10;
            counter = 0;
            lives = 3;
            gameover = false;
            gamestart=false;
            has = false;
            mousex=0;
            mousey=0;
            anotherlife=false;
            greeny=0;

            i=0;
            j=0;
            bluey = 3;
            bady = 4;
            startingy = 0;
            anothery=0;

             randx = (int) (Math.random() * 750);
           badx = (int) (Math.random() * 750);
            newx=(int)(Math.random()*750);

            randy = 0;
            rules=false;

        }
        if((this.mousex>=408 && this.mousex<=510) && (this.mousey>=429 && this.mousey<=453) && gameover==true && gamestart==false){
            File  winxp= new File("winxpshutdown.wav");
            Sound.playSound(winxp);

            System.exit(0);
        }

        if((this.mousex>=408 && this.mousex<=510) && (this.mousey>=429 && this.mousey<=453) && gameover==false && gamestart==true){
            File  winxp= new File("winxpshutdown.wav");
            Sound.playSound(winxp);

            System.exit(0);
        }

        if((mousex>=405 && mousex<=488) && (mousey>=372 && this.mousey<=403) && gamestart==true && gameover==false){

            Sound.playSound(select);
            gamestart=false;
            x = 340;
            y = 558;
            vx = 30;
            yx = 10;
            counter = 0;
            lives = 3;
            gameover = false;
            has = false;
            mousex=0;
            mousey=0;
            anotherlife=false;
            i=0;
            j=0;
            greeny=0;


            bluey = 3;
            bady = 4;
            startingy = 0;
            anothery=0;

            randx = (int) (Math.random() * 750);
            badx = (int) (Math.random() * 750);
            newx=(int)(Math.random()*750);

            rules=false;

            randy = 0;


        }




        if (this.gameover==false && this.gamestart==false) {

            i++;
            j++;
            //System.out.println(i);
            //i>=11500 && i<=120000
            if(i>=1500 && i<=2000){
                //System.out.println("In loop");
                greeny=0;
                anotherlife=true;

                i=0;
                repaint();
            }
            if(j>=3500 && j<=4025){
                bady++;
                anotherspeed++;
                j=0;
            }
            if (lives <= 0) {
                this.gameover = true;
            }


            if (x >= 758) {
                x = 758;
            }
            if (x <= 0) {
                x = 0;
            }

            if (y <= 0) {
                y = 0;
            }

            if (y >= 558) {
                y = 558;
            }

            //adding pixels to current position
            randy += bluey;
            startingy += bady;
            anothery+=anotherspeed;
            greeny+=bady;

            //If it touches blue
            if (x >= randx - 30 && x <= randx + 30 && y <= randy + 1) {
                counter += 5;
                File bloop = new File("coinsound.wav");
                Sound.playSound(bloop);
            }

            //if it touches yellow
            if (x >= badx - 30 && x <= badx + 30 && y <= startingy) {
                lives--;
                File bloop = new File("bloop.wav");
                Sound.playSound(bloop);

            }

            if (x >=newx - 30 && x <= newx + 30 && y <= anothery) {
                lives--;
                File bloop = new File("bloop.wav");
                Sound.playSound(bloop);

            }


            if(anotherlife==true) {
                if (x >= greenx - 30 && x <= greenx + 30 && y <= greeny) {
                    lives++;
                    File bloop = new File("mariolevelup.wav");
                    Sound.playSound(bloop);
                    anotherlife=false;
                    repaint();

                }
            }

            //If the blue falls out of range
            if (randy >= 558) {
                randy = 0;

                randx = (int) (Math.random() * 751);

            }

            //If yellow falls out of range
            if (startingy >= 558) {
                startingy = 0;
                badx = (int) (Math.random() * 751);

            }

            if (anothery >= 558) {
                //System.out.println(anothery);
                anothery = 0;
                newx = (int) (Math.random() * 751);

            }
            if(greeny>=558){
                anotherlife=false;
                greenx=(int)(Math.random()*558);
                greeny=0;
            }


            repaint();

        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        mousex=mouseEvent.getX();
        mousey=mouseEvent.getY();

       //System.out.println(mousex+" "+mousey);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
