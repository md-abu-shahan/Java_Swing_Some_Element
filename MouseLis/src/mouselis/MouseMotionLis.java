package mouselis;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseMotionLis extends JFrame {

    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane sp;

    MouseMotionLis() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);

        tf = new JTextField();
        tf.setBounds(220, 20, 150, 50);
        c.add(tf);

        ta = new JTextArea();
        ta.setBounds(10, 20, 200, 200);
        c.add(ta);
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                   tf.setText("mouse Dragged "+e.getX() +" "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                   tf.setText("mouse Moved "+e.getX() +" "+e.getY());
            }
        });
        
        
        
    }

    public static void main(String[] args) {
        MouseMotionLis f = new MouseMotionLis();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        f.setTitle("Mouse Listener");
    }

}
