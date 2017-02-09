package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Zahid on 1/31/2017.
 */
public class Base {

    public static AppiumDriver ad = null;
    public String OS = null;
    public String deviceName = null;
    public String version = null;
    public File appDirectory = null;
    public File findApp = null;
    public DesiredCapabilities cap = null;


    @Parameters({"OS", "deviceName"})
    @BeforeMethod
    public void setUp(String OS, String deviceName) throws MalformedURLException {

        if (OS.equalsIgnoreCase("Android")) {

            appDirectory = new File("/Users/icecube/IdeaProjects/Mobile-Automation/Android/src/GrubHubApp");
            findApp = new File(appDirectory, "GrubHub.apk");
            cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            //cap.setCapability("avd", deviceName);
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
            ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            ad.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);



        }else if (OS.contains("ios")){

            appDirectory = new File("/Users/icecube/IdeaProjects/Mobile-Automation/iOS/src/CatalogApp");
            findApp = new File(appDirectory,"UICatalog6.1.app.zip");
            cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
            cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
            ad = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

    }

    @AfterMethod
    public void tearDown(){
        ad.closeApp();
        ad.quit();
    }


    public void clickByXpath(String locator){
        ad.findElement(By.xpath(locator)).click();
    }

    public void sleep(int sec)throws InterruptedException{
        Thread.sleep(1000 * sec);
    }

    public void typeByXpath(String locator, String value){
        ad.findElementByXPath(locator).sendKeys(value);
    }

}
