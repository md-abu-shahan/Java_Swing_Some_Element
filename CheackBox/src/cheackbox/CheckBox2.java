
package cheackbox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBox2 extends JFrame{
    
     private Container c;
    private JCheckBox cb, cb2, cb3;
    private ButtonGroup bg;
    private Font fo;
    private Cursor cr;
    private JLabel l;

    CheckBox2() {

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
        cb3.setCursor(cr);
        c.add(cb3);

        bg.add(cb);
        bg.add(cb2);
        bg.add(cb3);

        l = new JLabel("YOU HAVE NOT SELETED ANYTHING");
        l.setBounds(50, 150, 400, 200);
        l.setFont(fo);
        c.add(l);

       Handler h = new Handler();
       cb.addItemListener(h);
       cb2.addItemListener(h);
       cb3.addItemListener(h);
    }
    class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            
            if(e.getSource()==cb){
                l.setText("YOU HAVE SELETED JAVA");
            }
            else if(e.getSource()==cb2){
                l.setText("YOU HAVE SELETED C");
            }
            if(e.getSource()==cb3){
                l.setText("YOU HAVE SELETED C++");
            }
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        CheckBox2 f = new CheckBox2();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        f.setTitle("Check Box");
    }
    
}
