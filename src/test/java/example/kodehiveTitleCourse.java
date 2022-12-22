package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kodehiveTitleCourse {

	private WebDriver driver;

    public void launchbrowser() {
    	System.setProperty("webdriver.gecko.driver", "C:/browser driver/geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.get("https://learning.kodehive.id/");
    }
    
    public void getTitleCourse() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.linkText("Mulai Belajar")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("username")).sendKeys("ekadevi03@gmail.com");
    	driver.findElement(By.id("password")).sendKeys("Masokpakeko12@");
    	Thread.sleep(2000);
    	driver.findElement(By.id("loginbtn")).click();
    	Thread.sleep(2000);
    	String title = driver.findElement(By.className("text-truncate")).getText();
    	System.out.println("Course Title : "+title);
    }
    
    public void closeBrowser() {
    	driver.quit();
    }
    
    public static void main(String[] args) throws InterruptedException {
    	kodehiveTitleCourse obj = new kodehiveTitleCourse();
    	obj.launchbrowser();
    	obj.getTitleCourse();
    	obj.closeBrowser();
	} 

}
