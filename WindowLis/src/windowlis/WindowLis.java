
package windowlis;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class WindowLis extends JFrame{

    private Container c;
    
    WindowLis(){
        c= getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

                   System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {

                   System.out.println("windowClosing");

            }

            @Override
            public void windowClosed(WindowEvent e) {
                   System.out.println("windowClosed");


            }

            @Override
            public void windowIconified(WindowEvent e) {
                   System.out.println("windowIconified");


            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                   System.out.println("windowDeiconified");


            }

            @Override
            public void windowActivated(WindowEvent e) {

                   System.out.println("windowActivated");

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

                   System.out.println("windowDeactivated");

            }
        });
        
    }
    public static void main(String[] args) {
       WindowLis f = new WindowLis();
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       f.setBounds(10,20,500,400);
       f.setTitle("Windows Lis");
    }
    
}
