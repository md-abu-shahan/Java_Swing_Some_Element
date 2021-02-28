package button;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActioonListener extends JFrame implements ActionListener{

    private Container c;
    private JButton b1, b2, b3;

    ActioonListener() {

        c = getContentPane();
        c.setLayout(null);

        b1 = new JButton("RED");
        b1.setBounds(100, 100, 100, 50);
        c.add(b1);

        b2 = new JButton("GREEN");
        b2.setBounds(100, 160, 100, 50);
        c.add(b2);

        b3 = new JButton("BLUE");
        b3.setBounds(100, 220, 100, 50);
        c.add(b3);

        //  1   \\
        /* b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.red);
            }
        });
         */
        
        
        //2\\
//        Handler h = new Handler();
//        b1.addActionListener(h);
//        b2.addActionListener(h);
//        b3.addActionListener(h);
       //2\\
       
       
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       

    }
    
    
    
   //   2   \\
   /*
    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b1) {
                c.setBackground(Color.red);
            } else if (e.getSource() == b2) {
                c.setBackground(Color.GREEN);
            } else if (e.getSource() == b3) {
                c.setBackground(Color.BLUE);
            }
        }
    }
*/
    public static void main(String[] args) {

        ActioonListener f = new ActioonListener();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
        f.setTitle("Action LIstener");
        f.setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == b1) {
                c.setBackground(Color.red);
            } else if (e.getSource() == b2) {
                c.setBackground(Color.GREEN);
            } else if (e.getSource() == b3) {
                c.setBackground(Color.BLUE);
            }

    }
}
