package AspPackage;
import org.openqa.selenium.By;

public class TranslateHome extends TranslateRun {
	  
	public static void Verify_HomePage(String ssName) throws Exception{
	    
		Thread.sleep(sSleepTime*2);
		String sTitle = driver.getTitle();
		System.out.println("The page title is : " +sTitle);
		if(driver.getTitle().contains(sPageTitle)){
		     System.out.println("Page title is correct");
		    }
		else {
			System.out.println("Cannot open home page");
		}	
	}
	
	public static void Open_LeftList() throws Exception{
		String xpathLeftList= "//div[2]/button/div[3]";
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.xpath (xpathLeftList)).isEnabled()){
			driver.findElement(By.xpath (xpathLeftList)).click();
			System.out.println("Clicked on left language drop-down menu ");
		}
		else {
		System.out.println("Button left language drop-down menu does not exist ");
		}
	}
		public static void Select_LeftLanguage(String sxpath) throws Exception{
		Thread.sleep(sSleepTime);
		//System.out.println(">>>>>>"+sxpath+"<<<<<");
		String ssxpath = "//*[text()='"+sxpath+"']";
		if (driver.findElement(By.xpath (ssxpath)).isEnabled()){
			driver.findElement(By.xpath (ssxpath)).click();
			System.out.println("Language selected");
		}
		else {
		System.out.println("Language does not exist ");
		}
	}	
	public static void Open_RightList() throws Exception{
		String xpathRightList= "//div[5]/button/div[3]";
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.xpath (xpathRightList)).isEnabled()){
			driver.findElement(By.xpath (xpathRightList)).click();
			System.out.println("Clicked on right language drop-down menu ");
		}
		else {
		System.out.println("Button right language drop-down menu does not exist ");
		}
	}
	public static void Select_RightLanguage (String sxpath) throws Exception{
				Thread.sleep(sSleepTime*2);
		System.out.println(">>>>>>"+sxpath+"<<<<<");
				String ssxpath = "//*[text()='"+sxpath+"']";
				System.out.println(">>>--->>>"+ssxpath+"<<<---<<");
				ssxpath = xpathSpanish; //???
				if (driver.findElement(By.xpath (ssxpath)).isEnabled()){
					driver.findElement(By.xpath (ssxpath)).click();
					System.out.println("Language selected");
				}
				else {
				System.out.println("Language does not exist ");
				}
	}
	
	public static void Set_LeftText (String sText) throws Exception{
		String xpathLeftTextAria= "//span/span/div/textarea";
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.xpath (xpathLeftTextAria)).isEnabled()){
			driver.findElement(By.xpath (xpathLeftTextAria)).sendKeys(sText);
			System.out.println("Typed text: "+sText);
		}
		else {
		System.out.println("Text area does not exist ");
		}
	}
	
	public static void Verify_Translation (String sText) throws Exception{
		String xpathRightTextAria= "//div[6]/div/div[1]";
		Thread.sleep(sSleepTime*2);
		if (driver.findElement(By.xpath (xpathRightTextAria)).isEnabled()){
			String sTranslation = driver.findElement(By.xpath (xpathRightTextAria)).getText();
			System.out.println(">>>"+sTranslation+"<<<");
			if (sTranslation.trim().equals(sText)){
				System.out.println("Translation is corect ");
			}
		else {
			System.out.println("Translation is not corect ");
		 }	
		}
		else {
		System.out.println("Text area does not exist ");
		}	
	}
	
	public static void Click_Swap () throws Exception{
		String xpathSwap = "//div[3]/div/span/button/div[3]";		
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.xpath (xpathSwap)).isEnabled()){
			driver.findElement(By.xpath (xpathSwap)).click();
			System.out.println("Swapped languages");
		}
		else {
		System.out.println("Cannot swap languages");
		}
	}
	
	public static void Click_ClearText() throws Exception{
		String cssClearText = ".GA2I6e > div:nth-child(4)";
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.cssSelector (cssClearText)).isEnabled()){
			driver.findElement(By.cssSelector (cssClearText)).click();
			System.out.println("Text cleared");
		}
		else {
		System.out.println("Cannot clear text");
		}
	}
	
	public static void Open_InputTool() throws Exception{
		String xpathInputTool = "//span/div/a[2]/span";
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.xpath (xpathInputTool)).isEnabled()){
			driver.findElement(By.xpath (xpathInputTool)).click();
			System.out.println("Input tool drop down is opened");
		}
		else {
		System.out.println("Cannot open input tool drop down");
		}
	}
	
	public static void Select_ScreenKeyboard() throws Exception{
		String xpathKeyboard = "/html/body/ul/li[1]/span[3]";
		Thread.sleep(sSleepTime);
		if (driver.findElement(By.xpath (xpathKeyboard)).isEnabled()){
			driver.findElement(By.xpath (xpathKeyboard)).click();
			System.out.println("Screen Keyboard is selected");
		}
		else {
		System.out.println("Cannot select screen keyboard");
		}
	}
}
