package basicutilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageobjectmodel.loginscreen;

public class LoginAndLogout implements AutoConstatnts
{
	
public static WebDriver driver;
@BeforeMethod
	public static void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
	System.setProperty(chrome_key, chrome_value);
	driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	loginscreen l=new loginscreen(driver);
	String username = Exceldata.getdata("login", 1, 0);
	String password = Exceldata.getdata("login", 1, 1);
	l.usrname(username);
	l.password(password);
	l.loginbutton();
	
	}
@AfterMethod
public static void logout(ITestResult result) throws IOException
{
	//if(ITestResult.FAILURE == result.getStatus() )
	//{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst=new File("./screenshots" +result.getName()+ ".png");
	FileUtils.copyFile(src, dst);
	//}
	
	driver.quit();
	
}

}
