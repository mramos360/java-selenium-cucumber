package steps;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Hook {

    private BaseTest base;

    public Hook(BaseTest base)
    {
        this.base = base;
    }

    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed())
        {

        }
        base.driver.quit();
    }
}
