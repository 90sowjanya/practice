package Scripts;

import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basicutilities.LoginAndLogout;
import pageobjectmodel.fashionhoverpage;
import pageobjectmodel.girlfashionpage;
import pageobjectmodel.landingpage;


public class scripttestng extends LoginAndLogout
{
	
	@Test
		public static void imageselect() throws InterruptedException
	
		{
			landingpage lp=new landingpage(driver);
			lp.fashion();
			Thread.sleep(7000);
			fashionhoverpage fp=new fashionhoverpage(driver);
			//fp.womenethnic();
			//Thread.sleep(3000);
			//fp.womenkurtas();
			//Thread.sleep(5000);

			fp.kids();
			Thread.sleep(7000);
			fp.girlsfashion();
			Thread.sleep(7000);
		
		
			//girlfashionpage gf=new girlfashionpage(driver);
			//gf.image();
			
			//Set<String> ids = driver.getWindowHandles();
			//LinkedList<String> childid=new LinkedList<String>(ids);
			//driver.switchTo().window(childid.get(1));
			//Thread.sleep(5000);
				
		}	
			//fp.womenethnic();
		//Thread.sleep(3000);
		//fp.womenkurtas();
		//Thread.sleep(5000);
		
	
	}


