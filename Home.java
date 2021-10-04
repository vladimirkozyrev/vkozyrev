package AspPackage;

import org.openqa.selenium.By;

public class Home extends Run {
	public static void Verify_HomePage(String ssName) throws Exception{
		String sTitle = driver.getTitle();
		System.out.println("The page title is : " +sTitle);
		if(driver.getPageSource().contains(sVerifyHome)){
		     System.out.println("[Page title]>>> Page title is correct");
		    }
		else {
			System.out.println("Cannot open home page");
		}	
		
	}
	
	public static void Click_SpandAndSave() {
		driver.findElement(By.linkText("Spend & Save")).click();	
	}

}

