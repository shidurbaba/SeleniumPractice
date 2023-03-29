import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridTestChrome {

    /* Step 1: Start a hub
    java -jar selenium-server-4.8.2.jar hub
    Step 2: Connect hub to nodes in your local machine
    *java -jar selenium-server-4.8.2.jar node --detect-drivers true
    *
    *
    * */


    @Test
    public void HomePageCheck() throws MalformedURLException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        //chromeOptions.merge(desiredCapabilities);
       // DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(CapabilityType.TIMEOUTS,"1000");
//        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.216:4444"), chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mvnrepository.com/");
        driver.findElement(By.cssSelector("#query")).sendKeys("selenium");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
