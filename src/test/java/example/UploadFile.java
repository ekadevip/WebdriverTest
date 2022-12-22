package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\browser driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://the-internet.herokuapp.com/upload");
    	driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
	}
}
