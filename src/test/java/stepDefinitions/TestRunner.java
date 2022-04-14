package stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/features", glue= {"stepDefinitions"},
        //tags="@test",
        dryRun = false,
        monochrome=true,
        plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "pretty","html:reports/CucumberReports/CucumberHtmlReport.html",
                "json:reports/CucumberReports/CucumberJsonReport.json",
                "junit:reports/CucumberReports/CucumberJunitReport.xml"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
