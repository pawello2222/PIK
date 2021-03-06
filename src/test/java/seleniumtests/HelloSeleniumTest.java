package seleniumtests;
/**
 * Created by Marek on 04.06.2016.
 */
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HelloSeleniumTest
{
    @Test
    public void startWebDriver()
    {
        WebDriver driver = new HtmlUnitDriver();

        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("title should start with Selenium Simplified",driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        driver.quit();
    }

}

