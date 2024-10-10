package steps;

import io.cucumber.java.en.Given;
import pages.PrincipalPage;

public class StepDefinition {

    PrincipalPage principalPage = new PrincipalPage();
    
    @Given("I navigate to www.freerangetesters.com")
    public void navigateToWeb() {
        principalPage.navigateToPage();
    }
}
