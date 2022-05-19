package day10_actions;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C02_Actions extends TestBase {



    @Test
    public void test01() throws InterruptedException {
        // amazon anasayfa'ya gidip
        // account menusunden create a list linkine tiklayalim

        driver.get("https://www.amazon.com");
        Actions actions=new Actions(driver);
        WebElement accountLinkine= driver.findElement(By.xpath("//*[text()='Account & Lists']"));
        actions.moveToElement(accountLinkine).perform();

        driver.findElement(By.xpath("//*[text()='Account & Lists']")).click();



        Thread.sleep(5000);

    }
}
