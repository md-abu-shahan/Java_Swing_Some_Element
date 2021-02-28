
package mouselis;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseLis extends JFrame{
    
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane sp;
    
MouseLis(){
    
    c= getContentPane();
    c.setLayout(null);
    c.setBackground(Color.red);
    
    tf = new JTextField();
    tf.setBounds(100,20,200,100);
    c.add(tf);
    
    ta = new JTextArea();
    
    
    sp= new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(50,130,300,200);
        c.add(sp);
        
        
        tf.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            ta.append("mouseClicked\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            ta.append("mousePressed\n");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            ta.append("mouseReleased\n");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ta.append("mouseEntered\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ta.append("mouseExited\n");
        }
    });
    
}
    public static void main(String[] args) {
       MouseLis f = new MouseLis();
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setBounds(100,100,500,400);
       f.setTitle("Mouse Listener");
    }
    
}
