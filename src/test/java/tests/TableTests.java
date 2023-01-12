package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TablePage;

public class TableTests {

    @Test
    public void tableTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\drago\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.selectExample("Sortable Data Tables");

        TablePage tablePage = new TablePage(driver);
        tablePage.getTableData();

        tablePage.close();

    }

}
