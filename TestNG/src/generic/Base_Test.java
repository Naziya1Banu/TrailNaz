package generic;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test extends  Framework_Constants
{
	
	public static WebDriver driver;
	@BeforeMethod
	
	public void openAppln()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		//driver.manage().timeouts().implicitlyWait(100,TimeUnit.MINUTES);
		//implicitlyWait(10,TimeUnit.SECONDS);
		//implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(BASE_URL);
	}
	@AfterMethod
	public void closeAppln(ITestResult Result)
	{
		if(ITestResult.FAILURE==Result.getStatus())
		{
			Generic_TakeScreenShot.getphoto();
		}
		driver.close();
	}
}

	