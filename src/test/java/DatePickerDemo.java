import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DatePickerDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/ibase/DatePicker.html");


        //Get TODAYS date
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 24); // same for minutes and seconds
        int day = today.get(Calendar.DAY_OF_MONTH);
        int month = today.get(Calendar.MONTH)+1;
        int year = today.get(Calendar.YEAR);

        // send todays date
        String todaysDate = day + "/"+month+"/"+year;
        driver.findElement(By.id("datepicker")).sendKeys(todaysDate);

    }
}
