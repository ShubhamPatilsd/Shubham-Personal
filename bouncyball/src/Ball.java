import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Ball extends JPanel{
private int x;
private int y;
private int cpux=25;
private int cpuy=y;
private int velx=15;
private int vely=15;
private int playerx;
private int framey;
private int middlex;
private double textsize;
private int p1score;
private int p2score;
private int randomnum;



private int mousey;
private Random rd=new Random();



private boolean right=false;
private boolean down=false;
private boolean startingcheck=false;
private boolean checking=false;
private boolean haschecked=false;


public Ball(){
   // System.out.println(x+" "+y);
    //addMouseListener(this);
}

public void paintComponent(Graphics g){

    super.paintComponent(g);

    g.setColor(Color.BLACK);
    g.fillRect(x,y,30,30);
    g.fillRect(cpux,cpuy,50,150);
    g.fillRect(playerx,mousey,50,150);
    Font font=new Font("Helvetica", Font.BOLD, (int) textsize);
    g.setFont(font);
    g.drawString(String.valueOf(p2score),middlex-100,40);
    g.drawString(String.valueOf(p1score),middlex+100,40);
    Graphics2D g2d=(Graphics2D)g;
    Stroke stroke=new BasicStroke(5f);
    g2d.setStroke(stroke);
    g2d.drawLine(middlex,0,middlex,framey);

    //g.drawLine(startinglinex,startingliney,endingx,endingy);

}


public void movearound(JFrame f) {
    textsize=f.getHeight()*f.getWidth()/43000;

    middlex=f.getWidth()/2;
    framey=f.getHeight();
    playerx=f.getWidth()-75;
    PointerInfo point=MouseInfo.getPointerInfo();
    Point mouses=point.getLocation();
    mousey=(int) mouses.getY();
    if(mousey>f.getHeight()-150){
        mousey=f.getHeight()-150;

    }


    if(!startingcheck){
        x=(int)(Math.random()*(f.getWidth()+1));
        y=(int)(Math.random()*(f.getHeight()+1));
        startingcheck=true;
    }
    try {

        TimeUnit.MILLISECONDS.sleep(5);
        if(mousey==y){
            //System.out.println(mousey+" "+y);
        }
        if((x==playerx-30) && (y>=mousey && y<=mousey+150)){

            right=false;

        }

        if(x==cpux+30){
            TimeUnit.MILLISECONDS.sleep(150);
            p1score++;
            right=true;
        }
        if(right){
            x++;
        }
        if(!right){
            x--;
        }



        if(down){
            y++;
        }
        if(!down){
            y--;
        }




        if(x<=0){

            x=30;
            right=true;
            p1score++;
        }


        if(x>f.getWidth() || ((x==playerx) && (y != mousey))){
            TimeUnit.MILLISECONDS.sleep(150);
            x=playerx-30;
            right=false;
            p2score++;
        }



        if(y<0){
            y=30;
            down=true;
        }
        if(y>f.getHeight()-30){
            y=f.getHeight()-30;
            down=false;
        }
        if(!haschecked && x>middlex){
            checking=rd.nextBoolean();
            //System.out.println(checking);
            haschecked=true;
        }
        if(x<=middlex){
            if(haschecked==true){
                haschecked=false;
            }
            if(checking){
                cpuy=y+randomnum;

            }else{
                if(cpuy>=f.getHeight()){
                    cpuy--;
                }else if(cpuy<=0){
                    cpuy++;
                }
            }
        }


        if(cpuy>f.getHeight()-150){
            cpuy=f.getHeight()-150;

        }

        if(mousey>f.getHeight()-150){
            mousey=f.getHeight()-150;

        }
    }catch(Exception e){
        e.printStackTrace();
    }

repaint();
}


}
