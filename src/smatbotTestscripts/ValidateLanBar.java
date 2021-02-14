package smatbotTestscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateLanBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.smatbot.com/smatbot/All_features?id=4174");
		WebElement mainframe=driver.findElement(By.cssSelector("iframe[class='access-url-bot']"));
		driver.switchTo().frame(mainframe);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		/*WebElement refresh= driver.findElement(By.cssSelector(".p-l-10.p-r-10"));
		 
		
		executor.executeScript("arguments[0].click();", refresh);*/
		System.out.println("jdjadjka");
		
        WebElement element = driver.findElement(By.xpath("//button[@id='en']"));
		/*executor.executeScript("arguments[0].click();", element);*/
		/*WebElement text=driver.findElement(By.cssSelector("label[class='bot-google-font']"));
		Assert.assertTrue(text.isDisplayed());
		WebElement image=driver.findElement(By.cssSelector(".question-img-smatest"));
        Assert.assertTrue(image.isDisplayed());*/
        WebElement paybills=driver.findElement(By.cssSelector("#avatar-scroll>div:nth-of-type(1)"));
        //executor.executeScript("arguments[0].click();", paybills);
   
	}

}
