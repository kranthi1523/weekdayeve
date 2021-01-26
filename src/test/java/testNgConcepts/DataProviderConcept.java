package testNgConcepts;
import org.testng.annotations.DataProvider;
import dataProviderUtil.DataProviderTest;
import org.testng.annotations.Test;

public class DataProviderConcept {

	@Test(dataProviderClass=DataProviderTest.class,dataProvider="getData")
	public void customerDetailsTest(String firstName,String lastName,String emailId,String phoneNo,String course) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(emailId);
		System.out.println(phoneNo);
		System.out.println(course);
	}
	/*@DataProvider
	public Object[][]getData(){
	Object details[][]=new Object[2][5];
	details[0][0]="kranthi";
	details[0][1]="kiran";
	details[0][2]="kranthi@gmail.com";
	details[0][3]="7857454359";
	details[0][4]="Selenium";
	details[1][0]="ramesh";
	details[1][1]="mukka";
    details[1][2]="ramesh@gmail.com";
	details[1][3]="235436436";
	details[1][4]="APITesting";
	return details;
	}*/
	
}
