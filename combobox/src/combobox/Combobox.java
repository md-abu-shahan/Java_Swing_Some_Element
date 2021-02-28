
package combobox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Combobox extends JFrame{
    
    private Container c;
    private Cursor cr;
    private JComboBox cb;
    private String[] S = {"C","C++","JAVA","PYTHON","RUBY" };
    private JLabel l;
  

    Combobox() {

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        
        cr = new Cursor(Cursor.HAND_CURSOR);
        
        cb= new JComboBox(S);
        cb.setBounds(100,150,100,50);
        
        cb.setEditable(true);
        
//        cb.setSelectedIndex(4);
        cb.setSelectedItem("JAVA");
        
        cb.addItem("Fortran");
        
        cb.removeItem("PYTHON");
        cb.removeItemAt(1);
//        cb.removeAllItems();
        
//        System.out.println("TOTAL = "+cb.getItemCount());

         c.add(cb);

        
        l= new JLabel();
        l.setBounds(100,200,300,200);
        c.add(l);
        
        cb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String s = cb.getSelectedItem().toString();
                l.setText("SELECTED "+s);
            }                
        
        });
    }
    

    public static void main(String[] args) {
        Combobox f = new Combobox();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        f.setTitle("COMBO BOX");
    }
    
}
