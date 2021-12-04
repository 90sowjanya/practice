package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mobileimg {
@FindBy(xpath="(//img[@alt=\"REDMI 9i Sport (Carbon Black, 64 GB)\"])[1]")
private WebElement redmimobileimg;

@FindBy(xpath="//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
private WebElement addcart;

 public mobileimg(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void imgselcet()
{
	redmimobileimg.click();
}
public void addcart()
{
	addcart.click();
}
}
