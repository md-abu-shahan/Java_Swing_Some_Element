
package message;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TEST2 {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog(null,"Enter Your name :","Best Friend",JOptionPane.QUESTION_MESSAGE);
        
        ImageIcon img = new ImageIcon("D:\\java\\Message\\src\\message\\shahan1.png");
        JOptionPane.showMessageDialog(null," welcome to SHAHAN & HANIF blog",name,JOptionPane.QUESTION_MESSAGE,img);
    }
}
