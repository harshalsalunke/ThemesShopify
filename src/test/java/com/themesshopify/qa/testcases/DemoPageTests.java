package com.themesshopify.qa.testcases;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.themesshopify.qa.base.TestBase;
import com.themesshopify.qa.pages.DemoPage;
import com.themesshopify.qa.pages.HomePage;
import com.themesshopify.qa.pages.ThemePage;

public class DemoPageTests extends TestBase {
	HomePage homePage;
	ThemePage themePage;
	DemoPage demoPage;
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test(dataProvider = "themes")
	public void OpenURL(String theme) throws IOException   
	{
		
		homePage=new HomePage();
		homePage.SearchTheme(theme);
		themePage=homePage.SelectTheme(theme);
		demoPage=themePage.GoToDemoStore();
		demoPage.getSectionDetails(theme);

	}
	
	@AfterMethod
	public void tearDowwn() {
		driver.quit();
	}
	
	@AfterClass
	public void close() throws IOException
	{
		createCSV();
	}
	
	@DataProvider(name = "themes")
    public Object[][] passwordDataProvider() {
        List<String[]> data = new ArrayList<>();
        String filePath = "/ThemesShopify/src/test/java/com/themesshopify/qa/testdata/theme_names.csv"; 
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            data = csvReader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        
        Object[][] dataArray = new Object[data.size() - 1][1];
        for (int i = 1; i < data.size(); i++) {
            dataArray[i - 1][0] = data.get(i)[1]; 
        }

        return dataArray;
    }
	

}
