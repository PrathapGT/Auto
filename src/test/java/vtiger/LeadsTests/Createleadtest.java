package vtiger.LeadsTests;

import org.testng.annotations.Test;

import vtiger.GenericUtilities.BaseClass;
import vtiger.ObjectRepository.HomePage;
import vtiger.ObjectRepository.Leadspage;

public class Createleadtest extends BaseClass {

	
	@Test
	public void createleadtest() {
		
		
		HomePage hp=new HomePage(driver);
		hp.clickonleadslink();
		
		Leadspage Lp=new Leadspage(driver);
		Lp.clickoncreateleadsimg();
	}
}
