
package layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLO extends JFrame{
    
    private Container c;
    private JTextField l1,l2,l3,l4,l5,l6;
    private GridLayout G;
    
    GridLO(){
        
        c =getContentPane();
        G = new GridLayout(2,3,10,10);
//        G.setHgap(10);
//        G.setVgap(10);
        c.setLayout(G);
        c.setBackground(Color.red);
        
        
        l1 = new JTextField("a");
        l1.setBackground(Color.YELLOW);
        l1.setForeground(Color.BLACK);
        
        l2 = new JTextField("b");
        l3 = new JTextField("c");
        l4 = new JTextField("d");
        l5 = new JTextField("e");
        l6 = new JTextField("f");
       
        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(l4);
        c.add(l5);
        c.add(l6);
        
        
    }
    
    public static void main(String[] args) {
        GridLO f= new GridLO();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(50,50,500,400);
        f.setTitle("Grid layout");
        
    }
    
}
