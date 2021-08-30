import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dpd {
    public static void main(String[] args) {
        WebDriver wd = new ChromeDriver();
        wd.get("file:///C:/ibase/DatePickerDateFormat.html");
        WebDriverWait wait = new WebDriverWait(wd, 10,200);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hasDatepicker")));

        wd.findElement(By.className("hasDatepicker")).sendKeys("07/06/1990");

        By dateformat = By.id("format");
        WebElement countryWe = wd.findElement(dateformat);
        Select selectObject = new Select(countryWe);
        selectObject.selectByValue("DD, d MM, yy");
    }
}
