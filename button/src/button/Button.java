
package button;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Button extends JFrame{
    private Cursor cs,cs1,cs2,cs3,cs4; 
    private Container c;
    private JButton b,b2;
    private Font f;
    private ImageIcon img;
    private JTextField tf;
    
    
    Button(){
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        img= new ImageIcon(getClass().getResource("SHAHAN.png"));
        
        f = new Font("Arial",Font.CENTER_BASELINE+Font.BOLD,10);
        
        
        tf = new JTextField();
        tf.setBounds(10,10,200,100);
        c.add(tf);
        
        cs= new Cursor(Cursor.HAND_CURSOR);
//        cs1 =new Cursor(Cursor.CROSSHAIR_CURSOR);
        cs2 =new Cursor(Cursor.WAIT_CURSOR);
//        cs3 =new Cursor(Cursor.DEFAULT_CURSOR);
//        cs4 =new Cursor(Cursor.MOVE_CURSOR);
        
        b = new JButton(img);
        b.setBounds(100, 200, 90, 30);
        b.setFont(f);
        b.setForeground(Color.BLACK);
        b.setBackground(Color.LIGHT_GRAY);
        b.setCursor(cs);
        c.add(b);
        
        b2 = new JButton("EXIT");
        b2.setBounds(300, 200, 90, 30);
        b2.setFont(f);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setCursor(cs2);
        c.add(b2);
        
        
        
        
        b.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
                tf.setText(null);
            }
        });
        
    }
    
    
    public static void main(String[] args) {
       Button f =new Button();
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setBounds(200, 200, 500, 400);
       f.setTitle("Button");
       f.setResizable(true);
    }
    
}
