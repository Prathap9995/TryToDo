package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	
	@Test
	public void addtocart() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com//seleniumPractise");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 String[] products = {"Cucumber", "Tomato"};
	
		int k=0;
		List<WebElement> vegetables = driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for(int i=0; i<vegetables.size();i++) {
		String[] newveg=	vegetables.get(i).getText().split("-");
	String modname=	newveg[0].trim();
	System.out.println(modname);
List<String> a=	Arrays.asList(products);
	
	if(a.contains("Cucumber")) {
		k++;
		
		
		driver.findElements(By.cssSelector("button[type='button']")).get(i).click();
		
		if(k==a.size()) {
			break;
		}
	}
		}
		
	}

}
