import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoFeature {
    @Given("I have a precondition")
    public void iHaveAPrecondition() {

        System.out.println("I am from GIVEN step");
        //CODE
        //CODE
    }

    @When("I perform some action")
    public void iPerformSomeAction() {
        System.out.println("I am from WHEN step");
        //CODE
        //CODE
    }

    @Then("I see the result or verification")
    public void iSeeTheResultOrVerification() {
        System.out.println("I am from THEN step");
        //CODE
        //CODE
    }

    @Given("I go to the icream shop")
    public void iGoToTheIcreamShop() {
        System.out.println("I am from icream shop");
    }

    @When("I purchase iceream {word}")
    public void iPuchaseIcereamName(String name) {
        System.out.println("Name of icream : "+name);
    }

    @Then("I can eat the icream {word}")
    public void iCanEatTheIcreamName(String name) {
        System.out.println("Name of icream for eating : "+name);
    }

    @And("I pay amount {word}")
    public void iPayAmountPrice(String price) {
        System.out.println("Price of the icream : "+price);
    }
}
