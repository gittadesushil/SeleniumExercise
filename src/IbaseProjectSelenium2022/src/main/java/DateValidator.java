import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {
    public static void main(String[] args) {

        System.out.println("date validator");

        try{
            SimpleDateFormat dateFormator = new SimpleDateFormat("EE, d MMM yyyy");
            dateFormator.setLenient(false);
            Date isValid = dateFormator.parse("Tuesday, 12 April 2022");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage()) ;
        }
        //trim

    }
}
