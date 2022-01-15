package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;


public class ActiTime_Login extends Base_Page
{
	@FindBy(id="username")
	private WebElement user;

	@FindBy(name="pwd")
	private WebElement pass;

	@FindBy(xpath="//div[.='login']")
	private WebElement login_btn;

	public ActiTime_Login(WebDriver driver)
	{
		super(driver);	
	}
		public  void username(String uname)
		{
		user.sendKeys(uname);
		}
		public  void password(String pwd)
		{
			pass.sendKeys("pwd");
		}
	public void loginbtn()
	{
		login_btn.click();
	}
}
