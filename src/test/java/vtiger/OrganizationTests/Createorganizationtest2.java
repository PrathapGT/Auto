package vtiger.OrganizationTests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import vtiger.GenericUtilities.BaseClass;
import vtiger.ObjectRepository.CreateNewOrganizationPage;
import vtiger.ObjectRepository.HomePage;
import vtiger.ObjectRepository.OrganizationsInfoPage;
import vtiger.ObjectRepository.OrganizationsPage;

public class Createorganizationtest2 extends BaseClass {

	
	@Test
	
	public void createorganizationtest() throws EncryptedDocumentException, IOException {
		
		String ORGNAME = eUtil.readDataFromExcel("Organizations", 1, 2)+jUtil.getRandomNumber();
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrganizationsLnk();
		
		
		OrganizationsPage op=new OrganizationsPage(driver);
		op.clickOnCreateOrgImg();
		
		CreateNewOrganizationPage cnop= new CreateNewOrganizationPage(driver);
		
		cnop.createOrganization(ORGNAME, ORGNAME);
		
		OrganizationsInfoPage oip= new OrganizationsInfoPage(driver);
		
		String ORGHEADER = oip.getOrgHeader();
		
		
		Assert.assertTrue(ORGHEADER.contains(ORGNAME));
		
	}
}
