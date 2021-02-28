package date.timeknow;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class times {
    
     
    
  
    public static void main(String[] args) {
     
        LocalTime localTime2 = LocalTime.now();
        
        DateTimeFormatter fo;
        fo= DateTimeFormatter.ofPattern("hh:mm:ss");
        
        String s = localTime2.format(fo);
        System.out.println(""+s);
        
    }
}
