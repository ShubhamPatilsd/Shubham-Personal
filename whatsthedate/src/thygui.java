import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class thygui implements ActionListener {
    private static JFrame frame=new JFrame();
    private static JPanel panel=new JPanel();
    private static JLabel label=new JLabel();
    private static JButton button=new JButton("Alarm Set");
    private static JTextField alarming=new JTextField();
    private static boolean indicator=true;
    private static String alarm;
    private static SimpleDateFormat formatting=new SimpleDateFormat("hh:mm");
public static void main(String args[]){
    frame.setSize(800,600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    panel.setLayout(null);
    label.setBounds(300,100,800,200);
    panel.add(label);
    button.addActionListener(new thygui());
    button.setBounds(350,350,115,25);
    panel.add(button);
    alarming.setBounds(350,400,300,25);
    frame.setVisible(true);
    dateimplement();

}



    @Override
    public void actionPerformed(ActionEvent e) {

        panel.add(alarming);
        System.out.println(alarming.getText());
        alarm=alarming.getText();






    }

    public static void dateimplement(){
        while (indicator==true){
            //Date date=new Date();
            String date="07:31";
            label.setText(String.valueOf(date));

            //String newdate=formatting.format(date);
            //change to newdate
            System.out.println("");
            System.out.println(alarm);
            if(alarm==date){
                System.out.println("there is alarm");
            }

        }
    }
}

