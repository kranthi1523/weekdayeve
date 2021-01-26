package testNgConcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.BaseUtil;

public class Tc003_LoginIntoSurveyMonkeyApplication extends BaseUtil {
	BaseUtil b=new BaseUtil();
	By userName=By.id("username");
	By password=By.id("password");
	By loginBtn=By.xpath("//*[@id=\'sign_in_form\']/fieldset/div/div[5]/button");
	By dashBoardlink=By.linkText("Dashboard");
	@Test(priority=1)
	public void invokeApplication() {
		b.launchBrowser("Chrome");
	    driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
	    
	}
	@Test(priority=2)
   public void loginIntoApplication() throws InterruptedException {
		driver.findElement(userName).sendKeys("seleniumtraining1");
		driver.findElement(password).sendKeys("selenium1234");
		driver.findElement(loginBtn).click();
		String expval="Dashboard";
		Thread.sleep(2000);
		String actval=driver.findElement(dashBoardlink).getText();
		if(actval.equalsIgnoreCase(expval)) {
			System.out.println("logged in Succesfully");
		}else {
			System.out.println("loggin failed");
		}
	}
			
}
/*
 * invocationCount=10
 * invocationCount=10
 * invocationCount=10
 * invocationCount=10
 * invocationCount=10 for running the same test multiple times
 * invocationCount=10 for running the same test multiple times
 * Assert.assertEquals(item1,item2) for comparing two items,if it fails the next code in the test will not be executed
 * Assert.assertEquals(item1,item2)for comparing two items
 * @Test(invocationCount=10) for running the same test multiple times
 * SoftAssert sa=new SoftAssert();
 * sa.assertEquals(item1,item2);
 * dependsOnMethods={"logintest","bookTickets"}
 * dependsOnMethods={"logintest","bookTickets"}
 * dependsOnMethods={"logintest","booktickets"}
 * 
 */
