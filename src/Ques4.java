import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","G:\\selenium workspace\\Test6\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement test = driver.findElement(By.xpath(""));
	}
}
