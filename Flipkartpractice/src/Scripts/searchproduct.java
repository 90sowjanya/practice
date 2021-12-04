package Scripts;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicutilities.Exceldata;
import basicutilities.LoginAndLogout;
import basicutilities.childwindow;
import pageobjectmodel.landingpage;
import pageobjectmodel.mobileimg;

public class searchproduct extends LoginAndLogout
{
@Test 
public void searchmobile() throws EncryptedDocumentException, IOException, InterruptedException
{
	landingpage l=new landingpage(driver);
	Thread.sleep(5000);
	String data = Exceldata.getdata("search", 1, 0);
	Thread.sleep(5000);
	l.searchgbox(data);
	Thread.sleep(3000);
	l.search();
	Thread.sleep(5000);
	
	mobileimg m=new mobileimg(driver);
	m.imgselcet();
	Thread.sleep(5000);
	String tit= "REDMI 9i Sport ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";
	childwindow.chidwindow(tit);
	String data1=Exceldata.getdata("search", 2, 0);
	l.searchgbox(data1);
	Thread.sleep(5000);
	l.search();
	Thread.sleep(5000);
	
	
	
	
	

}



		


}
