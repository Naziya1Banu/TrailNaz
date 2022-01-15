package generic;

import org.openqa.selenium.WebDriver;

public class webdriver_Method 
{
public static WebDriver driver;
public static void get_title()
{
String title=driver.getTitle();
System.out.println(title);
}
public static void get_url()
{
String	curl=driver.getCurrentUrl();
System.out.println(curl);
}
}
