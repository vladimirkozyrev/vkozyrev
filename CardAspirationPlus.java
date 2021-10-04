package AspPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardAspirationPlus extends Run {

	public static void Veify_YearlyrPice() throws Exception{
		Thread.sleep(sSleepTime);
		String sYearly = driver.findElement(By.cssSelector("div.option:nth-child(1) > p:nth-child(3) > b:nth-child(1)")).getText();
		System.out.println("YearlyPice "+sYearly);
	    if(sYearly.equals(sYearlyPrice)){
		      System.out.println("[Test]>>> YearlyPrice is correct:  " + sYearly);
		    }
		    else{
		      System.out.println("[Test]>>> YearlyPrice is not correct:  "   + sYearly);
		    }
	}	
		
	
	
	public static void Veify_MonthlyPice() throws Exception{

		Thread.sleep(sSleepTime);
		String sMonthly = driver.findElement(By.cssSelector("div.option:nth-child(2) > p:nth-child(3) > b:nth-child(1)")).getText();
		System.out.println("MonthlyPice  "+sMonthly);
	    if(sMonthly.equals(sMonthlyPice)){
		      System.out.println("[Test]>>> MonthlyPice is correct:  " + sMonthly);
		    }
		    else{
		      System.out.println("[Test]>>> MonthlyPice is not correct:  "   + sMonthly);
		    }

	}
}
