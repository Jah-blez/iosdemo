import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class firstIOSTest {

	public static void main(String[] args) {
		
		firsttest();
	}

	public static void firsttest() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "iPhone 7");
		cap.setCapability("udid", "52036bc260e174e9");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("platformVersion", "11.0");
		cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		  //cap.setCapability("app", "location of .app or .ipa file");
		
		
	}

}
