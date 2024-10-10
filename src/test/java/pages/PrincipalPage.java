package pages;

public class PrincipalPage extends BasePage {

    public PrincipalPage(){
        super(driver);
    }

    //Method to navigate to the page

    public void navigateToPage(){
        navigateTo("https://www.freerangetesters.com/");
    }
    
}
