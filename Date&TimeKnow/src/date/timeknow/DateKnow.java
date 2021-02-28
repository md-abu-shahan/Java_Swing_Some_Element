
package date.timeknow;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateKnow {
    
    public static void main(String[] args) {
        
        Date d = new Date();
        
        DateFormat dateD = new SimpleDateFormat("dd/MM/YYYY");
        
        //day DD;     //date dd;
                
        String s= dateD.format(d);  
        
        System.out.println(""+s);
    }
}
