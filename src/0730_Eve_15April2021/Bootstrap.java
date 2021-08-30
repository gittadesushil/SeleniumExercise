import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bootstrap {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/ibase/bootstrap_form/Checkout%20example%20for%20Bootstrap.html");

        //driver.findElement(By.id("sendme")).sendKeys("hello from selenium");
        driver.findElement(By.name("sendme")).sendKeys("hello from selenium and java");

        WebElement countryWe = driver.findElement(By.id("country"));
       Select country = new Select(countryWe);
      // country.selectByIndex(3);
       // country.selectByValue("Country two");
        country.selectByVisibleText("four");

        WebElement stateWe =  driver.findElement(By.id("state"));
        Select state = new Select(stateWe);
        state.selectByVisibleText("California");

        driver.findElement(By.id("alert")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2500);
        alert.dismiss();


    }
}
