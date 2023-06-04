package com.example.SeleniumDay_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class task01 {
	
  @Test(dataProvider = "dp")
  public void f(int a,int b,char op,int expectedOutput) {
	  String str="";
	  int result=0;
	  if(op=='+') {
		  result=a+b;
		  str="Addition";
	  }
	  else if(op=='-') {
		  result=a-b;
		  str="Subtraction";
	  }
	  else if(op=='*') {
		  result=a*b;
		  str="Multiplication";
	  }
	  else {
		  result=a/b;
		  str="Division";
	  }
	  System.out.println(result+" : "+str);
	  Assert.assertEquals(result, expectedOutput);
  }
 

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeMethod
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2,'+',3 },
      new Object[] { 4, 2,'-',2 },
      new Object[] { 1, 2,'*',2 },
      new Object[] { 2, 1,'/',2 },
    };
  }
}
