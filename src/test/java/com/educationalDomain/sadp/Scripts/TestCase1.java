package com.educationalDomain.sadp.Scripts;

import org.testng.annotations.Test;

import com.educationalDomain.sadp.GenericLibraries.BaseClass;
import com.educationalDomain.sadp.PomPages.AddToCartPage;
import com.educationalDomain.sadp.PomPages.LoginPage;
import com.educationalDomain.sadp.PomPages.SkillraryDemoLoginPage;

public class TestCase1 extends BaseClass{
	@Test
	public void testcase1() {
	test=reports.createTest("testcase1");
	LoginPage l=new LoginPage(driver);
	SkillraryDemoLoginPage s=l.demoApp(driver);
	utilities.switchTabs(driver);
	utilities.mouseHover(driver,s.getcoursebtn());
	AddToCartPage cart=s.course(driver);
	utilities.doubleclick(driver, cart.getAddbtn());
	cart.getAddtocartbtn().click();
	utilities.alertPopupok(driver);
	driver.quit();
	}
}
