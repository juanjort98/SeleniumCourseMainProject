package pages;


public class PrincipalPage extends BasePage {

    // Other way to do it:
    // private String sectionLink = "//a[normalize-space()='%s'and @href]";

    private String selectPlanButton  = "//a[normalize-space()='Elegir Plan' and @href]";

    private String sectionLinkParametrized(String section){
         String sectionLink = "//a[normalize-space()='"+ section +"'and @href]";
         return sectionLink;
    }

    public PrincipalPage(){
        super(driver);
    }

    //Method to navigate to the page

    public void navigateToPage(){
        driver.manage().window().maximize();
        navigateTo("https://www.freerangetesters.com/"); 
    }

    public void clickOnNavigationBar(String section){
        // Other way to do it:
        // String xpathSection = String.format(sectionLink, section);
        String xpathSection = sectionLinkParametrized(section);
        clickElement(xpathSection);
    }

    public void selectPlan(){
        clickElement(selectPlanButton);
    }
    
}
