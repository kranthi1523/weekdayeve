package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
	public static WebDriver driver;
	public WebDriver launchBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			System.out.println("Browser is not matching");
		}
		return driver;
	}
	
	public void SelectValueFromDropDown(WebElement elemDetails,String value) {
		Select s1=new Select(elemDetails);
		s1.selectByVisibleText(value);
		
	}
}
	
	
	


/* 
 * public void selectValueFromDropDown(WebElement elemDetails,String value){
 * 
 * Select s1=new Select(elemDetails);
 * s1.selectByVisibleText(value);
 * }
 * 
 * Select s1=new Select(driver.findElement(By.id("day"));
 * s1.selectByVisibleText("20");
 *  */
