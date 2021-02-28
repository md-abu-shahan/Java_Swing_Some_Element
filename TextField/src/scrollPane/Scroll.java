
package scrollPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Scroll extends JFrame{
    
     private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane sp;
    
    Scroll(){
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f = new Font ("Arial",Font.BOLD,14);
        
        ta= new JTextArea();
        ta.setBackground(Color.WHITE);
        ta.setFont(f);
//        ta.setForeground(Color.RED);
//        ta.setBackground(Color.YELLOW);
//        ta.setLineWrap(true);


        ta.setWrapStyleWord(true);
        
        sp= new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(50,50,200,200);

        
        c.add(sp);
    }
    
    
    public static void main(String[] args) {
        Scroll f = new Scroll();
        f.setVisible(true);
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Multible line");
    }
}
