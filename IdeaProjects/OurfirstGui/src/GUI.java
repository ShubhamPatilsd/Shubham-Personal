import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    int count=0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI(){
       JFrame frame=new JFrame();

       JButton button = new JButton("Exit");
       button.addActionListener(this);
       label=new JLabel();
       JPanel panel=new JPanel();
       panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String [] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        count++;
        label.setText("");
        System.out.println("Number of Clicks : "+count);

    }
}
