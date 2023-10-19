package org.scenario1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClaass {
public static WebDriver driver;
	
	
	//This method is used for launching browser
	public static void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	public static void urlLaunch(String url) {
		
		driver.get(url);

	}
	
	public static void maximise() {
		
		driver.manage().window().maximize();

	}
	
	public static void impWait(long a) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	
	public static void sendkeys(WebElement a, String b ) {
		
		a.sendKeys(b);

	}
	
	public static void click(WebElement a) {
		
		a.click();

	}
	
	public static void enterPress() throws Exception {
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
		
    public static void enterRelease() throws Exception {
		
		Robot r = new Robot();
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
    
    public static void quit() {

    	driver.quit();
	}
    public static String readPropertyFile(String key)throws IOException {
		File f = new File("E:\\Tharini\\Eclips WorkSpace\\ClassOne\\src\\test\\resources\\SupportFiles\\creden.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties po= new Properties();
		po.load(fis);
		String value = po.getProperty(key);
		return value;
	}
    public static void radio(WebElement element) {
		WebElement radio = element;
		if (!radio.isSelected()) {
			radio.click();
		}
	}
    public static void screenshot(String image) throws InterruptedException,IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src= tk.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\ragsu\\OneDrive\\Desktop\\Screns" +image+".png");
		FileUtils.copyFile(src, dest);
		//FileHandler.copy(srcFile, dest);

	}

}
