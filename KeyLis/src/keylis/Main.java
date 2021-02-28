
package keylis;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
         KeyLis f= new KeyLis();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,700);
        f.setTitle("key Listener");
    }
}
