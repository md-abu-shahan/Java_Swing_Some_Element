
package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLO extends JFrame{
    
    private Container c;
    private BorderLayout B;
    private JButton b1,b2,b3,b4,b5;
    
    
    BorderLO(){
        
        B = new BorderLayout();
        B.setHgap(10);
        B.setVgap(10);
        
         c= getContentPane();
         c.setLayout(B);
         
         b1 = new JButton("1");
         b2 = new JButton("2");
         b3 = new JButton("3");
         b4 = new JButton("4");
         b5 = new JButton("5");
         
         c.add(b1,BorderLayout.NORTH);
         c.add(b2,BorderLayout.EAST);
         c.add(b3,BorderLayout.SOUTH);
         c.add(b4,BorderLayout.WEST);
         c.add(b5,BorderLayout.CENTER);
        
        
    }
    
    
    public static void main(String[] args) {
        
        BorderLO f = new BorderLO();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,400);
    }
}
