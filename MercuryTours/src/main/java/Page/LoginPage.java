package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utility.Commons;


public class LoginPage {
	WebDriver driver;
	Commons com;
	@FindBy(name="userName")
	private WebElement usertxt;
	
	@FindBy(name="password")
	private WebElement passtxt;

	@FindBy(how = How.NAME, using = "submit") 
	private WebElement submitbtn;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		com=new Commons(driver);
	}
	public void SetUsername(String username) {
		//WebElement usertxt=driver.findElement(By.name("userName"));
		//usertxt.sendKeys(username);
		
		com.doSendKeys(usertxt, username);
	}
	public void SetPassword(String password) {
	//	WebElement passtxt=driver.findElement(By.name("password"));
		//passtxt.sendKeys(password);
		
		com.doSendKeys(passtxt, password);
		
	}
	public void ClickSubmit() {
		//submitbtn=driver.findElement(By.name("submit"));
		submitbtn.click();
	}
	

}
