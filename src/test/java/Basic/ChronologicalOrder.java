package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("BeforeSuite");
		
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("BeforeTest");
		
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("BeforeClass");
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
		
	}
	@Test
	public void testCase1() {
		System.out.println("test case");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("test method");
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
		
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
		
	}
//	output
//	BeforeSuite
//	BeforeTest
//	BeforeClass
//	BeforeMethod
//	test case
//	test Method
//	after class
//	afterTest
	
	
	
	
	

}
