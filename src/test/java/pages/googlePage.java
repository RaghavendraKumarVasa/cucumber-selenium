package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class googlePage {
    //driver must be initialized in every page factory
    protected WebDriver driver;
    public static String url=null;

    // locators
    @FindBy(xpath="//input[@name='q']") private WebElement txt_searchBox;

    //Initialization of elements must be done in every page factory
    public googlePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //methods are written below
    public void openUrl(){
        driver.get(url);
    }

    public void checkSearchBoxIsDisplayed(){
        Assert.assertTrue(txt_searchBox.isDisplayed());
    }

    public void checkSearchBoxIsEnabled(){
        Assert.assertTrue(txt_searchBox.isEnabled());
    }
}
