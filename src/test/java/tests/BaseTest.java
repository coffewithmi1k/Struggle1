package tests;

import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {


   WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Epic("Regression Tests")
    @Feature("Google test")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Here I will show you some Test description")
    @Story("StoryOfMyLife")
    @Test
    public void getGoogle(){
        driver.get("Https:google.com");
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
