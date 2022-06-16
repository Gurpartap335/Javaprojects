package Project1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {
        Date currentTime = new Date();
        System.out.println(currentTime);

        SimpleDateFormat simpleFormat = new SimpleDateFormat("hh:mm:ss");
    }
}
