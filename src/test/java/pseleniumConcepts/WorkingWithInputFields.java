package pseleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.BaseUtil;

public class WorkingWithInputFields extends BaseUtil {

	public static void main(String[] args) {
		BaseUtil b=new BaseUtil();
		b.launchBrowser("Chrome");
		
		driver.get("https://www.facebook.com");
		/*WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("Training1");
       String Value1=userName.getAttribute("value");
        System.out.println(Value1);
		driver.findElement(By.id("password")).sendKeys("selenium1234");
		driver.findElement(By.xpath("//*[@id=\'sign_in_form\']/fieldset/div/div[5]/button")).click();*/
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			String linkName=links.get(i).getText();
			System.out.println(linkName);
		}
	}

}
