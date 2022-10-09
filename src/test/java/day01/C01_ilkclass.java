package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();  // Webdriver bir interfacedir. bu yuzden ChromeDriver() constructor uzerinden obje olusturduk

        driver.get("https://www.amazon.com");
        System.out.println("Actual Title : "+driver.getTitle()); //sitenin basligini gosterir
        System.out.println("Actual Url : "+driver.getCurrentUrl()); //sayfa url sini gosterir
        System.out.println("Kaynak Kodlari : "+driver.getPageSource());


    }
}

