package layout;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLO extends JFrame implements ActionListener{
    
    private Container c;
    private JButton l1,l2,l3,l4,l5,l6;
    private CardLayout Cd;
    CardLO(){
        c = getContentPane();
        Cd = new CardLayout(10,10);
//        G.setHgap(10);
//        G.setVgap(10);
        c.setLayout(Cd);
     
        
        
        l1 = new JButton("a");
        l2 = new JButton("b");
        l3 = new JButton("c");
        l4 = new JButton("d");
        l5 = new JButton("e");
        l6 = new JButton("f");
       
        c.add(l1,"First");
        c.add(l2,"Second");
        c.add(l3,"Third");
        c.add(l4,"Fourth");
        c.add(l5,"Fifth");
        c.add(l6,"Sixth");
//        Cd.show(c, "Third");
        
        
        l1.addActionListener(this);
        l2.addActionListener(this);
        l3.addActionListener(this);
        l4.addActionListener(this);
        l5.addActionListener(this);
        l6.addActionListener(this);
    }
        
    public static void main(String[] args) {
        CardLO f= new CardLO();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(50,50,500,400);
        f.setTitle("Card layout");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cd.next(c);
//        Cd.previous(c);

//          Cd.show(c, "Third");

//            Cd.first(c);
//            Cd.last(c);
    }
    
}
