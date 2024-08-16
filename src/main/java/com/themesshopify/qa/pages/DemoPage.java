package com.themesshopify.qa.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.themesshopify.qa.base.TestBase;

public class DemoPage extends TestBase{
	
	//@FindBy(xpath =("//iframe[@id='PreviewFrame']"))
	//WebElement previewFrame;
	
	public DemoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getSectionDetails(String theme) throws IOException
	{
		List<String> sectionIds = new ArrayList<>();
		WebElement mainElement = driver.findElement(By.tagName("main"));
		
		WebElement previewFrame=mainElement.findElement(By.xpath("//iframe[@id='PreviewFrame']"));
		
		driver.switchTo().frame(previewFrame);
		
        List<WebElement> sectionList = driver.findElements(By.xpath("//div[contains(@id,\"shopify-section\")]"));
       
        
        for (WebElement section : sectionList) {
        	sectionIds.add(section.getAttribute("id"));
        }
        //System.out.println(sectionIds);
        insertList(theme, sectionIds);
	}
}
