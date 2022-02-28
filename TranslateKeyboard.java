package AspPackage;

import org.openqa.selenium.By;

public class TranslateKeyboard extends TranslateRun  {

	public static void Type_Key (String scss, String skey) throws Exception{
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.cssSelector (scss)).isDisplayed()){
			driver.findElement(By.id (skey)).click();
			switch (skey) {
				case "K16":
					System.out.println(">>> Shift is typed");
					break;
				case "K72":
					System.out.println(">>> H is typed");
					break;
				case "K73":
					System.out.println(">>> i is typed");
					break;
				case "K49":
					System.out.println(">>> ! is typed");
					break;
			default:
			}
		}
		else {
				System.out.println("Cannot type: "+ skey);	
		}
	}
	
	public static void Close_Keyboard () throws Exception{
		String xpathCloseKeyboard = "//div[@id='kbd']/div/div[2]/div/div";
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.xpath (xpathCloseKeyboard)).isEnabled()){
			driver.findElement(By.xpath (xpathCloseKeyboard)).click();
			System.out.println("Keyboard is closed");
		}
		else {
		System.out.println("Cannot close keyboard");
		}
	}
}
