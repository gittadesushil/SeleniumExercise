import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    WebDriver driver = null;

    @Given("foodstore website is opened in browser")
    public void foodstoreWebsiteIsOpenedInBrowser() {
        driver = new ChromeDriver();
        driver.get("https://foodstore-1.web.app/");
    }

    @Then("I see {string} text on the homepage")
    public void iSeeTextOnTheHomepage(String arg0) {
        System.out.println("Expected Result: " + arg0);

        String heading = driver.findElement(By.className("coverTitle")).getText();//coming from UI actual result
        System.out.println("Actual Result: " + heading);

        if (heading.equals(arg0)) {
            System.out.println("Heading is matched, You are avilable on home page");
        } else {
            System.out.println("Failed: Expected and Actual is not match");
        }
    }

    @Then("cart button is avaialble on the page")
    public void cartButtonIsAvaialbleOnThePage() {
        String buttonName = driver.findElement(By.cssSelector(".headerBtns .cartInner")).getText();
        if(buttonName.equals("Cart")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

       boolean isButtonDisplayed = driver.findElement(By.cssSelector(".headerBtns .cart")).isDisplayed();
       if(isButtonDisplayed) {
           System.out.println("pass");
       }else{
           System.out.println("fail");
       }

    }

     @When("user should entered a Invalid city name like {string}")
    public void userShouldEnteredAInvalidCityNameLike(String arg0) {
        driver.findElement(By.className("cityInput")).sendKeys(arg0);
    }

    @And("click on Search button")
    public void clickOnButton() {
        driver.findElement(By.id("citySearchbtn")).click();
    }

    @Then("user should see error msg {string}")
    public void userShouldSeeErrorMsg(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        String actualErrorMsg = driver.findElement(By.cssSelector(".error > span")).getText();
        String expectedErrorMsg = arg0;
        if(expectedErrorMsg.equals(actualErrorMsg)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
