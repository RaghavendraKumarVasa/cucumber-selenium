package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", glue = {"stepDefinitions"},
        //tags="@test",
        //dryRun = false,
        monochrome = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty", "html:reports/CucumberHtmlReport.html"
                ,"json:reports/CucumberJsonReport.json",
                "junit:reports/CucumberJunitReport.xml"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
