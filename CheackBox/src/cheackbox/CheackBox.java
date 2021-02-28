package cheackbox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheackBox extends JFrame {

    private Container c;
    private JCheckBox cb, cb2, cb3;
    private ButtonGroup bg;
    private Font fo;
    private Cursor cr;
    private JLabel l;

    CheackBox() {

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        fo = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        bg = new ButtonGroup();

        cr = new Cursor(Cursor.HAND_CURSOR);

        cb = new JCheckBox("Java");
        cb.setBounds(50, 100, 100, 30);
        cb.setFont(fo);
        cb.setCursor(cr);
        cb.setEnabled(false);
        c.add(cb);

        cb2 = new JCheckBox("C");
//       cb2.setSelected(true);
        cb2.setBounds(50, 140, 100, 30);
        cb2.setFont(fo);
        cb2.setCursor(cr);
        c.add(cb2);

        cb3 = new JCheckBox("C++");
        cb3.setBounds(50, 180, 100, 30);
        cb3.setFont(fo);
        cb3.setEnabled(false);
        cb3.setCursor(cr);
        c.add(cb3);

        bg.add(cb);
        bg.add(cb2);
        bg.add(cb3);

        l = new JLabel("YOU HAVE NOT SELETED ANYTHING");
        l.setBounds(50, 150, 300, 200);
        l.setFont(fo);
        c.add(l);

        Handler h = new Handler();
        cb.addActionListener(h);
        cb2.addActionListener(h);
        cb3.addActionListener(h);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (cb.isSelected()) {
                l.setText("YOU HAVE SELECTED JAVA");

            } else if (cb2.isSelected()) {
                l.setText("YOU HAVE SELECTED C");
                cb3.setEnabled(true);

            } else {
                l.setText("YOU HAVE SELECTED C++");
                cb.setEnabled(true);

            }

        }

    }

    public static void main(String[] args) {
        CheackBox f = new CheackBox();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        f.setTitle("Check Box");
    }

}
