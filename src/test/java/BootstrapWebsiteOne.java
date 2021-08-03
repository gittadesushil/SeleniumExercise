import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class BootstrapWebsiteOne {
    public static void main(String[] args) {
        //webdriver
        WebDriver wd = new ChromeDriver();
        wd.get("file:///C:/ibase/bootstrap_form/Checkout%20example%20for%20Bootstrap.html");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //wd.findElement(By.linkText("Click HERE")).click();
        wd.findElement(By.name("sendme")).sendKeys("ok sending you some text now!");

        try{
            wd.findElement(By.id("alert")).click();
            Alert alert = wd.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
        }catch (UnhandledAlertException ex){
            ex.printStackTrace();
        }
        int size = wd.findElements(By.tagName("button")).size();
        System.out.println(size);
        List<WebElement> wl = wd.findElements(By.tagName("button"));

        for (WebElement l:wl) {
            System.out.println(l.getText());
            l.click();
        }

        //wd.findElement(By.partialLinkText("ck")).click();
        System.out.println("after link text..........");

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
