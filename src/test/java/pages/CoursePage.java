package pages;


public class CoursePage extends BasePage{


    private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";
    

    public CoursePage() {
        super(driver);
    }

    public void clickCourseLink(){
        clickElement(fundamentosTestingLink);
    }


    
}
