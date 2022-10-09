package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class odev_2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.  Yeni bir class olusturun (TekrarTesti)
        2.  Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3.  Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        4.  Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5.  Youtube sayfasina geri donun
        6.  Sayfayi yenileyin
        7.  Amazon sayfasina donun
        8.  Sayfayi tamsayfa yapin
        9.  Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        10. Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        11. Sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
        String istenenTitle="youtube";
        if (driver.getTitle().contains(istenenTitle)) {
            System.out.println("Title tesi PASSED");
        } else {
            System.out.println("Youtube Actual Title testi FAILED : " + driver.getTitle());
        }
        String istenenUrl="youtube";
        if (driver.getCurrentUrl().contains(istenenUrl)) {
            System.out.println("Current URL tesi PASSED");
        } else {
            System.out.println("Youtube Actual URL testi FAILED : " + driver.getCurrentUrl());
        }
        Thread.sleep(2000);
        driver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        String istenenTitle2= "amazon";
        if (driver.getTitle().contains(istenenTitle2)) {
            System.out.println("Amazon Title testi PASSED");
        } else {
            System.out.println("Amazon Actual Title testi FAILED : " + driver.getTitle());
        }
        String istenenUrl2="https://www.amazon.com";
        if (driver.getCurrentUrl().contains(istenenUrl2)) {
            System.out.println("Amazon URL testi PASSED");
        } else {
            System.out.println("Amazon URL testi FAILED : " + driver.getCurrentUrl());
        }
        driver.close();
        /*
        Youtube Actual Title testi FAILED : YouTube
        Current URL tesi PASSED
        Amazon Actual Title testi FAILED : Amazon.com. Spend less. Smile more.
        Amazon URL testi PASSED
         */
    }
}