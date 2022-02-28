package AspPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface TranslateGlobal {
	WebDriver driver = new FirefoxDriver();
	public String sUrl = "https://translate.google.com/";
	public String sPageTitle = "Google Translate";
	Integer sSleepTime = 1000;
	
	String xpathGerman= "//div[1]/div/div[3]/div/div[3]/div[31]/div[2]";
	String xpathSpanish= "//div[2]/div/div[3]/div/div[2]/div[90]/div[2]";
	String xpathEnglish= "//div[1]/div/div[3]/div/div[3]/div[22]/div[2]";

	String sLeftText = "Demokratien";
	String sRightText = "Democracias";

	String cssDialogKeyboard ="#kbd";
    String sH = "K72";
    String sI = "K73";
    String sShift = "K16";
    String sExclamationMark = "K49";

}
