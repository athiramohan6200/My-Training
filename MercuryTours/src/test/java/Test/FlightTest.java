package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.FlightPage;
import Page.LoginPage;

public class FlightTest extends BaseTest {

	 @Test(priority=2)
	 public void verifyFlightPage() {
	  FlightPage fp=new FlightPage(driver);
	  fp.FlightLink();
	  fp.FlightCheck();
	  
	  SoftAssert sf=new SoftAssert();
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Find a Flight: Mercury Tours:";
	  sf.assertEquals(actualtitle, expectedtitle);
	  sf.assertAll();
	 }
	 @Test(priority=1)
	 public void verifyLoginPage() {
		 LoginPage lp=new LoginPage(driver);
		 lp.SetUsername("tutorial");
		 lp.SetPassword("tutorial");
		 lp.ClickSubmit();
	 }
}
