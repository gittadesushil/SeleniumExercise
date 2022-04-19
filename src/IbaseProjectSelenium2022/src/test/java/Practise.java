import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
    static WebDriver driver =new ChromeDriver();
    @Given(": Website is up and running")
    public void websiteIsUpAndRunning() {

    }

    @When(":I Open a website in browser")
    public void iOpenAWebsiteInBrowser() {
        driver.get("https://foodstore-1.web.app/");
        driver.manage().window().maximize();
    }

    @Then(":I should see website is working")
    public void iShouldSeeWebsiteIsWorking() {
        String actualtext = driver.findElement(By.className("coverTitle")).getText();
        if (actualtext.equals("You order we deliver")) {
            System.out.println("user is on the home page");
        } else {
            Assertions.fail("user is not on the home page");
        }
    }

    @When(":I Click on sign button")
    public void iClickOnSignButton() {
        driver.findElement(By.xpath("//html/body/div/header/div[3]/div/a")).click();
    }

    @Then(":I should navigate to sign in page")
    public void iShouldNavigateToSignInPage() {
        String text=driver.findElement(By.cssSelector(".headerBtns .signin")).getText();
        Assertions.assertEquals("Sign in",text, "user is not available on the Sign in page");
    }

    @When(":I click on join in button")
    public void iClickOnJoinInButton() {
        driver.findElement(By.className("join")).click();
    }

    @Then(":I should navigate to {string}")
    public void iShouldNavigateTo(String arg0) {
        String actualStr=driver.findElement(By.cssSelector(".form-container > form > h1")).getText();
        String expectedStr ="Create Account";
        //question?
        Assertions.assertEquals(expectedStr, actualStr, "I am not able to navigate to Create Account page");
    }

    @When(":I enter valid email id password and name then click on sign up button")
    public void iEnterValidEmailIdPasswordAndNameThenClickOnSignUpButton() {

    }

    @Then(":I should able to enter data in all field after sign up user should see small icon with loggin name and sign in option should not present")
    public void iShouldAbleToEnterDataInAllFieldAfterSignUpUserShouldSeeSmallIconWithLogginNameAndSignInOptionShouldNotPresent() {
        driver.findElement(By.cssSelector("[name='name']")).sendKeys("Bhagyashri");
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("bhagyagabhane@gmail.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("Bhagyashri");
        driver.findElement(By.cssSelector(".form-container > form > button")).click();
    }

    @When(":I go to back page")
    public void iGoToBackPage() {
        driver.navigate().back();
    }

    @Then(":I should able to go on home page")
    public void iShouldAbleToGoOnHomePage() {
        String actualtext = driver.findElement(By.className("coverTitle")).getText();
        if (actualtext.contentEquals("You order we deliver")) {
            System.out.println("user is on the home page");
        } else {
            System.out.println("user is not on the home page");
        }

    }

    //Verify join now funtion with verious  invalid data
    @When(":I click on JOIN NOW button")
    public void iClickOnJoinNowButton() {
        driver.findElement(By.className("join")).click();


    }

    @Then(":I should navigate to  create account page")
    public void iShouldNavigateToCreateAccountPage() {
        String expectedTextOfcrpGE=driver.findElement(By.cssSelector(".form-container > form > h1")).getText();
        String actualTextOfcrpGE="Create Account";
        if(expectedTextOfcrpGE.equals(actualTextOfcrpGE)){
            System.out.println("User is on create account page");

        }else {
            System.out.println("User is not on create account page");
        }


    }

    @When(":I keep all the field \\(Name,Email id and Password) empty and try to sign up button")
    public void iKeepAllTheFieldNameEmailIdAndPasswordEmptyAndTryToSignUpButton() {
        driver.findElement(By.cssSelector(".form-container > form > button")).click();

    }
    //how can i use switch case here
    @Then(":I should see message {string}")
    public void iShouldSeeMessage(String arg0) {
        String errorMsg=driver.findElement(By.className("error")).getText();
        System.out.println("Error message:" +errorMsg);
    }

    @When(":I keep name blank and enter email id and password")
    public void iKeepNameBlankAndEnterEmailIdAndPassword() {
        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("abcd1245kgd");
        driver.findElement(By.cssSelector(".form-container > form > button")).click();
    }
    //fail
    @Then(":I should see error message {string}")
    public void iShouldSeeErrorMessage(String arg0) {
        String ActualText=driver.findElement(By.className("error")).getText();
        String ExpectedText="auth/invalid-email";
        if(ActualText.equals(ExpectedText)) {
            System.out.println("test case are pass");

        } else {
            System.out.println("test case are Fail");
        }
    }

    @When(":I keep the email id blank  and fill name and password")
    public void iKeepTheEmailIdBlankAndFillNameAndPassword() {
        driver.findElement(By.cssSelector("[name='name']")).sendKeys("Pooja");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("pooja13");
        driver.findElement(By.cssSelector(".form-container > form > button")).click();

    }

    @When(":I keep password field blank and enter email id and name")
    public void iKeepPasswordFieldBlankAndEnterEmailIdAndName() {

    }

    @Then(":I should see this message {string}")
    public void iShouldSeeThisMessage(String arg0) {

    }

    @When(":I enter space in all input field")
    public void iEnterSpaceInAllInputField() {

    }

    @Then(":I should not able to enter space")
    public void iShouldNotAbleToEnterSpace() {

    }

    @When(":I enter special character and number in name field")
    public void iEnterSpecialCharacterAndNumberInNameField() {

    }

    @Then(":I should not able to enter number and  special character  name field .")
    public void iShouldNotAbleToEnterNumberAndSpecialCharacterNameField() {
    }
}