package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class CommonMethods {

    public static AppiumDriver driver;

    public static void launchApplication() throws MalformedURLException {
        ConfigReader.readProperties();
        //we need the application path
        File appDir = new File("apk");
        File app = new File(appDir, "TestApp.apk");
        //desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //setting the path of  the apk file for opening the app
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automatorName","UIAutomator2");
        capabilities.setCapability("noSign","true");
        capabilities.setCapability("appPackage",
                ConfigReader.getPropertyValue("appPackage"));
        capabilities.setCapability("appActivity",
                ConfigReader.getPropertyValue("appActivity"));
        //address of the appium server I got
        URL u = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver(u, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application opened");
    }


}
