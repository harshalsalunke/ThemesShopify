package com.themesshopify.qa.base;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.opencsv.CSVWriter;

public class TestBase {
	
	
		public static WebDriver driver;
		public static  List<String[]> list = new ArrayList<>();
		public  CSVWriter writer;
		static String projectDir = System.getProperty("user.dir");
		
	   
		public static void initialization()  {
			ChromeOptions option=new ChromeOptions();
			//option.addArguments("--headless");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("https://themes.shopify.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			
		
		}
		public static void createCSV() throws IOException {			
			    CSVWriter writer=new CSVWriter(new FileWriter(projectDir+"\\test-output\\OutPut-Data\\ThemeSectionList.csv"));
			    String[] header = {"Themes", "Sections"};
				list.add(0, header);
			    writer.writeAll(list);
			    writer.close();
			   
		}
		
		public static void insertList(String theme,List<String> sectionIds) {
			String[] themeEntry= {theme,"contains "+sectionIds.size()+" sections"};
			list.add(themeEntry);
			
			for(String section:sectionIds) {
				String[] entry = {theme,section};
				list.add(entry);
			}				
			
		}
		
		

}
