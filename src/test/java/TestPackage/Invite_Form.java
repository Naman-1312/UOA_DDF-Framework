package TestPackage;




	//import java.time.Duration;
	import java.util.HashMap;

	import org.openqa.selenium.By;
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
			
		    
		    driver.get("https://studentpanel.yoctel.com/Home/UserForm?f=E6A6012C6BDCFEE7F93A2B6D66DD5377&r=C3264FDB4584EC8D277176DABF75D370");
			InviteFormPage invitePage = new InviteFormPage(driver);
			
			invitePage.enterFirstName(hMap.get("firstName"));
			invitePage.enterMiddleName(hMap.get("middleName"));
			invitePage.enterLastName(hMap.get("lastName"));
			invitePage.enterDateOfBirth(hMap.get("dateOfBirth"));
		    invitePage.enterMobileNumber(hMap.get("mobileNumber"));
		    invitePage.enterEmailId(hMap.get("emailId"));
		    invitePage.uploadProfilePicture(hMap.get("profilePicturePath"));
		    invitePage.enterPrimaryAddress(hMap.get("primaryAddress"));
		    invitePage.enterAddress1(hMap.get("address1"));
		    invitePage.enterAddress2(hMap.get("address2"));
		    invitePage.enterPostalCode(hMap.get("postalCode"));
		    invitePage.enterFatherName(hMap.get("fatherName"));
		    invitePage.enterMotherName(hMap.get("motherName"));
		    invitePage.enterHusbandName(hMap.get("husbandName"));
		    invitePage.enterGurdianName(hMap.get("gurdianName"));
		    invitePage.enterFatherMobileNumber(hMap.get("fatherMobileNumber"));
		    invitePage.enterMotherMobileNumber(hMap.get("motherMobileNumber"));
		    invitePage.enterHusbandMobileNumber(hMap.get("husbandMobileNumber"));
		    invitePage.enterGaurdianMobileNumber(hMap.get("gaurdianMobileNumber"));
		    invitePage.enterFatherEmailId(hMap.get("fatherEmailId"));
		    invitePage.enterMotherEmailId(hMap.get("motherEmailId"));
		    invitePage.enterHusbandEmailId(hMap.get("husbandEmailId"));
		    invitePage.enterGuardianEmailId(hMap.get("guardianEmailId"));
		    invitePage.enterPrimaryEmailId(hMap.get("primaryEmailId"));
		    invitePage.enterHusbandOccupation(hMap.get("husbandOccupation"));
		    invitePage.enterFatherOccupation(hMap.get("fatherOccupation"));
		    invitePage.enterMotherOccupation(hMap.get("motherOccupation"));
		    invitePage.enterFatherPlaceOfWork(hMap.get("fatherPlaceOfWork"));
		    invitePage.enterMotherPlaceOfWork(hMap.get("motherPlaceOfWork"));
		    invitePage.enterHusbandPlaceOfWork(hMap.get("husbandPlaceOfWork"));
		    invitePage.enterFatherAnnualIncome(hMap.get("fatherAnnualIncome"));
		    invitePage.enterMotherAnnualIncome(hMap.get("motherAnnualIncome"));
		    invitePage.enterGaurdianAnnualIncome(hMap.get("gaurdianAnnualIncome"));
		    invitePage.enterHusbandAnnualIncome(hMap.get("husbandAnnualIncome"));
		    invitePage.enterQualificationName(hMap.get("quailificationName"));
		    invitePage.enterInstituteName(hMap.get("institueName"));
		    invitePage.enterSpecializationName(hMap.get("specializationName"));
		    invitePage.enterPassingDate(hMap.get("passingDate"));
		    invitePage.enterCourseDuration(hMap.get("courseDuration"));
		    invitePage.enterCourseType(hMap.get("courseType"));
		    invitePage.enterGrade(hMap.get("grade"));
		    invitePage.enterMarks(hMap.get("marks"));
		    invitePage.enterPercentage(hMap.get("percentage"));
		    invitePage.enterClass(hMap.get("Class"));
		    invitePage.enterOtherQualification(hMap.get("otherQualification"));
		    //invitePage.submitButtonClick(hMap.get("SubmitClick"));
		    
		    
		    
		    
		    
		    
		    
//          driver.findElement(By.id("UserName")).sendKeys(hMap.get("Username"));
//		    driver.findElement(By.id("Password")).sendKeys(hMap.get("Password"));
//		    driver.findElement(By.name("LoginButton")).click();		 
//		    WebElement fileInput = driver.findElement(By.id("upldProfile"));
//		    fileInput.sendKeys("C:\\\\Users\\\\Naman Goel\\\\Desktop\\\\Error.png");  // Set the file path to upload
//		    loginPage.enterUsername(hMap.get("Username"));
//		    loginPage.enterPassword(hMap.get("Password"));
//		    loginPage.loginClick();
//          driver.get(prop.getProperty("url"));
		    
		    
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
		


