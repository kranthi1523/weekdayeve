package pseleniumConcepts;

import utilities.BaseUtil;

public class WebDriverManagerConcepts extends BaseUtil {

	public static void main(String[] args) {
		BaseUtil b=new BaseUtil();
b.launchBrowser("Chrome");
        driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		

	}

}
