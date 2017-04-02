package combaba;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Acer on 30/03/2017.
 */
public class MyStepdefs {
    HomePage homePage = new HomePage();
    @Given("^User is on home page$")
    public void userIsOnHomePage() throws Throwable {
        homePage.checkTitle();


    }

    @When("^user entered his valid details$")
    public void userEnteredHisValidDetails() throws Throwable {

    }

    @Then("^user will get msg register successful$")
    public void userWillGetMsgRegisterSuccessful() throws Throwable {

    }
}
