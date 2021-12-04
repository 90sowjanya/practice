package basicutilities;

import java.util.LinkedList;
import java.util.Set;

public class childwindow
{
public static void chidwindow(String title) 
{
	Set<String> ids = LoginAndLogout.driver.getWindowHandles();
	LinkedList<String> childids=new LinkedList<String>(ids);
	int count=childids.size();
	for(int i=0; i<count; i++)
	{
		LoginAndLogout.driver.switchTo().window(childids.get(i));
		String b=LoginAndLogout.driver.getTitle();
		if(b.equalsIgnoreCase(title))
		{
			break;
		}
	
	}
}

	
}
