package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	@Test
	public void VegList() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Prathap\\eclipse-workspace\\Prathap\\Prathap.java\\CoreJava\\Practice\\lib\\src\\main\\java\\Practicedata\\data.properties");
		pro.load(file);
		driver.get(pro.getProperty("url"));
		
		ArrayList<String> al =  new ArrayList<String>();
		al.add("Cucumber");
		al.add("Tomato");
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		int j =0;
		for(int i=0; i<products.size();i++) {
	String[] name=	products.get(i).getText().split("-");
	String newname = name[0].trim();
		if(products.contains(newname)) {
			j++;
	
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
			if(j==products.size()) {
				break;
			}
		}
			
		}		
		
	

}}
