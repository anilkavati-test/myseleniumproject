package alertsOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Alerts_ClickOperation {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://www.tsrtconline.in";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
 //<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
       	WebElement CheckAvailabilityButton = driver.findElement(By.id("searchBtn"));
       	CheckAvailabilityButton.click();
       	
       	Alert alert = driver.switchTo().alert();
       	
       	String alertMessage = alert.getText();
       	System.out.println("The text of an alert is:"+alertMessage);
       	
       	alert.accept();
       	
       	driver.quit();
       	
	}
    
}
