import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternAnalysisDiscussion {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //object creation
        driver.get("file:///C:/ibase/bootstrap_form/Checkout%20example%20for%20Bootstrap.html"); //open a browser and navigate to URL

        driver.manage().window().maximize();

        driver.findElement(By.id("firstName")).sendKeys("first name");
        driver.findElement(By.id("lastName")).sendKeys("last name");
        driver.findElement(By.id("username")).sendKeys("username");

    }
}
