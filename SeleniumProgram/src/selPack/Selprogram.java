package selPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selprogram {

	public static void main(String[] args) 
	
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium downloads\\chromedriver_win32\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
	}

}
