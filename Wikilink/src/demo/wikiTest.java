package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikiTest {
public static void main(String[] args) {
		
		String baseUrl = "https://en.wikipedia.org/wiki/Main_Page";
		 
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		List<WebElement> list =driver.findElements(By.xpath("//a[@href]"));
		Set<String> set = new HashSet<String>();
		int n=20;
		for(WebElement e : list) {
	set.add(e.getText());
		}
		System.out.println(list.size());
		System.out.println(set.size());
	  driver.quit();
	}

	


}
