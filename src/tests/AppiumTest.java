package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.HasTouchScreen;
import io.appium.java_client.MobileDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumTest {

    private static double nativeX;
    private static double nativeY;
    private static double coeffX;
    private static double coeffY;

    public static void main(String[] args) throws MalformedURLException {

        //Set the Desired Capabilities

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("udid", "2b3fdeab"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.1.1");
        caps.setCapability("appPackage", "com.penske.mobile.drivers.qa");
        caps.setCapability("appActivity", "com.penske.mobile.drivers.LaunchActivity_");
        caps.setCapability("noReset", "true");
        caps.setCapability("newCommandTimeout", 100);
        //  caps.setCapability("autoWebview", "true");

        //Instantiate Appium Driver

        // WebDriver chromedriver = new ChromeDriver();
        AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // WebDriverWait wait = new WebDriverWait(driver, 10);
        //  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.penske.mobile.drivers.qa:id/signIn")));
      //  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //   element = driver.findElementById("com.penske.mobile.drivers.qa:id/signIn");

        //   TouchAction touchAction=new TouchAction(driver);
        //   touchAction.tap(touchAction, touchAction).perform();

//
//        try {
//
//            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//            driver.findElement(By.id("com.penske.mobile.drivers.qa:id/signIn")).isDisplayed();
//           // driver.findElement(By.id("com.penske.mobile.drivers.qa:id/signIn")).click();
//
//            System.out.println("Element is Visible");
//        } catch (NoSuchElementException e) {
//            throw new RuntimeException("Element is not visile");
//        }





        WebElement el  = driver.findElement(By.id("com.penske.mobile.drivers.qa:id/signIn"));
        TouchActions action = new TouchActions(driver);
        action.singleTap(el);
        action.perform();


//        try {
//
//
//            WebElement exceptionTestButton = driver.findElement(By.id("com.penske.mobile.drivers.qa:id/signIn"));
//            Assert.assertNotNull("Button should be found.", exceptionTestButton);
//            TouchActions tapAction = new TouchActions(driver).singleTap(exceptionTestButton);
//            tapAction.perform();
//        } catch (Exception e) {
//            String message = e.getMessage();
//            Assert.assertTrue(message.contains("Unhandled exception from application under test."));


            // driver.findElementById("com.penske.mobile.drivers.qa:id/signIn").click();


//
//        Set<String> contextNames = driver.getContextHandles();
//        for (String contextName : contextNames) {
//            System.out.println(contextNames); //prints out something like NATIVE_APP \n WEBVIEW_1
//        }
//        driver.context(contextNames.toArray()[1]); // set context to WEBVIEW_1
//
////do some web testing
//        String myText = driver.findElementById("com.penske.mobile.drivers.qa:id/signInText").click();
//
//        driver.context("NATIVE_APP");
//
//


        }

    }








