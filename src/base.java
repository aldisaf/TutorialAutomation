import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver;
		
		//location of apk files
		File appDir = new File("src");
		
		//apk apk name object
		File apk = new File(appDir, "ApiDemos-debug.apk");
		
		//
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//inform device name
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelAldis");
		
		//inform app name
		cap.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		
		//inform atomation name --uiautomator2
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		//set driver to which apps to automate and port number, send all capabilities
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		//create main driver class
		//driver.findE
		
		

	}

}
