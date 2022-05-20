package day11_fake_file;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_FileDownloand extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        //1. Tests packagenin altina bir class oluşturalim
        //2. https://the-internet.herokuapp.com/download adresine gidelim.

        driver.get("https://the-internet.herokuapp.com/download");

        //3. code.txt dosyasını indirelim
        WebElement dummyLinki=driver.findElement(By.xpath("//a[text()='dummy.txt']"));
        dummyLinki.click();
        Thread.sleep(5000);

        //4. dosyanın başarıyla indirilip indirilmediğini test edelim

        String farkliIsim=System.getProperty("user.home");
        String ortakKisim="\\Download\\dummy.txt";




    }
}
