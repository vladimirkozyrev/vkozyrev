package AspPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardAspiration extends Run {

	public static void Veify_Email() throws Exception{
		Thread.sleep(sSleepTime);
		 String sEmailEditBoxId = "join-waitlist-input";
		   Boolean bDisplay = driver.findElement(By.id (sEmailEditBoxId)).isDisplayed();
		   Boolean bEnabled = driver.findElement(By.id (sEmailEditBoxId)).isEnabled();
		    if (bDisplay==true && bEnabled==true) {
		    	WebElement mail = driver.findElement(By.id(sEmailEditBoxId));
		    	mail.click();
		    	mail.sendKeys("tester@mail.com");
		      System.out.println("[Test]>>> Email input box is displayed and enabled");
		    }
		    else {
		      System.out.println("[Test]>>> Email input box is missing ");
		    }
		}
		

	}
	
