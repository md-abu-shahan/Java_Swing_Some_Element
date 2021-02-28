
package layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLO extends JFrame{
    
    private Container c;
    private JButton b[];
    private FlowLayout fl;
    
    
    FlowLO(){
        
        fl = new FlowLayout(FlowLayout.LEFT,15,10);
//        fl.setHgap(10);
//        fl.setVgap(10);
        
        c = getContentPane();
        c.setBackground(Color.red);
        c.setLayout(fl);
        
        b = new JButton[11];
        
        for(int i=1;i<=10;i++)
        {
            if(i==10){
                b[0] = new JButton(""+0);
            c.add(b[0]);
            }else{
                b[i] = new JButton(""+i);
            c.add(b[i]);
            }
            
            
        }
        
    }
    
    public static void main(String[] args) {
        FlowLO f = new FlowLO();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,50,500,400);
        f.setTitle("Flow Layout");
        
    }
    
}
