package TestClssesPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClasses.DashBoardPomClass;

public class DashboardTestClass extends BaseClass
{
	SoftAssert s;
	DashBoardPomClass dashboard;
	
	@BeforeClass
	public void beforeClass()
	{
		s=new SoftAssert();
	}
	
	
	@Test
	public void VerifyTabsPresentOnDashBoardPage()
	{  
		logger=report.createTest("Verify tabs are present on Dashboard page");
		
		System.out.println("Verify Tabs Present On DashBoard Page");
		dashboard=new DashBoardPomClass(driver);
		
		//dashboard.CheckVisibilityOfAdminTab();
		
		Boolean result=dashboard.CheckVisibilityOfAdminTab();
		System.out.println(result);
		s.assertTrue(result);
	   		
		Boolean result1=dashboard.CheckVisibilityOfPIMTab();
		System.out.println(result1);
		s.assertTrue(result1);
		
		Boolean result2=dashboard.CheckVisibilityOfLeaveTab();
		System.out.println(result2);
		s.assertTrue(result2);
		
		Boolean result3=dashboard.CheckVisibilityOfTimeTab();
		System.out.println(result3);
		s.assertTrue(result3);
		
		Boolean result4=dashboard.CheckVisibilityOfRecruitmentTab();
		System.out.println(result4);
		s.assertTrue(result4);
		
		Boolean result5=dashboard.CheckVisibilityOfMyInfoTab();
		System.out.println(result5);
		s.assertTrue(result5);
		
		Boolean result6=dashboard.CheckVisibilityOfPerformanceTab();
		System.out.println(result6);
		s.assertTrue(result6);
		
		Boolean result7=dashboard.CheckVisibilityOfDashboardTab();
		System.out.println(result7);
		s.assertTrue(result7);
		
		Boolean result8=dashboard.CheckVisibilityOfDirectoryTab();
		System.out.println(result8);
		s.assertTrue(result8);
		
		Boolean result9=dashboard.CheckVisibilityOfMaintenanceTab();
		System.out.println(result9);
		s.assertTrue(result9);
		
		Boolean result10=dashboard.CheckVisibilityOfBuzzTab();
		System.out.println(result10);
		s.assertTrue(result10);
		
	   s.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
