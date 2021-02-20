package technicalTest.stepDefinitions;

import technicalTest.interactions.*;
import technicalTest.tasks.go_to_register_page;
import technicalTest.tasks.navigate_to;
import technicalTest.userInterface.home_page;
import technicalTest.utils.read;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class register_user_step_definition {
    private home_page home_page;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^An (.*) want register in UTest\\.com$")
    public void anUserWantRegisterInUTestCom(String user) {
        OnStage.theActor(user).wasAbleTo(navigate_to.on(home_page));
    }


    @Given("^The user go to register page$")
    public void theUserGoToRegisterPage() {
        theActorInTheSpotlight().attemptsTo(go_to_register_page.GoToRegister());
    }

    @When("^The user register the personal data$")
    public void theUserRegisterThePersonalData(DataTable data) throws InterruptedException {
        read.the(data);
        theActorInTheSpotlight().attemptsTo(fill_register_data_page.FillRegisterDataPage.FieldsFill());
    }


    @Then("^Verify message of registration satisfactly$")
    public void verifyMessageOfRegistrationSatisfactly() {

    }
}
