package TestPackage;




//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import com.google.common.io.Files;

	import java.util.HashMap;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.ElementClickInterceptedException;
	import org.openqa.selenium.WebDriver;
    import org.testng.Assert;
	import org.testng.SkipException;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import Base.BaseClass;
	import pageobject.InviteFormPage;
	import util.DataUtil;
	import util.MyXLSReader;

	
		
		public class Invite_Form extends BaseClass {
			WebDriver driver;
			MyXLSReader excelReader;
		@AfterMethod
//		public void tearDown() {
//			driver.quit();
//		}
		@Test (dataProvider = "dataProvider")
		public void loginTest(HashMap<String,String> hMap) {
			
			if(!DataUtil.isRunnable(excelReader, "RegisterationTest", "Testcases") || hMap.get("Runmode").equals("N")) {
				throw new SkipException("Run Mode is set as No hence it is not executed");
			}
			
			
			driver = openBrowser(hMap.get("Browser"));
			
		    
		    driver.get("http://studentpanel.yoctel.com/Home/UserForm?f=E6A6012C6BDCFEE7F93A2B6D66DD5377&r=C3264FDB4584EC8D277176DABF75D370");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			InviteFormPage invitePage = new InviteFormPage(driver);
			
//			try {
			invitePage.enterFirstName(hMap.get("FirstName"));
			invitePage.enterMiddleName(hMap.get("MiddleName"));
			invitePage.enterLastName(hMap.get("LastName"));
			invitePage.enterDateOfBirth(hMap.get("DateOfBirth"));
		    invitePage.enterMobileNumber(hMap.get("MobileNumber"));
		    invitePage.enterEmailId(hMap.get("EmailId"));
		    invitePage.uploadProfilePicture(hMap.get("ProfilePicturePath"));
		    invitePage.enterPrimaryAddress(hMap.get("PrimaryAddress"));
		    invitePage.enterAddress1(hMap.get("Address1"));
		    invitePage.enterAddress2(hMap.get("Address2"));
		    invitePage.enterPostalCode(hMap.get("PostalCode"));
		    invitePage.enterFatherName(hMap.get("FatherName"));
		    invitePage.enterMotherName(hMap.get("MotherName"));
		    invitePage.enterHusbandName(hMap.get("HusbandName"));
		    invitePage.enterGurdianName(hMap.get("GaurdianName"));
		    invitePage.enterFatherMobileNumber(hMap.get("FatherMobileNumber"));
		    invitePage.enterMotherMobileNumber(hMap.get("MotherMobileNumber"));
		    invitePage.enterHusbandMobileNumber(hMap.get("HusbandMobileNumber"));
		    invitePage.enterGaurdianMobileNumber(hMap.get("GaurdianMobileNumber"));
		    invitePage.enterFatherEmailId(hMap.get("FatherEmailId"));
		    invitePage.enterMotherEmailId(hMap.get("MotherEmailId"));
		    invitePage.enterHusbandEmailId(hMap.get("HusbandEmailId"));
		    invitePage.enterGuardianEmailId(hMap.get("GuardianEmailId"));
		    invitePage.enterPrimaryEmailId(hMap.get("PrimaryEmailId"));
		    invitePage.enterHusbandOccupation(hMap.get("HusbandOccupation"));
		    invitePage.enterFatherOccupation(hMap.get("FatherOccupation"));
		    invitePage.enterMotherOccupation(hMap.get("MotherOccupation"));
		    invitePage.enterFatherPlaceOfWork(hMap.get("FatherPlaceOfWork"));
		    invitePage.enterMotherPlaceOfWork(hMap.get("MotherPlaceOfWork"));
		    invitePage.enterHusbandPlaceOfWork(hMap.get("HusbandPlaceOfWork"));
		    invitePage.enterFatherAnnualIncome(hMap.get("FatherAnnualIncome"));
		    invitePage.enterMotherAnnualIncome(hMap.get("MotherAnnualIncome"));
		    invitePage.enterGaurdianAnnualIncome(hMap.get("GaurdianAnnualIncome"));
		    invitePage.enterHusbandAnnualIncome(hMap.get("HusbandAnnualIncome"));
		    invitePage.enterQualificationName(hMap.get("QualificationName"));
		    invitePage.enterInstituteName(hMap.get("InstitueName"));
		    invitePage.enterSpecializationName(hMap.get("SpecializationName"));
		    invitePage.enterPassingDate(hMap.get("PassingDate"));
		    invitePage.enterCourseDuration(hMap.get("CourseDuration"));
		    invitePage.enterCourseType(hMap.get("CourseType"));
		    invitePage.enterGrade(hMap.get("Grade"));
		    invitePage.enterMarks(hMap.get("Marks"));
		    invitePage.enterPercentage(hMap.get("Percentage"));
		    invitePage.enterClass(hMap.get("Class"));
		    invitePage.enterOtherQualification(hMap.get("OtherQualification"));
		   // throw new Exception("Simulated failure");
//			} catch (Exception e) {
//				System.out.println("Exception occurred: " + e.getMessage());
//	            takeScreenshot(driver);
//			}
//		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		    invitePage.submitButtonClick(hMap.get("SubmitClick"));
            try {
		    	invitePage.submitButtonClick(hMap.get("SubmitClick"));
	        } catch (ElementClickInterceptedException e) {
	            // Handle the exception, such as scrolling the element into view
	            // or dismissing any overlapping elements
	            System.out.println("Element is not clickable: " + e.getMessage());
	        }
		    
		    
		    
		    
		    
		    

		    
		    
		 String expectedResult = hMap.get("ExpectedResult");
		 
		 boolean expectedConvertedResult = false;
		 if(expectedResult.equalsIgnoreCase("Success")) {
			 expectedConvertedResult = true;	 
		 }
		 else if(expectedResult.equalsIgnoreCase("Failure")) {
			 expectedConvertedResult = false;	 
		 }
		 
		 boolean actualResult = false;
	try {
		 actualResult = driver.findElement(By.id("memberLogo")).isDisplayed();
	}catch(Throwable e) {
		actualResult = false;
	}
		 
		 
		 Assert.assertEquals(actualResult, expectedConvertedResult);
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 		
		}
//		private void takeScreenshot(WebDriver driver2) {
//			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
////	        File destinationFile = new File("error_screenshot.png");
//
//	        try {
//	           // File.copy(screenshotFile.toPath(), destinationFile.toPath());
//	            FileUtils.copyFile(screenshotFile, new File (".//ErrorScreenShots/Error.png"));        	
//	            System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//			
//		}
		@DataProvider
		public Object[][] dataProvider() {
			Object[][] data = null;
			try {
			 excelReader = new MyXLSReader("D:\\KeyGenProject\\EOA_DataDrivenFramework\\src\\test\\resources\\InviteForm_TestCases.xlsx");
			data  = DataUtil.getTestData(excelReader,"StudentRegistrationTest","TestData");
			}catch(Throwable e) {
				e.printStackTrace();
			}
			return data;
		}
	}
		


