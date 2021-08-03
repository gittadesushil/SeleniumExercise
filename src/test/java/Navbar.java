import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navbar {
    public static void main(String[] args) throws InterruptedException {
        WebDriver wd = new ChromeDriver();
        wd.get("C:\\ibase\\bootstrap_navigation\\bootstrap-5.0.2-examples\\navbars\\index.html");

        wd.findElement(By.className("navbar-toggler")).click();
        WebDriverWait wait1 = new WebDriverWait(wd, 10);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dropdown01")));
        element1.click();
        wd.findElement(By.linkText("Action")).click();
       // wd.findElement(By.cssSelector("nav-link dropdown-toggle show")).click();
    }
}
