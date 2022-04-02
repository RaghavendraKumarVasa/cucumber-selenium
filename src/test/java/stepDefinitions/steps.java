package stepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.googlePage;

import java.time.Duration;

public class steps {
    static WebDriver driver;
    public static String browser=null;
    googlePage GooglePage;

    //This method should be included in step definition file to open browser when suite starts
    @BeforeAll
    public static void browserSetup() {
        configuration.getProperties();
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

    //This method should be included in step definition file to quit the browser when suite ends
    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }

    @Before
    public void pageInitialize(){
        // Initialization of pages at every scenario start
        GooglePage=new googlePage(driver);
    }

    //Steps are written below
    @Given("user is on google homepage")
    public void user_is_on_google_homepage() {
        GooglePage.openUrl();
    }

    @Then("search box is displayed")
    public void search_box_is_displayed() {
        GooglePage.checkSearchBoxIsDisplayed();
    }

    @Then("search box is enabled")
    public void search_box_is_enabled() {
        GooglePage.checkSearchBoxIsEnabled();
    }
}
