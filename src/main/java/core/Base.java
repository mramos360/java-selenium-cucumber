package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static WebDriver driver;

    public WebDriver setup(String browser)
    {
        if (browser.toUpperCase().equals("CHROME"))
        {
            System.setProperty("webdriver.chrome.driver", "");
            return new ChromeDriver();
        }
        return null;
    }
}
