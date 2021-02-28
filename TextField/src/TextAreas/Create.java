
package TextAreas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Create extends JFrame{
    private Container c;
    private JTextArea a;
    private Font f;
    
    Create(){
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f = new Font ("Arial",Font.BOLD,14);
        
        a= new JTextArea();
        a.setBounds(50,50,200,200);
        a.setBackground(Color.WHITE);
        a.setFont(f);
//        a.setForeground(Color.RED);
//        a.setBackground(Color.YELLOW);
        a.setLineWrap(true);
        a.setWrapStyleWord(true);
        
        
        c.add(a);
    }
    
    public static void main(String[] args) {
        Create f = new Create();
        f.setVisible(true);
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Multible line");
    }
}
