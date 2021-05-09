package Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.LoginPage;
import Utility.ExcelData;


public class LoginTest extends BaseTest {
	
	@Test(dataProvider = "dp")
  public void verifyLogin(String username,String password) {
		driver.get("http://demo.guru99.com//test//newtours//");
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Welcome: Mercury Tours";
		Assert.assertEquals(actualtitle, expectedtitle);
		  
		LoginPage lp=new LoginPage(driver);
		lp.SetUsername(username);
		lp.SetPassword(password);
		lp.ClickSubmit();	
		
		String acttitle=driver.getTitle();
		String exptitle="Login: Mercury Tours";
		Assert.assertEquals(acttitle, exptitle);
	
	}
	  @DataProvider
	  public Object[][] dp() throws InvalidFormatException, IOException {
		  Object[][] data=ExcelData.getDataFromSheet("D:\\TestingNotes\\Selenium\\excel\\exceldata.xlsx");
		  return data;
	  }
}
