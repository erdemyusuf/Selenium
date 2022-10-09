package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class odev_3 {
    public static void main(String[] args) throws InterruptedException {
        /*
    1.  Bir class oluşturun: LoginTest
    2.  Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.  http://a.testaddressbook.com adresine gidiniz.
        b.  Sign in butonuna basin
        c.  email textbox,password textbox, and signin button elementlerini locate ediniz..
        d.  Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
            i.  Username : testtechproed@gmail.com
            ii. Password : Test1234!
        e.  Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f.  “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3.  Sayfada kac tane link oldugunu bulun.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // a)
        driver.get("http://a.testaddressbook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //b)
        driver.findElement(By.id("sign-in")).click();
        //c)
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(5000);
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(5000);
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();
        Thread.sleep(3000);
        String emailTextBox2 = "Bad email or password.";
        if (driver.getPageSource().contains(emailTextBox2)) {
            System.out.println("Mail adresi girisi FAILED");
        }else {
            System.out.println("Mail adresi girisi PASSED");
        }
        Thread.sleep(3000);
        WebElement adres= driver.findElement(By.linkText("Addresses"));
        if (adres.isDisplayed()) {
            System.out.println("Addresses displayed SUCCESSFULLY");
        } else {
            System.out.println("Addresses displayed UNSUCCESSFULLY");
        }
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (signOut.isDisplayed()) {
            System.out.println("Sign Out displayed SUCCESSFULLY");
        } else {
            System.out.println("Sign Out displayed UNSUCCESSFULLY");
        }
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada " + list.size() +" adet link bulunmaktadır.");
        driver.close();
        /*
        Mail adresi girisi PASSED
        Addresses displayed SUCCESSFULLY
        Sign Out displayed SUCCESSFULLY
        Sayfada 3 adet link bulunmaktadır.
         */
    }
}