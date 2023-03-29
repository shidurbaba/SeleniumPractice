package selenium4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v111.emulation.Emulation;

import java.util.Optional;

public class mobileEmulator {

    public static void main(String[] args) {
        //Step 1
        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();

        //Step 2
        devTools.createSession();

        //send commands to CDP (ChromeDev Tools) methods will invoke and get access to chrome dev tools
        devTools.send(Emulation.setDeviceMetricsOverride(600,1000,75,true, Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty(),Optional.empty()));



    }


}
