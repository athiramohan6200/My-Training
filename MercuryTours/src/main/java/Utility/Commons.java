package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Commons {
	WebDriver driver;
	public Commons(WebDriver driver) {
		this.driver=driver;	
	}
	public void doSendKeys(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	public void selectByVisibleTextDropDown(WebElement element, String value) {
		 Select objselect=new Select(element);
		 objselect.selectByVisibleText(value);
	}
	public void selectByIndexDropDown(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
}
