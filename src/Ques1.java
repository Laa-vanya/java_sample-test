import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ques1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","G:\\selenium workspace\\Test6\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.facebook.com/");
		WebElement usr = driver.findElement(By.name("email"));
		//usr.sendKeys("lava@gmail.com");
		/*Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
*/		
		Actions a=new Actions(driver);
		a.keyDown(Keys.SHIFT).perform();
		a.sendKeys(usr,"lavana").perform();
		a.keyUp(Keys.SHIFT).perform();
	}
}
