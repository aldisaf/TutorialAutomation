import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//TAP
//		for tap expandable list
		TouchAction taps = new TouchAction(driver);
		WebElement expandList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		taps.tap(tapOptions().withElement(element(expandList))).perform();
		
//		for tap custom adapter
		WebElement custAdap = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
		taps.tap(tapOptions().withElement(element(custAdap))).perform();
		
//		for long press people names
		WebElement longpressPeopleName = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		taps.longPress(longPressOptions().withElement(element(longpressPeopleName)).withDuration(ofSeconds(2))).release().perform();
		
//		System.out.println(driver.findElementById("android:id/title").isDisplayed()); to make sure the correct page is displayed
		
	}

}
