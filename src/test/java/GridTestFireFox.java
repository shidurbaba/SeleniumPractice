import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTestFireFox {


    @Test
    public void HomePageCheck() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.216:4444"), desiredCapabilities);
        driver.get("https://mvnrepository.com/");
        driver.findElement(By.cssSelector("#query")).sendKeys("selenium");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
