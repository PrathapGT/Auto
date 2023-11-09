package vtiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatenewLeadpage {

	
	@FindBy(name="lastname")
	private WebElement lastnameedit;
	
	@FindBy(name="company")
	private WebElement comnameedit;
	
}
