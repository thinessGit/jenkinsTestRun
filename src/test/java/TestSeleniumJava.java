import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSeleniumJava {

    @Test
    public void testGoogleSite()
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        //System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        System.out.println("### Title ###");
        System.out.println(driver.getTitle());
        System.out.println("### ---- ###");
        Assert.assertTrue("Page Title is not corect",driver.getTitle().trim().equalsIgnoreCase("Google") );


    }

}
