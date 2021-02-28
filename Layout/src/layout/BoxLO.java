
package layout;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLO extends JFrame
{
    private Container c;
    private JButton b[];
    private BoxLayout box;
    
    BoxLO(){
        c = getContentPane();
        

         // BoxLayout(container c, X,Y axis);
        box = new BoxLayout(c,BoxLayout.X_AXIS);
        
        c.setLayout(box);
        c.setBackground(Color.red);
        
        
//        b1 = new JButton("1");
//        b2 = new JButton("2");
//        
//        c.add(b1);
//        c.add(b2);
     

      b = new JButton[11];
        
        for(int i=1;i<=10;i++)
        {
            if(i==10){
                b[0] = new JButton(""+0);
            c.add(b[0]);
             c.add(Box.createVerticalStrut(10));

            }else{
                b[i] = new JButton(""+i);
            c.add(b[i]);
             c.add(Box.createVerticalStrut(10));

            }     
        }
        
    }

       public static void main(String[] args) {
        BoxLO f = new BoxLO();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,10,700,700);
        f.setTitle("Box Layout");
    }
}
