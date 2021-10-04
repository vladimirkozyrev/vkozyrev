package AspPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class Run implements Global {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\geckodriver.exe");
		driver.get(sUrl);
		Home.Verify_HomePage(sVerifyHome);
		if(driver.getPageSource().contains("You can change Climate Change"))
		{
			System.out.println("Climate exist ");
			driver.findElement(By.xpath("/html/body/div[1]/div/header/ul[1]/li[1]/a")).click();
		}
		else {
			  Thread.sleep(5000);
		      System.out.println("[Plant Your Change]>>> Page title is correct");
		      driver.findElement(By.xpath("/html/body/div[1]/div/header/ul[1]/li[1]/a]")).click();
		}

		String sTempUrl = driver.getCurrentUrl();
		System.out.println("url:  "+strUrl);
		SpendAndSave.Verify_CardAspiration();
		SpendAndSave.Verify_CardAspirationPlus();
		SpendAndSave.Click_CardAspiration();
		CardAspiration.Veify_Email();
		driver.get(sTempUrl);
		System.out.println("Temp url:  "+sTempUrl);
		SpendAndSave.Click_CardAspirationPlus();
		CardAspirationPlus.Veify_YearlyrPice();
		CardAspirationPlus.Veify_MonthlyPice();

		driver.close();

	 }
	}

