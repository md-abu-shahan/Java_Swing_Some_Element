package fucaslis;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class FucasLis extends JFrame {

    private Container c;
    private JButton bt;
    private JTextArea ta;
    private JScrollPane sp;

    FucasLis() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        bt = new JButton("click");
        bt.setBounds(10, 50, 80, 50);
        
        c.add(bt);

        ta = new JTextArea();
        sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(100, 30, 200, 200);
        c.add(sp);

        bt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
                ta.append("focus Gained\n");
            }

            @Override
            public void focusLost(FocusEvent e) {
                ta.append("focus Lost\n");

            }
        });

    }

    public static void main(String[] args) {
        FucasLis f = new FucasLis();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        f.setTitle("Mouse Listener");
    }

}
