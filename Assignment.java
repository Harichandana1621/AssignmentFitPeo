package FitPeo;

import org.junit.validator.ValidateWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/");

		driver.findElement(By.xpath("//div//button[@aria-label='open drawer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Revenue Calculator')]")).click();

		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Actions action = new Actions(driver);
		Thread.sleep(3000);

		action.dragAndDropBy(slider, 94, 0);
		action.perform();
		js.executeScript("window.scrollBy(0,450)");
		String text = driver.findElement(By.xpath("//p[contains(text(),'Total Individual Patient/Month')]/.."))
				.getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).clear();
		Thread.sleep(2000);
	
		//driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).sendKeys(560);
		js.executeScript("document.getElementById(\":R57alklff9da:\").value=\"560\"");
		Thread.sleep(2000);
boolean reflectedValue=  driver.findElement(By.xpath("//span//input[@style='border:0;clip:rect(0 0 0 0);height:100%;margin:-1px;overflow:hidden;padding:0;position:absolute;white-space:nowrap;width:100%;direction:ltr']"))
.isDisplayed();
	Assert.assertTrue(reflectedValue);
		
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	
String validation=	driver.findElement(By.xpath("//div[@class='MuiBox-root css-m1khva']")).getText();
		System.out.println(validation);
	boolean reccuringReimbursment=	driver.findElement(By.xpath("//div[@class='MuiBox-root css-m1khva']")).isDisplayed();
	Assert.assertTrue(reccuringReimbursment);
	
	}

}
