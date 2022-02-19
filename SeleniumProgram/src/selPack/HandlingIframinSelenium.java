package selPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingIframinSelenium {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\selenium downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(frame);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
		
		Select animal=new Select(dropdown);
	
		animal.selectByValue("babycat");
		System.out.println("End Of Program");
	}

}
