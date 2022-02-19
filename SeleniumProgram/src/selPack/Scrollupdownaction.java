package selPack;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdownaction 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
			//	js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(5000);
		//js.executeScript("window.scrollBy(0,-1000)");
		
		js.executeScript("window.scrollBy(1000,0)");
		System.out.println("scroll left");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(-1000,0)");
		System.out.println("scroll right");
	}
}
