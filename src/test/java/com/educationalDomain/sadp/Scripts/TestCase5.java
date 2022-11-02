package com.educationalDomain.sadp.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.educationalDomain.sadp.GenericLibraries.BaseClass;
import com.educationalDomain.sadp.PomPages.LoginPage;
import com.educationalDomain.sadp.PomPages.SkillraryDemoLoginPage;
import com.educationalDomain.sadp.PomPages.Testing;

public class TestCase5 extends BaseClass{
	@Test
	public void testcase5() throws SQLException, FileNotFoundException, IOException {
		test=reports.createTest("testcase5");
		LoginPage l=new LoginPage(driver);
		SkillraryDemoLoginPage s=l.demoApp(driver);
		utilities.switchTabs(driver);
		utilities.dropdown(s.getDropdown(),fu.getPropertyFile("dd"));
		Testing t=new Testing(driver);
		String query="select * from Asp";
		String data1 = fu.queryExecution(query,2,"INR 2.00");
		}

}
