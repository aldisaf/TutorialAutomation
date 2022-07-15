import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;

public class swipemethod extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//tap views
		TouchAction taps = new TouchAction(driver);
		WebElement tapview = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		taps.tap(tapOptions().withElement(element(tapview))).perform();
		
//		tap date widgets
		WebElement tapDateWidget = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		taps.tap(tapOptions().withElement(element(tapDateWidget))).perform();
		
//		tap inline
		WebElement tapInline = driver.findElementByAndroidUIAutomator("text(\"2. Inline\")");
		taps.tap(tapOptions().withElement(element(tapInline))).perform();
		
//		tap clock 9
//		alternative 1
		AndroidElement tapClock = driver.findElementByAccessibilityId("9");
		taps.tap(tapOptions().withElement(element(tapClock))).perform();
		
//		alternative 2
//		WebElement tapClock = driver.findElementByXPath("//*[@content-desc='9']");
//		taps.tap(tapOptions().withElement(element(tapClock))).perform();
		
//		longpress 15 and move to 45 then release
		WebElement pressFifteen = driver.findElementByAccessibilityId("15");
		WebElement moveToFortyFive = driver.findElementByAccessibilityId("45");
		taps.press(element(pressFifteen)).waitAction(waitOptions(ofSeconds(3))).moveTo(element(moveToFortyFive)).release().perform();
		
		
		

	}

}
