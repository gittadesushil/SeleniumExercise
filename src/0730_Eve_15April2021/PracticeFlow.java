import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeFlow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //open a website
        driver.get("https://foodstore-1.web.app/");

        long time = 0;
        Thread.sleep(time);

        //click on cart button
        WebElement cart = driver.findElement(By.cssSelector(".headerBtns .cart"));
        cart.click();

        Thread.sleep(time);

        //close cart button
        driver.findElement(By.className("closeCartBtn")).click();

        Thread.sleep(time);
        //click on sign in button
        driver.findElement(By.linkText("Sign In")).click();

        Thread.sleep(time);
        //going back to the page
        driver.navigate().back();

        Thread.sleep(time);
        //send city as nagpur
        driver.findElement(By.className("cityInput")).sendKeys("Nagpur");

        Thread.sleep(time);
        //click search button
        driver.findElement(By.id("citySearchbtn")).click();

        Thread.sleep(time);
        driver.findElement(By.className("mainPage_restaurent_inner_container")).click();

        List<WebElement> hotels = driver.findElements(By.cssSelector(".mainPage_card_container > div > div > div:nth-of-type(2)"));
        Thread.sleep(3000);
        for (WebElement we:hotels) {
            we.getScreenshotAs(OutputType.FILE);
            System.out.println("Hotel name:"+we.getSize());
        }






    }
}
