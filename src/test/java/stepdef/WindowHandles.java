package stepdef;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandles {
	
	
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha.garudkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Sortable Data Tables']")).click();
		//driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();
		/*driver.findElement(By.xpath("//*[text()='Dropdown']")).click();
		Select s=new Select(driver.findElement(By.id("dropdown")));
		System.out.println(s.getOptions().size());
		List<WebElement> li=new ArrayList<WebElement>();
		li=s.getOptions();
		System.out.println(li.get(0).getText());
		System.out.println(li.get(1).getText());
		System.out.println(li.get(2).getText());
		//System.out.println(li.get(3).getText());*/
		
		/*if(driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).getText().contains("1")){
			driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
		}
		
		String parent=driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.linkText("iFrame")).click();
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']/document/html")).click();
		WebElement dr=driver.findElement(By.xpath("//body[@id='tinymce']"));
		dr.click();
		dr.sendKeys("Nisha");*/
		//driver.findElement(By.linkText("Nested Frames")).click();
		//int si=driver.findElements(By.tagName("frame")).size();
		//System.out.println(si);
		
		
		
		//Practice site http://the-internet.herokuapp.com/
		
		/*WebElement webelem=driver.findElement(By.xpath("//input[@onchange='showValue(this.value)']"));
		
		Dimension dim=webelem.getSize();
		int sliderwidth=dim.getWidth();
		System.out.println(sliderwidth);
		int xcoord=webelem.getLocation().getX();
		System.out.println(xcoord);
		Actions a=new Actions(driver);
		a.clickAndHold(webelem).build().perform();
		a.moveByOffset(200, 0).build().perform();*/
		
		List<WebElement> headcol= driver.findElements(By.xpath("//table[@class='tablesorter']/thead/tr/th"));
		int numcol=headcol.size();
		System.out.println(numcol);
		List<WebElement> firstrow= driver.findElements(By.xpath("//table[@class='tablesorter']/tbody/tr/td[1]"));
		int numrow=firstrow.size();
		System.out.println(numrow);
		
		
		

	}
	

}
