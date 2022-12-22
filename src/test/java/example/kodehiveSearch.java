package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kodehiveSearch {

    private WebDriver driver;

    public void launchbrowser() {
    	System.setProperty("webdriver.chrome.driver","C:\\browser driver\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://learning.kodehive.id/");
    }
    
    public void searchWorkshop() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"page-content\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div/div/div/div/a")).click();
    }
    
    public void closeBrowser() {
    	driver.quit();
    }
    
    public static void main(String[] args) throws InterruptedException {
    	kodehiveSearch obj = new kodehiveSearch();
    	obj.launchbrowser();
    	obj.searchWorkshop();
    	obj.closeBrowser();
	} 
    
}