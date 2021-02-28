
package message;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test3 {
    public static void main(String[] args) {
        int chose=JOptionPane.showConfirmDialog(null, "DO you visit this blog","Best Friend",JOptionPane.YES_NO_OPTION);
        
        if(chose == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            String name=JOptionPane.showInputDialog(null,"Enter Your name :","Best Friend",JOptionPane.QUESTION_MESSAGE);
            ImageIcon img = new ImageIcon("D:\\java\\Message\\src\\message\\shahan1.png");
        JOptionPane.showMessageDialog(null,name+" Welcome to SHAHAN & HANIF blog","Best Friend",JOptionPane.QUESTION_MESSAGE,img);
        }
    }
}
