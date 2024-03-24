package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InviteFormPage {
	WebDriver driver;
	public InviteFormPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtFirstname")
	private WebElement firstNameField;
	@FindBy(id = "txtMiddlename")
	private WebElement middleNameField;
	@FindBy(id = "txtLastname")
	private WebElement lastNameField;
	@FindBy(id = "txtDOB")
	private WebElement dateOfBirthField;
	@FindBy(id = "txtMobileNumber")
	private WebElement mobileNumberField;
	@FindBy(id = "txtEmailID")
	private WebElement emailIdField;
	@FindBy(id = "txtPrimaryAddress")
	private WebElement primaryAddressField;
	@FindBy(id = "txtAddress1")
	private WebElement address1Field;
	@FindBy(id = "txtAddress2")
	private WebElement address2Field;
	@FindBy(id = "txtPostalCode")
	private WebElement postalCodeField;
	@FindBy(id = "txtFatherName")
	private WebElement fatherNameField;
	@FindBy(id = "txtMotherName")
	private WebElement motherNameField;
	@FindBy(id = "txtHusbandName")
	private WebElement husbandNameField;
	@FindBy(id = "txtGuardianName")
	private WebElement guardianNameField;
	@FindBy(id = "txtFatherMobileNo")
	private WebElement fatherMobileNumberField;
	@FindBy(id = "txtMotherMobileNo")
	private WebElement motherMobileNumberField;
	@FindBy(id = "txtHusbandMobileNo")
	private WebElement husbandMobileNumberField;
	@FindBy(id = "txtGuardianMobileNo")
	private WebElement guardianMobileNumberField;
	@FindBy(id = "txtFatherEmailID")
	private WebElement fatherEmailIdField;
	@FindBy(id = "txtMotherEmailID")
	private WebElement motherEmailIdField;
	@FindBy(id = "txtHusbandEmailID")
	private WebElement husbandEmailIdField;
	@FindBy(id = "txtGuardianEmailID")
	private WebElement guardianEmailIdField;
	@FindBy(id = "txtPrimaryEmailID")
	private WebElement primaryEmailIdField;
	@FindBy(id = "upldProfile")
	private WebElement profilePictureUploading;
	@FindBy(id = "txtHusbandOccupation")
	private WebElement husbandOccupationField;
	@FindBy(id = "txtFatherOccupation")
	private WebElement fatherOccupationField;
	@FindBy (id = "txtMotherOccupation")
	private WebElement motherOccupationField;
	@FindBy (id = "txtFatherPlaceofWork")
	private WebElement fatherPlaceOfWorkField;
    @FindBy (id = "txtMotherPlaceofWork")	
    private WebElement motherPlaceOfWorkField;
    @FindBy (id = "txtHusbandPlaceofWork")
    private WebElement husbandPlaceOfWorkField;
    @FindBy (id = "txtFatherAnnualIncome")
    private WebElement fatherAnnualIncomeField;
    @FindBy (id = "txtMotherAnnualIncome")
    private WebElement motherAnnualIncomeField;
    @FindBy (id = "txtHusbandAnnualIncome")
    private WebElement husbandAnnualIncomeField;
    @FindBy (id = "txtQualificationName")
    private WebElement guardianAnnualIncomeField;
    @FindBy (id = "txtGuardianAnnualIncome")
    private WebElement qualificationNameField;
    @FindBy (id = "txtInstituteName")
    private WebElement instituteNameField;
    @FindBy (id = "txtSpecializationName")
    private WebElement specializationNameField;
    @FindBy (id = "txtPassingDate")
    private WebElement passingDateField;
    @FindBy (id = "txtCourseDuration")
    private WebElement courseDurationField;
    @FindBy (id = "txtCourseType")
    private WebElement courseTypeField;
    @FindBy (id = "txtGrade")
    private WebElement gradeField;
    @FindBy (id = "txtMarks")
    private WebElement marksField;
    @FindBy (id = "txtPercentage")
    private WebElement percentageField;
    @FindBy (id = "txtClass")
    private WebElement classField;
    @FindBy (id = "txtOtherQualification")
    private WebElement otherQualificationField;
    @FindBy (id = "btnSubmit")
    private WebElement submitBtn;
    
    
public void submitButtonClick (String submitBtnClick) {
	submitBtn.click();
}
    public void enterHusbandOccupation(String husbandOccupation){
    	husbandOccupationField.sendKeys(husbandOccupation);
	}
    public void enterFatherOccupation(String fatherOccupation){
    	fatherOccupationField.sendKeys(fatherOccupation);
	}
    public void enterMotherOccupation(String motherOccupation){
    	motherOccupationField.sendKeys(motherOccupation);
	}
    public void enterFatherPlaceOfWork(String fatherPlaceOfWork){
    	fatherPlaceOfWorkField.sendKeys(fatherPlaceOfWork);
	}
    public void enterMotherPlaceOfWork(String motherPlaceOfWork){
    	motherPlaceOfWorkField.sendKeys(motherPlaceOfWork);
	}
    public void enterHusbandPlaceOfWork(String husbandPlaceOfWork){
    	husbandPlaceOfWorkField.sendKeys(husbandPlaceOfWork);
	}
    public void enterFatherAnnualIncome(String fatherAnnualIncome){
    	fatherAnnualIncomeField.sendKeys(fatherAnnualIncome);
	}
    public void enterMotherAnnualIncome(String motherAnnualIncome){
    	motherAnnualIncomeField.sendKeys(motherAnnualIncome);
	}
    public void enterGaurdianAnnualIncome(String guardianAnnualIncome){
    	guardianAnnualIncomeField.sendKeys(guardianAnnualIncome);
	}
    public void enterHusbandAnnualIncome(String husbandAnnualIncome){
    	husbandAnnualIncomeField.sendKeys(husbandAnnualIncome);
	}
    public void enterQualificationName(String qualificationName){
    	qualificationNameField.sendKeys(qualificationName);
	}
    public void enterInstituteName(String instituteName){
    	instituteNameField.sendKeys(instituteName);
	}
    public void enterSpecializationName(String specializationName){
    	specializationNameField.sendKeys(specializationName);
	}
    public void enterPassingDate(String passingDate){
    	passingDateField.sendKeys(passingDate);
	}
    public void enterCourseDuration(String courseDuration){
    	courseDurationField.sendKeys(courseDuration);
	}
    public void enterCourseType(String courseType){
    	courseTypeField.sendKeys(courseType);
	}
    public void enterGrade(String grade){
    	gradeField.sendKeys(grade);
	}
    public void enterMarks(String marks){
    	marksField.sendKeys(marks);
	}
    public void enterPercentage(String percentage){
    	percentageField.sendKeys(percentage);
	}
    public void enterClass(String Class){
    	classField.sendKeys(Class);
	}
    public void enterOtherQualification(String otherQualification){
    	otherQualificationField.sendKeys(otherQualification);
	}
	public void uploadProfilePicture(String profilePicturePath) {
		profilePictureUploading.sendKeys(profilePicturePath);
	}
	
	public void enterFirstName(String firstName){
		firstNameField.sendKeys(firstName);
	}
	public void enterMiddleName(String middleName){
		middleNameField.sendKeys(middleName);
	}
	public void enterLastName(String lastName){
		lastNameField.sendKeys(lastName);
	}
	public void enterDateOfBirth(String dateOfBirth){
		dateOfBirthField.sendKeys(dateOfBirth);
	}
	public void enterMobileNumber(String mobileNumber){
		mobileNumberField.sendKeys(mobileNumber);
	}
	public void enterEmailId(String emailId){
		emailIdField.sendKeys(emailId);
	}
	public void enterPrimaryAddress(String primaryAddress){
		primaryAddressField.sendKeys(primaryAddress);
	}
	public void enterAddress1(String address1){
		address1Field.sendKeys(address1);
	}
	public void enterAddress2(String address2){
		address1Field.sendKeys(address2);
	}
	public void enterPostalCode(String postalCode){
		postalCodeField.sendKeys(postalCode);
	}
	public void enterFatherName(String fatherName){
		fatherNameField.sendKeys(fatherName);
	}
	public void enterMotherName(String motherName){
		motherNameField.sendKeys(motherName);
	}
	public void enterHusbandName(String husbandName){
		husbandNameField.sendKeys(husbandName);
	}
	public void enterGurdianName(String gurdianName){
		guardianNameField.sendKeys(gurdianName);
	}
	public void enterFatherMobileNumber(String fatherMobileNumber){
		fatherMobileNumberField.sendKeys(fatherMobileNumber);
	}
	public void enterMotherMobileNumber(String motherMobileNumber){
		motherMobileNumberField.sendKeys(motherMobileNumber);
	}
	public void enterHusbandMobileNumber(String husbandMobileNumber){
		husbandMobileNumberField.sendKeys(husbandMobileNumber);
	}
	public void enterGaurdianMobileNumber(String guardianMobileNumber){
		guardianMobileNumberField.sendKeys(guardianMobileNumber);
	}
	public void enterFatherEmailId(String fatherEmailId){
		fatherEmailIdField.sendKeys(fatherEmailId);
	}
	public void enterMotherEmailId(String motherEmailId){
		motherEmailIdField.sendKeys(motherEmailId);
	}
	public void enterHusbandEmailId(String husbandEmailId){
		husbandEmailIdField.sendKeys(husbandEmailId);
	}
	public void enterGuardianEmailId(String guardianEmailId){
		guardianEmailIdField.sendKeys(guardianEmailId);
	}
	public void enterPrimaryEmailId(String primaryEmailId){
		primaryEmailIdField.sendKeys(primaryEmailId);
	}
	
}

