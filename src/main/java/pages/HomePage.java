package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("http://the-internet.herokuapp.com/");
    }

    public void selectExample(String value) {
        WebElement content = driver.findElement(By.id("content"));

        List<WebElement> listItems = content.findElements(By.xpath(".//li"));

        for(int i = 0; i < listItems.size(); i++) {
            WebElement elementText = listItems.get(i).findElement(By.xpath(".//a"));
            if(elementText.getText().equals(value)) {
                elementText.click();
                break;
            }
        }
    }

    public void close() {
        driver.close();
        driver.quit();
    }




}
