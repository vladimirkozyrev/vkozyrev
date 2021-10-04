package AspPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public interface Global {
	WebDriver driver = new FirefoxDriver();
	public String sUrl = "https://aspiration.com/";
	public String sVerifyHome = "Aspiration";
	

	public String sVerifyCard1 = "GET ASPIRATION";
    public String sVerifyCard2 = "GET ASPIRATION PLUS";

	public String sPlantYourChange = "Plant Your Change";
	public String sxpathPlantYourChange = "/html/body/div[1]/div/section[8]/div[2]/div[1]/div[1]/h3[1]";
	
	public String sxpathSpendAndSave1 ="/html/body/div[1]/div[1]/main/div/div/spend-save-plans/div/div/div[1]/div[2]/button";
	public String sxpathSpendAndSave2 ="/html/body/div[1]/div[1]/main/div/div/spend-save-plans/div/div/div[2]/div[2]/button";
	
	String strUrl = "";
	Integer sSleepTime = 3000;
	String sYearlyPrice ="$71.88";
	String sMonthlyPice = "$7.99";
	
	
}
