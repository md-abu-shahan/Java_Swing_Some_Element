
package keylis;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyLis extends JFrame{

    private JLabel a,et,i,o,u,fs,to;
    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private JScrollPane sp;
    
    int tv=0;
    int av=0;
    int ev=0;
    int iv=0;
    int ov=0;
    int uv=0;
    
    KeyLis(){
        
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        
        tf = new JTextField();
        tf.setBounds(50,60,150,50);
        c.add(tf);
        
        ta = new JTextArea();
        c.add(ta);
        
        sp= new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(50,120,200,400);
        c.add(sp);
        
        
        
        fs = new JLabel("Enter Text :");
        fs.setBounds(50,22,200,50);
        c.add(fs);
        
        a = new JLabel("A :");
        a.setBounds(300,5,200,50);
        c.add(a);
        
        et = new JLabel("E :");
        et.setBounds(300,45,200,50);
        c.add(et);
        
        i = new JLabel("I :");
        i.setBounds(300,85,200,50);
        c.add(i);
        
        o = new JLabel("O :");
        o.setBounds(300,125,200,50);
        c.add(o);
        
        u = new JLabel("U :");
        u.setBounds(300,165,200,50);
        c.add(u);
        
        to = new JLabel("Total Vawal :");
        to.setBounds(300,200,200,50);
        c.add(to);
        
        
        
        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                ta.append("Key Typrd :"+e.getKeyChar()+"\n");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                ta.append("Key Pressed :"+e.getKeyChar()+"\n");
                
                
               if(e.getSource()==tf){ 
                if(e.VK_A  ==  e.getKeyCode()){
                    av++;
                    tv++;
                }
               else if(e.VK_E  ==  e.getKeyCode()){
                    ev++;
                    tv++;
                }
               else if(e.VK_I  ==  e.getKeyCode()){
                    iv++;
                    tv++;
                }
               else if(e.VK_O  ==  e.getKeyCode()){
                    ov++;
                    tv++;
                }
               else if(e.VK_U  ==  e.getKeyCode()){
                    uv++;
                    tv++;
                }
                
                to.setText("Total Vawel : "+tv);
                a.setText("A : "+av);
                et.setText("E : "+ev);
                
                i.setText("I : "+iv);
                o.setText("O : "+ov);
                u.setText("U : "+uv);
                
               } 
        
            }

            @Override
            public void keyReleased(KeyEvent e) {
                ta.append("Key Released :"+e.getKeyChar()+"\n");

            }
        });
        
        
        
        
        
        
    }
    public static void main(String[] args) {
        KeyLis f= new KeyLis();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,700);
        f.setTitle("key Listener");
        
    }
    
}
