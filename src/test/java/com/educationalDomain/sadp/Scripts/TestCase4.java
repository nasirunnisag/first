package com.educationalDomain.sadp.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.educationalDomain.sadp.GenericLibraries.BaseClass;
import com.educationalDomain.sadp.PomPages.LoginPage;
import com.educationalDomain.sadp.PomPages.SkillraryDemoLoginPage;
import com.educationalDomain.sadp.PomPages.Testing;

public class TestCase4 extends BaseClass{
	@Test
	public void testcase4() throws SQLException, FileNotFoundException, IOException {
		test=reports.createTest("testcase4");
		LoginPage l=new LoginPage(driver);
		SkillraryDemoLoginPage s=l.demoApp(driver);
		utilities.switchTabs(driver);
		utilities.dropdown(s.getDropdown(),fu.getPropertyFile("dd"));
		Testing t=new Testing(driver);
		String query="select * from Asp";
		String data = fu.queryExecution(query,1,"INR 19.00");
		}

}
