package pratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyClass {

    //1.task
    // ● Bir metod olusturun: acceptAlert
    //https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
    //      ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
    //      "You successfully clicked an alert" oldugunu test edin.

    //2.task
    //● Bir metod olusturun: dismissAlert
    //      ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
    //      "successfuly" icermedigini test edin.

    //3.task
    //● Bir metod olusturun: sendKeysAlert
    //      ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
    //      OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.

    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }

    @AfterClass
    public static void tearDown(){

        //driver.quit();
    }
    @Test
    public void acceptAlert(){
        //● Bir metod olusturun: acceptAlert
        //      ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        //      “You successfully clicked an alert” oldugunu test edin.



    }

    @Test
    public void dismissAlert(){
        //● Bir metod olusturun: dismissAlert
        //      ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //      “successfuly” icermedigini test edin.


    }

    @Test
    public void sendKeysAlert(){
        //● Bir metod olusturun: sendKeysAlert
        //      ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        //      OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.


    }
}
