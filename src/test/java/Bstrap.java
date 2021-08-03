import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Bstrap {
    public static void main(String[] args) {
        //webdriver
        //WebDriver wd = new ChromeDriver();
        //WebDriver wd = new EdgeDriver();
        WebDriver wd = new FirefoxDriver();



        wd.get("file:///C:/ibase/bootstrap_form/Checkout%20example%20for%20Bootstrap.html");

        String heading = wd.findElement(By.tagName("h2")).getText();
        System.out.println(heading);

        By subHeading = By.className("lead");
        WebElement headingWe = wd.findElement(subHeading);
        String headingText = headingWe.getText();
        System.out.println(headingText);

        //firstname
        WebElement fnWe = wd.findElement(By.id("firstName"));
        fnWe.sendKeys("Srushti");

        //lastname
        WebElement lnWe = wd.findElement(By.id("lastName"));
        lnWe.sendKeys("Bobade");

        //username
        By Username = By.id("username");
        WebElement UN = wd.findElement(Username);
        UN.sendKeys("SRUSHTI BOBADE");

        //EMAIL
        By Email = By.id("email");
        WebElement EM = wd.findElement(Email);
        EM.sendKeys("srushtibobade30@gmail.com");

        //Address
        By Adr = By.id("address");
        WebElement Ad = wd.findElement(Adr);
        Ad.sendKeys("Kathora Naka");

        //Address2
        By Adrr = By.id("address2");
        WebElement Add = wd.findElement(Adrr);
        Add.sendKeys("Amaravti");

        // write here for another input fields
        By countrySelectTag = By.id("country");
        WebElement countryWe = wd.findElement(countrySelectTag);
        Select selectObject = new Select(countryWe);
        selectObject.selectByIndex(2);

        //drop down for state BY INDEX
       By StateSelectTag = By.id("state");
       WebElement stateWe = wd.findElement(StateSelectTag);
       Select selectObj = new Select(stateWe);
       selectObj.selectByIndex(1);

       //zip
        By Zp = By.id("zip");
        WebElement ZP = wd.findElement(Zp);
        ZP.sendKeys("444888");

        //drop down for state BY VALUE
//        By StateselectTag = By.id("state");
//        WebElement statewe = wd.findElement(StateselectTag);
//        Select selectobj = new Select(statewe);
//        selectObject.selectByValue("California");

        //selecting checkbox
//        WebElement check1= wd.findElement(By.id("same-address"));
//        check1.click();
//        WebElement check2= wd.findElement(By.id("save-info"));
//        check2.click();

        //selecting radio button
//        WebElement radio1= wd.findElement(By.id("credit"));
//        radio1.click();
//        WebElement radio2= wd.findElement(By.id("debit"));
//        radio2.click();
//        WebElement radio3= wd.findElement(By.id("paypal"));
//        radio3.click();

        //Card details filling
        WebElement cname = wd.findElement(By.id("cc-name"));
        cname.sendKeys("Srushti Bobade");
        WebElement cnumber = wd.findElement(By.id("cc-number"));
        cnumber.sendKeys("1234 5678 1234");
        WebElement cexp = wd.findElement(By.id("cc-expiration"));
        cexp.sendKeys("10/10/2025");
        WebElement cvv = wd.findElement(By.id("cc-cvv"));
        cvv.sendKeys("0000");

        //Checkout
        WebElement checkout = wd.findElement(By.className("btn-block"));
        checkout.click();








    }
}
