
package textfield;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ALIGNMENT extends JFrame{
     private Container c;
 private JTextField t1,t2;
 private JLabel l1,l2;
 private Font f;

    public ALIGNMENT(){
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
    //main
    t1.setHorizontalAlignment(JTextField.CENTER);
    //main
    c.add(t1);
    
    t2= new JTextField();
    t2.setBounds(200,80,150,50);
    t2.setFont(f);
    t2.setForeground(Color.BLACK);
    t2.setBackground(Color.PINK);
    t2.setToolTipText("Passward");
    //main
    t2.setHorizontalAlignment(JTextField.RIGHT);
    //main
    c.add(t2);


 
    
   

        l1 = new JLabel();
        
        l1.setText("Enter your name : ");
        l1.setToolTipText("name");
        
//        System.out.println(""+l1.getText());
//        System.out.println(""+l1.getToolTipText());
        
        l1.setBounds(50, 20, 130, 50);
        l1.setFont(f);

        l1.setForeground(Color.red);
        l1.setOpaque(true);
        l1.setBackground(Color.PINK);
        
        c.add(l1);
    
    l2 = new JLabel("Enter your passward :");
    l2.setToolTipText("passward");
        l2.setBounds(50, 80, 130, 50);
        l2.setFont(f);
        l2.setForeground(Color.red);
        l2.setOpaque(true);
        l2.setBackground(Color.PINK);
        c.add(l2);         
    }
    
    public static void main(String[] args) {
        ALIGNMENT f= new ALIGNMENT();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("TEXT");
        
    }
}
