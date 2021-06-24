import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BootstrapWebsiteOne {
    public static void main(String[] args) {
        //webdriver
        WebDriver wd = new ChromeDriver();
        wd.get("file:///C:/ibase/bootstrap_form/Checkout%20example%20for%20Bootstrap.html");

        String heading = wd.findElement(By.tagName("h2")).getText();
        System.out.println(heading);

        By subHeading = By.className("lead");
        WebElement headingWe = wd.findElement(subHeading);
        String headingText = headingWe.getText();
        System.out.println(headingText);

        //firstname
        By firstName = By.id("firstName");
        WebElement fnWe = wd.findElement(firstName);
        fnWe.sendKeys("ibase automation");

        // write here for another input fields

        By countrySelectTag = By.id("country");
        WebElement countryWe = wd.findElement(countrySelectTag);
        Select selectObject = new Select(countryWe);
        //using index
        //selectObject.selectByIndex(3);

        //by value
        //selectObject.selectByValue("Country two");
        //selectObject.selectByValue("");

        //by visible text
        selectObject.selectByVisibleText("four");


    }
}
