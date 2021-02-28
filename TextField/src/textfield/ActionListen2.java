
package textfield;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListen2 extends JFrame{
      private Container c;
 private JTextField t1,t2;
 private JLabel l1,l2;
 private Font f;

   ActionListen2(){
    c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.YELLOW);
   
     f = new Font("Arial", Font.ITALIC+Font.BOLD, 12);
     
     

    t1= new JTextField();
    t1.setBounds(200,20,150,50);
    t1.setFont(f);
    t1.setToolTipText("Full name");
    t1.setForeground(Color.BLACK);
    t1.setBackground(Color.PINK);
    t1.setHorizontalAlignment(JTextField.CENTER);
    c.add(t1);
    
    t2= new JTextField();
    t2.setBounds(200,80,150,50);
    t2.setFont(f);
    t2.setForeground(Color.BLACK);
    t2.setBackground(Color.PINK);
    t2.setToolTipText("Passward");
    t2.setHorizontalAlignment(JTextField.CENTER);
    c.add(t2);

    Hendle h = new Hendle();
   t1.addActionListener(h);
   t2.addActionListener(h);
   
 }
   
   class Hendle implements ActionListener{
       public void actionPerformed(ActionEvent e) {
            if(e.getSource()==t1){
                 String s = t1.getText();
                  JOptionPane.showMessageDialog(null, "google hacked by "+s);
            }else{
                String s = t2.getText();
                  JOptionPane.showMessageDialog(null, "google passward "+s);
            }
           
          
        }
       
   }
    
     public static void main(String[] args) {
        ActionListen2 f= new ActionListen2();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("ACTION LISTENER");
        
    }
}
