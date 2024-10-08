 package seleniumBasics; 
  
 import java.util.ArrayList; 
 import java.util.List; 
  
 import org.openqa.selenium.By; 
 import org.openqa.selenium.WebDriver; 
 import org.openqa.selenium.WebElement; 
 import org.openqa.selenium.chrome.ChromeDriver; 
  
 public class HtmlTable { 
  
 	public static void main(String[] args) { 
 		WebDriver driver=new ChromeDriver(); 
 		driver.get("https://selenium.qabible.in/table-pagination.php"); 
 		driver.manage().window().maximize(); 
 		 
 		WebElement tableheadElement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr/th[1]")); 
 		System.out.println(tableheadElement.getText()); 
 		 
 		List<WebElement> tableHead=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr/th")); 
 		 
 		for(int i=0;i<tableHead.size();i++) 
 		{ 
 			System.out.print(tableHead.get(i).getText()+"  "); 
 		} 
 		System.out.println();
 		List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
 		
 				for(int j=0;j<tableRows.size();j++) 
 		 		{ 
 		 			System.out.print(tableRows.get(j).getText()+"  "); 
 		 		} 
 	
 	List<WebElement> tableColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
 	System.out.println();
 	for(int a=0;a<tableColumn.size();a++)
 	{
 		System.out.print(tableColumn.get(a).getText()+"  "); 
 	}
 	System.out.println();
 	WebElement singleElement = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[1]"));
 	System.out.println(singleElement.getText());
 	
 	List<WebElement> tableRowSize = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
 	
 	for(int b=0;b<tableRowSize.size();b++)
 	{
 	if(tableRowSize.get(b).getText().equals("Cedric Kelly"))
 	{
 		WebElement age = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+(b+1)+"]//td[4]"));
 		System.out.println(age.getText());
 	}
 	}
 	
 	//print table
 	
 	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
 	List<WebElement> columns = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
 	
 	
 	for(int c=0;c<rows.size();c++)
 	{
 		for(int d=0;d<columns.size();d++)
 		{
 			String path ="//table[@id='dtBasicExample']//tbody//tr["+(c+1)+"]//td["+(d+1)+"]";
 			WebElement table =driver.findElement(By.xpath(path));
 			System.out.println(table.getText()+" ");
 		}
 		System.out.println();
 	}
 	
 	
 	
 	driver.quit();
 	}
 	
 	
 	//
 	
 }