package com.themesshopify.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.themesshopify.qa.base.TestBase;

public class ThemePage extends TestBase{
	
	@FindBy(xpath=("(//span[@class='theme-listing-cta-desktop-label'][normalize-space()='View demo store'])[2]"))
	WebElement viewStore;
	
	public ThemePage(){
		PageFactory.initElements(driver, this);
	}
	
	public DemoPage GoToDemoStore() 
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(viewStore).click().perform();
		return new DemoPage();
	}
}
