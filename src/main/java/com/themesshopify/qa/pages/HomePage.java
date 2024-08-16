package com.themesshopify.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.themesshopify.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath=("//button[@aria-label='Search the Theme Store']//*[name()='svg']"))
	WebElement searchIcon;
	
	@FindBy(xpath=("//input[@id='q']"))
	WebElement searchBox;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void SearchTheme(String theme)
	{
		searchIcon.click();
		searchBox.sendKeys(theme);		
		
	}
	public ThemePage SelectTheme(String theme)
	{
		WebElement selectTheme=driver.findElement(By.xpath(("(//ul[@class='theme-search__results-list'])[contains(.,'"+theme+"')]")));
		selectTheme.click();
		return new ThemePage();
	}

}
