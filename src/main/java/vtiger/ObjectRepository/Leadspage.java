package vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadspage {

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	
	private WebElement LeadspageLookupimg;
	
	
	public Leadspage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getLeadspageLookupimg() {
		return LeadspageLookupimg;
	}

/**
 * This method will perform click action on createleadslookupimg
 */
	public void clickoncreateleadsimg() {
		LeadspageLookupimg.click();
	}
	
	
}
