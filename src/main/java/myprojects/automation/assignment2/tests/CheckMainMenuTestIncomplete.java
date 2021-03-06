package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CheckMainMenuTestIncomplete extends BaseScript{

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

        //Кликнуть на каждом видимом пункте главного меню (Dashboard, Заказы, Каталог, Клиенты...) для открытия соответствующего раздела
        WebElement dashbLink1 = driver.findElement(By.id("subtab-AdminParentOrders"));
        dashbLink1.click();

        //Вывести в консоль заголовок открытого раздела.
        WebElement dashbLink2 = driver.findElement(By.id("shopping_basket"));
        System.out.println("Заголовок открытого раздела - " + (dashbLink2.getText()));



        //Выполнить обновление (рефреш) страницы


        // проверить, что пользователь остается в том же разделе после перезагрузки страницы. https://stackoverflow.com/questions/24777134/selenium-after-launching-a-website-how-could-we-check-if-the-right-page-is-laun
        //Assert.assertEquals(loggedInUser.getText(),"PAVEL007");
        //or
        //driver.getSource().contains("a string");
        //or
        //if ( driver.findElement(myElement).getText().equalsIgnoreCase("my value") ) //do



        //close the browser:
        //driver.quit();

    }
}
