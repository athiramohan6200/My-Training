package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.Commons;

public class FlightPage {
	
	WebDriver driver;
	 List<WebElement> radiobutton1,radiobutton2,departlist;
	 WebElement departfrom,continuebtn,month,day,to_month,to_day,depart_to,passenger;
	 Commons com;
	
	public FlightPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 com=new Commons(driver);
	}
	
	public void FlightLink() {
		
		  WebElement link1 =driver.findElement(By.linkText("Flights"));
		  link1.click();
	 }
	
	 public void FlightCheck() {
		 
		 radiobutton1=driver.findElements(By.name("tripType"));
		 radiobutton2=driver.findElements(By.name("servClass"));
		
		 continuebtn =driver.findElement(By.name("findFlights"));
		
		 departfrom =driver.findElement(By.name("fromPort"));
		 month=driver.findElement(By.name("fromMonth"));
		 day=driver.findElement(By.name("fromDay"));
		 depart_to=driver.findElement(By.name("toPort"));
		 to_month=driver.findElement(By.name("toMonth"));
		 to_day=driver.findElement(By.name("toDay"));
		 
		 radiobutton1.get(1).click();
		 radiobutton2.get(2).click();
				
		 Select departdp=new Select(departfrom);
		 departdp.selectByVisibleText("San Francisco");
		 
		 departdp=new Select(month);
		 departdp.selectByVisibleText("October");
		 
		 departdp=new Select(day);
		 departdp.selectByVisibleText("4");
 		
 		
 		
		 
		 departdp=new Select(depart_to);
		 departdp.selectByIndex(6);
		 
		 departdp=new Select(to_month);
		 departdp.selectByIndex(6);
		 
		 departdp=new Select(to_day);
		 departdp.selectByIndex(6);
		 
		 System.out.println("currently selected options :"+departdp.getFirstSelectedOption().getText());
		
		 departlist=departdp.getOptions();
		 int size=departlist.size();
		 for(int j=0;j<size;j++)
		 {
			 System.out.println(departlist.get(j).getText());
		 }
			 
		 continuebtn.click();
	 }
		 	
}
