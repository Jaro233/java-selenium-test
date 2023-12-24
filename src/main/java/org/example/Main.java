package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    WebDriver driver;
    //    launching browser
    public void LaunchBrowser() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.simplilearn.com/");
    }
    //    search element and click on it
    public void search() throws InterruptedException {
        driver.findElement(By.id("header_srch")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h2[contains(text(),'Automation Testing Masters Program')]")).click();
        Thread.sleep(3000);
        System.out.println("The page title is: " + driver.getTitle());
    }
    //    close the browser

    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        Main obj = new Main();
        obj.LaunchBrowser();
        obj.search();
        obj.closeBrowser();
    }
}