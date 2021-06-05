import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","G:\\selenium workspace\\Test6\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement interv = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		interv.click();
		//driver.findElement(By.xpath("(//a[@title='Interview Questions'])[4]")).click();
		Robot r=new Robot();
		r.mouseMove(156, 17);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		/*r.mouseMove(111, 47);
		r.mousePress(InputEvent.BUTTON2_DOWN_MASK );
		r.mouseRelease(InputEvent.BUTTON2_DOWN_MASK );
		r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		*/
	}
}
