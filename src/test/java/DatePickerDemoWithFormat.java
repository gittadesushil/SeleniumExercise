import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemoWithFormat {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/ibase/DatePickerDateFormat.html");
        driver.findElement(By.id("datepicker")).sendKeys("08/18/2021");


        WebElement selectBox = driver.findElement(By.id("format"));
        Select format = new Select(selectBox);
        format.selectByValue("mm/dd/yy");
        format.selectByValue("yy-mm-dd");
        format.selectByValue("d M, y");
        format.selectByValue("d MM, y");
        format.selectByValue("DD, d MM, yy");
        format.selectByValue("'day' d 'of' MM 'in the year' yy");



    }
}
