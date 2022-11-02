package com.educationalDomain.sadp.Scripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.educationalDomain.sadp.GenericLibraries.BaseClass;
import com.educationalDomain.sadp.PomPages.ContactUsPage;
import com.educationalDomain.sadp.PomPages.LoginPage;

public class TestCase2 extends BaseClass{
	@Test(dataProvider="readExceldata")
	public void testcase2(String name,String mail,String subject,String message) throws InterruptedException  {
		test=reports.createTest("testcase2");
		LoginPage lp=new LoginPage(driver);
		lp.Acceptbtn();
		Point loc = lp.getContactusbtn().getLocation();
		int x = loc.getX();
		int y = loc.getY();
	utilities.scrollBar(driver, x,y);
	Thread.sleep(5000);
	ContactUsPage cp=lp.contactus(driver);
	Thread.sleep(5000);
	cp.sendDetails(name, mail, subject,message, message);
	Thread.sleep(5000);
		}
}
