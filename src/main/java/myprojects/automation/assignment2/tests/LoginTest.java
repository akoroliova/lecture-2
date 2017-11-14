package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {

        //open target web-address in chrome:
        WebDriver driver = initChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        //find login field and enter an email address there:
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("webinar.test@gmail.com");

        //find password field and enter password there:
        WebElement pwField = driver.findElement(By.id("passwd"));
        pwField.sendKeys("Xcg7299bnSmMuRLp9ITw");

        //click on the button to login:
        WebElement searchButton = driver.findElement(By.name("submitLogin"));
        searchButton.click();

        //sleep for 3 seconds after authentication for the main page to load:
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //find user icon and click on it:
        WebElement userIcon = driver.findElement(By.xpath("//*[@id=\"employee_infos\"]/a/span/img"));
        userIcon.click();

        //find option "Выход" and click to logout:
        driver.findElement(By.id("header_logout")).click();

        //close the browser:
        driver.quit();

    }
}
