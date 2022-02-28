package AspPackage;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TranslateRun implements TranslateGlobal{

	public static void main(String[] args) throws Exception {
//======================= Initialize ========================================
				FileInputStream fs = new FileInputStream("C:\\webdriver\\test.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				XSSFSheet sheet = workbook.getSheetAt(0);
				//System.out.println(sheet.getRow(0).getCell(0).getStringCellValue()); 
				String sGerman = sheet.getRow(0).getCell(0).getStringCellValue().replaceAll("\u00A0", "");
		System.out.println(">>>"+sGerman+"<<<");	
				//System.out.println(sheet.getRow(1).getCell(0));
				String sSpanish = sheet.getRow(1).getCell(0).getStringCellValue().replaceAll("\u00A0", "");			
		System.out.println(">>>"+sSpanish+"<<<");
				//System.out.println(sheet.getRow(2).getCell(0));
				String sDemokratien = sheet.getRow(2).getCell(0).getStringCellValue().replaceAll("\u00A0", "");		
		System.out.println(">>>"+sDemokratien+"<<<");
				//System.out.println(sheet.getRow(3).getCell(0));
				String sDemocracias = sheet.getRow(3).getCell(0).getStringCellValue().replaceAll("\u00A0", "");	
		System.out.println(">>>"+sDemocracias+"<<<");
				workbook.close();
//===============================================================
	
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver.get(sUrl);
	// Verify Translate Page 
		TranslateHome.Verify_HomePage(sPageTitle);
	// Select Left list 
		TranslateHome.Open_LeftList();  
	// Select German 
		TranslateHome.Select_LeftLanguage(sGerman);
		driver.navigate().refresh();
	// Select Right list
		TranslateHome.Open_RightList();
	//Select Spanish 
		TranslateHome.Select_RightLanguage (sSpanish);
	// Type left text
		TranslateHome.Set_LeftText(sDemokratien);
	// Get Translation Text
		TranslateHome.Verify_Translation(sDemocracias);
	// Click Swap
		TranslateHome.Click_Swap();
	// Verify Swap
		TranslateHome.Verify_Translation(sDemokratien);
	// Clear text
		TranslateHome.Click_ClearText();
	// Open input tool drop down 
		TranslateHome.Open_InputTool();
	// Select screen keyboard 
		TranslateHome.Select_ScreenKeyboard();
	// Enter "Hi!"       
		TranslateKeyboard.Type_Key(cssDialogKeyboard, sShift );
		TranslateKeyboard.Type_Key(cssDialogKeyboard, sH );
		TranslateKeyboard.Type_Key(cssDialogKeyboard, sI );
		TranslateKeyboard.Type_Key(cssDialogKeyboard, sShift );
		TranslateKeyboard.Type_Key(cssDialogKeyboard, sExclamationMark );
	//Close keyboard  
		TranslateKeyboard.Close_Keyboard ();
		
		
		driver.close();
		System.out.println("Browser closed");
	}
}

	
	
	
	
	
	
	

