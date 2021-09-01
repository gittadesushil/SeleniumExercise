import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapFindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/ibase/bootstrap_form/Checkout%20example%20for%20Bootstrap.html");

        List<WebElement> elements = driver.findElements(By.className("text-muted"));
        System.out.println(elements.size());
        for(WebElement we : elements){
            System.out.println(we.getText());
        }
    }
}
