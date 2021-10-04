package AspPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpendAndSave extends Run  {
	public static void Verify_CardAspiration() throws Exception{
	Thread.sleep(sSleepTime);
	//String xpathCard1= "/html/body/div[1]/div[1]/main/div/div/spend-save-plans/div/div/div[1]/div[2]/button";
	String xpathCard1= "//div/spend-save-plans/div/div/div[1]/div[2]/button";
    WebElement button = driver.findElement(By.xpath (xpathCard1));
    String sTest = button.getText();
    System.out.println("=== Card === :  " + sVerifyCard1);
    if(sTest.equals(sVerifyCard1)){
      System.out.println("[Test]>>> Card title is correct:  " + sVerifyCard1);
    }
    else{
      System.out.println("[Test]>>> Card title does not exist:   " + sVerifyCard1);
    }	
	 
	}	
	
	public static void Verify_CardAspirationPlus() throws Exception{
		Thread.sleep(sSleepTime);
		//String xpathCard2= "/html/body/div[1]/div[1]/main/div/div/spend-save-plans/div/div/div[2]/div[2]/button";
		String xpathCard2= "//div/spend-save-plans/div/div/div[2]/div[2]/button";
	    WebElement button2 = driver.findElement(By.xpath (xpathCard2));
		String sTest2 = button2.getText();
	    System.out.println("=== Card === :  " + sVerifyCard2);
	    if(sTest2.equals(sVerifyCard2)){
	      System.out.println("[Test]>>> Card title is correct:  " + sVerifyCard2);
	    }
	    else{
	      System.out.println("[Test]>>> Card title does not exist:   " + sVerifyCard2);
	    }	
		
		}	
	public static void Click_CardAspiration() throws Exception{
		Thread.sleep(sSleepTime);
		String xpathCard1= "/html/body/div[1]/div[1]/main/div/div/spend-save-plans/div/div/div[1]/div[2]/button";
		WebElement button1 = driver.findElement(By.xpath (xpathCard1));
		if (button1.isEnabled()){
			button1.click();}
		else {
			System.out.println("[Card Aspiration]>>> does not exist ");
		}
	}
		
	public static void Click_CardAspirationPlus() throws Exception{
		Thread.sleep(sSleepTime);
		String xpathCard2= "/html/body/div[1]/div[1]/main/div/div/spend-save-plans/div/div/div[2]/div[2]/button";
		WebElement button2 = driver.findElement(By.xpath (xpathCard2));

		if (button2.isEnabled()){
			button2.click();}
		else {
			System.out.println("[Card Aspiration Plus]>>> does not exist ");
		}
		
	}
	
	
	
	
	
	
	
}
