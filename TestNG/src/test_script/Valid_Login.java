package test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_Excel;
import pom.ActiTime_Login;

public class Valid_Login extends Base_Test
{ 
	@Test
public void login() throws EncryptedDocumentException, IOException   
{
		String uname=Generic_Excel.getData("sheet1", 0, 0);
		String pwd=Generic_Excel.getData("sheet1", 0,1);
		
		ActiTime_Login act=new ActiTime_Login(driver);
		
		act.username(uname);
		act.password(pwd);
		act.loginbtn();
		Assert.fail();
		
		}
}
