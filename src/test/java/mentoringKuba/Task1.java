package mentoringKuba;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class Task1 {
    @Test
    public void tc() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground/");
        WebElement inputFormLink = driver.findElement(By.linkText("Input Form Submit"));
        inputFormLink.click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.cssSelector("#name"));
        name.sendKeys("Tony Tenev");
        WebElement email = driver.findElement(By.cssSelector("#inputEmail4"));
        email.sendKeys("tony@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#inputPassword4"));
        password.sendKeys("123456789");
        WebElement company = driver.findElement(By.cssSelector("#company"));
        company.sendKeys("CodeFish");
        WebElement webSite = driver.findElement(By.cssSelector("#websitename"));
        webSite.sendKeys("https://codefish.io/");
        webSite.sendKeys(Keys.ARROW_DOWN);
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.sendKeys("Bulgaria");
        webSite.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        WebElement city = driver.findElement(By.cssSelector("#inputCity"));
        city.sendKeys("Haskovo");
        webSite.sendKeys(Keys.ARROW_DOWN);
        WebElement address = driver.findElement(By.cssSelector("#inputAddress1"));
        address.sendKeys("Main Str");
        WebElement address2=driver.findElement(By.cssSelector("#inputAddress2"));
        address2.sendKeys("!st str");
        address2.sendKeys(Keys.ARROW_DOWN);
        WebElement state = driver.findElement(By.cssSelector("#inputState"));
        state.sendKeys("Illinois");
        state.sendKeys(Keys.ARROW_DOWN);
        WebElement zipCode = driver.findElement(By.cssSelector("#inputZip"));
        zipCode.sendKeys("60656");
        zipCode.sendKeys(Keys.ARROW_DOWN);
        WebElement submitButton = driver.findElement(By.xpath("//button[@class='bg-lambda-900 hover:bg-transparent hover:text-lambda-900 border border-lambda-900 text-white rounded p-10 focus:outline-none w-180 selenium_btn py-5 px-10 rounded']"));
        submitButton.click();
        Thread.sleep(2000);
        List<WebElement> allText = driver.findElements(By.xpath("//p"));
        for (int i = 0; i < allText.size(); i++) {
            if (allText.get(i).getText().contains("Thanks")){
                Assert.assertEquals(allText.get(i).getText(),"Thanks for contacting us, we will get back to you shortly.");
                System.out.println(allText.get(i).getText());
                break;
            }

        }








    }
}
