package pages;


public class CourseSelectionPage extends BasePage{

    String selectorIntroToTesting = "//h4[normalize-space()='Introducción al Testing de Software']";

    public CourseSelectionPage() {
        super(driver);
        
    }

    public void clickCourseToSee(){
        clickElement(selectorIntroToTesting);
    }
    
}
