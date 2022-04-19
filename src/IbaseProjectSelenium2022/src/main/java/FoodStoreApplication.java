import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FoodStoreApplication {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args)  {
        //Example of Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //implicit wait
        driver.get("https://foodstore-1.web.app/");
        driver.manage().window().maximize();
        tCID_2();
    }

    /**
     * TC ID: 2
     * TC Name: Verify customer can search hotel using search feature
     * Requirement Name: Customer should be able to search by City
     */
    private static void tCID_2() {
        String actualHeading = driver.findElement(By.className("coverTitle")).getText();
        // Verification
        //STEP 1:
        if (actualHeading.equals("You order we deliver")) {
            System.out.println("PASS: User is available on home page");
        } else {
            System.out.println("FAIL: User is not available on home page");
        }
        //STEP 2:
        driver.findElement(By.className("cityInput")).sendKeys("Mumbai");
        driver.findElement(By.id("citySearchbtn")).click();

        verifyUserIsAvailableOnListOfHotelsPage();

        //Step 3:
        driver.navigate().back();

        boolean isSearchBoxDisplyed = driver.findElement(By.className("cityInput")).isDisplayed();
        if (isSearchBoxDisplyed) {
            System.out.println("PASS: Search box is available");
        } else {
            System.out.println("FAIL: Search box is NOT available");
        }

        //Step 4:
        driver.findElement(By.className("cityInput")).sendKeys("Pune" + Keys.ENTER);
        verifyUserIsAvailableOnListOfHotelsPage();
    }

    private static void verifyUserIsAvailableOnListOfHotelsPage()  {
        //Example of Explicit wait
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dropdown01")));

        //Example of Fluent wait
        //Declare and initialise a fluent wait
        FluentWait wait = new FluentWait(driver);
        //Specify the timeout of the wait
        wait.withTimeout(Duration.ofSeconds(5));
        //Specify polling time
        wait.pollingEvery(Duration.ofMillis(30));
        //Specify what exceptions to ignore
        wait.ignoring(NoSuchElementException.class);

        //This is how we specify the condition to wait on.
        //This is what we will explore more in this chapter
        //Note: Make sure you use correct exception class
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("res_title")));

        driver.findElement(By.className("res_title")).isDisplayed();
        List<WebElement> hotels = driver.findElements(By.className("mainPage_restaurent_inner_container"));
        //Thread.sleep(4000);

        List<WebElement> hotelNames = driver.findElements(By.className("res_title"));
        for (WebElement hotel : hotelNames) {
            //System.out.println("hotel name:"+hotel.getText());
        }
        if (hotels.size() > 0 && hotelNames.size() > 0) {
            System.out.println("PASS: You are available on list of hotels page");
        } else {
            System.out.println("FAIL: You are not available on list of hotels page");
        }
    }
}
