import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class FirstProgram {
    public static void main(String[] args) throws InterruptedException, IOException {
        //web driver object
        WebDriver driver = new ChromeDriver();//chrome browser automation
        try{
            driver.get("https://foodstore-1.web.app/");

            driver.manage().window().maximize();
            String title = driver.getTitle();
            System.out.println("Title of the window/tab: "+title);

            String url = driver.getCurrentUrl();
            System.out.println("URL is: "+url);

            driver.findElement(By.cssSelector(".headerBtns .signin")).click();

            driver.findElement(By.name("email")).sendKeys("selenium@dummy.com");
            driver.findElement(By.name("password")).sendKeys("dummy12345");

            driver.findElement(By.xpath("//button[text()='Sign In']")).click();

            Thread.sleep(2000);
            String error = driver.findElement(By.className("error")).getText();
            System.out.println("Error message: "+error);

//            List<WebElement> buttons = driver.findElements(By.tagName("button"));
//            System.out.println("Number of button tags available on web page: "+buttons.size());
//            //buttons.get(2).click();
//
//            for (WebElement ele:buttons) {
//                if(ele.getText().equals("SIGN IN")){
//                    ele.click();
//                }
//            }




            //enter a city name
//           WebElement searchBox = driver.findElement(By.className("cityInput"));
//           searchBox.sendKeys("Pune");
//
////           WebElement searchButton = driver.findElement(By.id("citySearchbtn"));
////            searchButton.click();
//
//            WebElement headingMessage = driver.findElement(By.className("coverTitle"));
//            String heading = headingMessage.getText();
//            System.out.println("=====>> "+heading);
//
//            String desc = driver.findElement(By.className("coverDesc")).getText();
//            System.out.println("=====>> "+desc);
//
//            driver.findElement(By.cssSelector(".headerBtns .cart")).click();
//
//            Thread.sleep(4000);
//            driver.findElement(By.className("closeCartBtn")).click();





            //click on search button


            //Taking screenshots
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            FileHandler.copy(scrFile,new File("c:\\ibase\\screenshots\\image.png"));
        }finally {
            //driver.quit();//It closes the browser, tabs, windows and processes associated with webdriver.
        }

    }
}
