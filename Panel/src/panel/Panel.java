
package panel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JFrame{

    private Container c;
    private JPanel p,p2;
    private JButton b1,b2,b3;
    
    Panel(){
        
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        
        p = new JPanel();
        p.setLayout(null);
        p.setBounds(100,100,200,300);
        p.setBackground(Color.red);
        c.add(p);
       
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(310,100,200,300);
        p2.setBackground(Color.BLUE);
        c.add(p2);
        
        b1 = new JButton("A");
        b1.setBounds(10,10,50,50);
        b2 = new JButton("B");
        b2.setBounds(10,10,50,50);
        
        b3 = new JButton("C");
        b3.setBounds(10,10,50,50);
        
        
        p.add(b1);
        p2.add(b2);
        
        
        c.add(b3);
        
        
        
        
    }
    public static void main(String[] args) {
     
        Panel  f = new Panel();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,50,600,600);
        f.setTitle("panel ");
    }
    
}
