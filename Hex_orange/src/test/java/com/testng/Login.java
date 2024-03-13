package com.testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class Login {
	@DataProvider
	public Object[][] getData()
	{
			Object[][] Data=new Object[1][2];
			Data[0][0]="admin";
			Data[0][1]="admin123";
			Data[1][0]="admin";
			Data[1][1]="admin123";
 
		return Data;
	}
	@Test(dataProvider="getData")
	public void test(Object un,Object pw)
	{
		Reporter.log(un + "" + pw,true);
	}
 
}