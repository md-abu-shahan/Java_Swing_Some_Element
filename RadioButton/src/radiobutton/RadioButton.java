
package radiobutton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class RadioButton extends JFrame{
    
    private Container c;
    private JRadioButton ra,ra2;
    private Font fo;
    private Cursor cu;
    private ButtonGroup bg;
    private JTextArea ta;
    
    RadioButton(){
        c= getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        fo = new Font("Arial",Font.BOLD,20);
        
        cu = new Cursor(Cursor.HAND_CURSOR);
        
        
        ra = new JRadioButton("MALE");
        ra.setBounds(50,100,110,50);
        ra.setFont(fo);
        ra.setCursor(cu);
        
        ra.setSelected(true);
        
        c.add(ra);
        
        
        ra2 = new JRadioButton("FEMALE");
        ra2.setBounds(170,100,110,50);
         ra2.setCursor(cu);
         
         ra2.setEnabled(false);
         
         ra2.setFont(fo);               
        c.add(ra2);
        
        bg = new ButtonGroup(); 
        bg.add(ra);
        bg.add(ra2);
        
        
        
        ta = new JTextArea();
        ta.setBounds(30,160,300,200);
        ta.setFont(fo);
        c.add(ta);
        
        
        ra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("You have selected male");
                ra2.setEnabled(true);
            }
        });
        ra2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("You have selected female");
            }
        });
        
    }

    public static void main(String[] args) {
       RadioButton f = new RadioButton();
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setBounds(100,100,500,400);
       f.setTitle("Radio Button");

    }
    
}
