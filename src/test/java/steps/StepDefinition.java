package steps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.CheckoutPage;
import pages.CoursePage;
import pages.CourseSelectionPage;
import pages.PrincipalPage;

public class StepDefinition {
    //Instances of page classes
    PrincipalPage principalPage = new PrincipalPage();
    CoursePage coursePage = new CoursePage();
    CourseSelectionPage courseSelectionPage = new CourseSelectionPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("I navigate to www.freerangetesters.com")
    public void navigateToWeb() {
        principalPage.navigateToPage();
    }

    @When("I go to {word} using the nav bar")
    public void usingNavBar(String section) {
        principalPage.clickOnNavigationBar(section);
    }

    @And("select introduction to testing")
    public void navigateToIntro() {
        coursePage.clickCourseLink();
        courseSelectionPage.clickCourseToSee();
    }

    @When("I select Elegir Plan")
    public void selectTypeOfPlan() {
        principalPage.selectPlan();
    }

    @Then("I can validate the options in checkout page")
    public void validateCheckoutOption() {
        List<String> realList = checkoutPage.returnDropdownValues();
        List<String> expectedList = Arrays.asList("Academia: $16.99 / mes • 13 productos","Academia: $176 / año • 13 productos", "Free: Gratis • 3 productos");
        Assert.assertEquals(realList, expectedList);
    }

}
