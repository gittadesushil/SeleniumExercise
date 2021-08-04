import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Strategies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://getbootstrap.com/docs/5.0/components/modal/");
        //driver.findElement(By.name("sendme")).sendKeys("hello.... from seelenium and java......");

        //click on links
        //driver.findElement(By.linkText("Click HERE")).click();

        //driver.findElement(By.partialLinkText("Click")).click();

        //driver.findElement(By.tagName("button")).click();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".bd-content > div:nth-of-type(34) > button")));
        we.click();

//        driver.findElement(By.id("alert")).click();
//        Alert alert = driver.switchTo().alert();
//        String textFromAlert = alert.getText();
//        alert.sendKeys();
        //System.out.println(textFromAlert);
    }
}
