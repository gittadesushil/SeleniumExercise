import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class LocatorExercise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://foodstore-1.web.app/");

        driver.manage().window().maximize();

        WebElement cart = driver.findElement(By.xpath("//html/body/div/header/div[3]/button"));
        cart.click();



//        WebElement signin = driver.findElement(By.partialLinkText("Sign"));
//        signin.click();
//
//
//
//
//        WebElement heading = driver.findElement(By.className("coverTitle"));
//        String headingValue = heading.getText();
//        System.out.println("Heading on the page is: "+headingValue);
//
//        WebElement smallHeading = driver.findElement(By.className("coverDesc"));
//        String value = smallHeading.getText();
//        System.out.println("Small Heading on the page is: "+value);
//
//        //send text inside search box
//        WebElement searchBox = driver.findElement(By.className("cityInput"));
//        searchBox.sendKeys("Mumbai");
//        System.out.println("searching complete");
//
//        //Click on search button
//        WebElement searchButton = driver.findElement(By.id("citySearchbtn"));
//        searchButton.click();
//        System.out.println("clicking complete");
//
//        driver.navigate().back();
//        System.out.println("going back to home screen");



    }
}
