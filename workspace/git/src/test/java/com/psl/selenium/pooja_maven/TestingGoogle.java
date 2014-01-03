package com.psl.selenium.pooja_maven;


import static org.junit.Assert.assertTrue;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingGoogle {     
                  private ScreenshotHelper screenshotHelper;
                  private static  WebDriver driver=new FirefoxDriver();
                                private static  String baseUrl;
                  
                                
        @Before
         public void openBrowser() {
                  	baseUrl = "http://www.wordpress.com/";
                    driver.get(baseUrl);
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    screenshotHelper = new ScreenshotHelper();
                  }
                  
        @After
         public void saveScreenshotAndCloseBrowser() throws IOException {
                    screenshotHelper.saveScreenshot("screenshot.png");
                    driver.quit();
                  }
                  
        @Test
         public void Valid()throws Exception{
          			driver.findElement(By.name("log")).sendKeys("pooja_joshi1@persistent.co.in");
          			driver.findElement(By.name("pwd")).sendKeys("!hero5bl");
          			driver.findElement(By.xpath(".//*[@id='signin-form']/input[4]")).click();
          			Boolean Element=driver.findElement(By.xpath(".//*[@id='reader-content']/div[1]/h2")).isDisplayed();
          			assertTrue("Blogs I Follow",Element);
          		}
                  
                
                  
                  private class ScreenshotHelper {
                      public void saveScreenshot(String screenshotFileName) throws IOException {
                      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                      FileUtils.copyFile(screenshot, new File(screenshotFileName));
                    }
                  }
                                
                                
                
}
