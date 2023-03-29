import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice extends Base {

    public static void main(String[] args) throws InterruptedException {

        Base base = new Base();
      /*  WebDriver chrome = base.startHeadlessBrowser();*/
        WebDriver chrome = base.startWebBrowser();
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chrome.get("https://www.tutorialspoint.com/");

        String title = chrome.getTitle();
        System.out.println(title);
        Thread.sleep(1000);
        chrome.quit();

    }





}
