package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe"); //ZORUNLU
        WebDriver driver = new ChromeDriver(); //ZORUNLU obje adı driver olmayabilir elma,armut vb...
        driver.manage().window().maximize(); //bu metodu sayfa yapısını daha rahat gormek uzere yazdık. yazma zorunlu degil

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//bu metodu sayfa acılısında hata var mı diye yazdık. yazma zorunlu degil

        driver.get("https://amazon.com");

        //Amazonda nutella aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella",Keys.ENTER); // id uniqe olduğu bu sorunsuz çalışır

        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // uniqe olduğu için sorunsuz çalışır

        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
        /*
        Bu locatar çalismadı
        Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz
         */

       driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();


    }
}