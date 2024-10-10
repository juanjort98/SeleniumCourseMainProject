package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\resources", //Directory of .feature files
    glue = "steps",   //Package with classes with steps defined in feature file
    plugin = {"pretty", "html:target/cucumber-reports"})

public class TestRunner {
@AfterClass
public static void cleanDriver(){
        BasePage.closeBrowser();
}   
}
