package textfield;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class textField2 extends JFrame{
    
 private Container c;
 private JTextField t1,t2;
 private JLabel l1,l2;
 private Font f,f2;
 private JPasswordField p;
 
textField2() {
    c = getContentPane();
    c.setLayout(null);
    c.setBackground(Color.YELLOW);
   
     f = new Font("Arial", Font.ITALIC+Font.BOLD, 12);
     f2 = new Font("Arial", Font.BOLD, 20);
      
    t1= new JTextField();
    t1.setBounds(200,20,150,50);
    t1.setFont(f);
    t1.setToolTipText("Full name");
    t1.setForeground(Color.BLACK);
    t1.setBackground(Color.PINK);
    c.add(t1);
    
    
    
 //main 
    p= new JPasswordField();
    p.setBounds(200,80,150,50);
    p.setFont(f2);
    p.setEchoChar('*');
    p.setForeground(Color.BLACK);
    p.setBackground(Color.PINK);
    p.setToolTipText("Passward");
    c.add(p);
//main
 
    
   

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
        textField2 f= new textField2();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,500,400);
        f.setTitle("TEXT");
        
    }
}
