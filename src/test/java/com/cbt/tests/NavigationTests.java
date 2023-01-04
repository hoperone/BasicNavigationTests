package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NavigationTests {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //1. Open browser
        //2. Go to website https://google.com
        driver.get("https://google.com");

        //3. Save the title in a string variable
        String titleGoogle = driver.getTitle();

        //4. Go to https://etsy.com
        driver.get("https://etsy.com");

        //5. Save the title in a string variable
        String titleEtsy = driver.getTitle();

        //6. Navigate back to previous page
        driver.navigate().back();

        //7. Verify that title is same is in step 3
        if (titleGoogle.equals(driver.getTitle())) {
            System.out.println("Same title as in step 3");
        } else {
            System.out.println("Not the same title as in step 3");
        }

        //8. Navigate forward to previous page
        driver.navigate().forward();

        //9. Verify that title is same is in step 5
        if (titleEtsy.equals(driver.getTitle())) {
            System.out.println("Same title as in step 5");
        } else {
            System.out.println("Not the same title as in step 5");
        }

        driver.close();
    }
}
