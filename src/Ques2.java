import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","G:\\selenium workspace\\Test6\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Vel Mrugan");
		Robot a=new Robot();
		Actions b=new Actions(driver);
		b.doubleClick(search).perform();;
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_X);
		a.keyRelease(KeyEvent.VK_X);
		a.keyRelease(KeyEvent.VK_CONTROL);
		}
}
