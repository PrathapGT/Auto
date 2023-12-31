package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.GenericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{

	// declaration
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationsLnk;

	@FindBy(linkText = "Contacts")
	private WebElement ContactsLnk;

	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLnk;
	
	@FindBy(xpath="//a[@href=\"index.php?module=Leads&action=index\"]")
	
	private WebElement LeadsLink;

	

	

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdministratorImg;

	@FindBy(linkText = "Sign Out")
	private WebElement SignOutLnk;

	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getOrganizationsLnk() {
		return OrganizationsLnk;
	}

	public WebElement getContactsLnk() {
		return ContactsLnk;
	}

	public WebElement getOpportunitiesLnk() {
		return opportunitiesLnk;
	}

	public WebElement getAdministratorImg() {
		return AdministratorImg;
	}

	public WebElement getSignOutLnk() {
		return SignOutLnk;
	}
	
	public WebElement getleadslink() {
		return LeadsLink;
		
		
	}
	
	//Business Libraries
	/**
	 * This method will perform click operation on organizations link
	 */
	public void clickOnOrganizationsLnk()
	{
		OrganizationsLnk.click();
	}
	
	/**
	 * This method will perform click operation on Contacts link
	 */
	public void clickOnContactsLnk()
	{
		ContactsLnk.click();
	}
	
	/**
	 * This method will perform click operation on Leads Link
	 */
	public void clickonleadslink() {
		
		LeadsLink.click();
	}
	
	/**
	 * This method will perform Logout operation 
	 * @param driver
	 */
	public void logoutOfApp(WebDriver driver)
	{
		mouseHoverAction(driver, AdministratorImg);
		SignOutLnk.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
