import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class appie implements ActionListener {
   private static JLabel min;
   private static JTextField userText;
   private static JTextField userText2;
   private static JLabel max;

   private static JButton button;
   private static JLabel success;
   private static Random rand=new Random();
   



   public static void main(String[] args){
      JPanel panel=new JPanel();
      JFrame frame=new JFrame();
      frame.setSize(800,600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.add(panel);


      panel.setLayout(null);

      min= new JLabel("Min. (Including -->)");
      min.setBounds(200,450,140,25);
      panel.add(min);
      userText = new JTextField(20);
      userText.setBounds(350,450,165,25);
      panel.add(userText);

      max=new JLabel("Max. (Including -->)");
      max.setBounds(200,500,140,25);
      panel.add(max);
      userText2=new JTextField();
      userText2.setBounds(350,500,165,25);
      panel.add(userText2);

      button=new JButton("Random");
      button.setBounds(350,350,80,25);
      button.addActionListener(new appie());
      panel.add(button);


      success=new JLabel("");
      success.setBounds(400,110,300,50);
      panel.add(success);


      frame.setVisible(true);





   }

   @Override
   public void actionPerformed(ActionEvent actionEvent) {

      String user=userText.getText();
      String user2=userText2.getText();
      int userint=Integer.parseInt(user);
      int userint2=Integer.parseInt(user2);

      if(userint2>userint) {
         int random = rand.nextInt((userint2 - userint) + 1) + userint;
         success.setText(String.valueOf(random));



      }else{
         success.setText("You can't do that");}
      }
}

