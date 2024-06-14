package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Pagevls {

	
	
	
WebDriver driver;
	
	@FindBy(id = "email")
	WebElement fbemail;
	
	@FindBy(id ="pass")
	WebElement fbpwd;
	
	@FindBy(name = "login")
	WebElement loginclk;
	
	

	public Pagevls(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
		
	}
	
public void setvalues(String usernme,String pwd)
	{
		fbemail.clear();
		fbemail.sendKeys(usernme);
		fbpwd.clear();
		fbpwd.sendKeys(pwd);
		
		
	}
	
	public void click()
	{
	  loginclk.click();
	}
	
	
	
	


}
	
	

