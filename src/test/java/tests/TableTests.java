package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TablePage;

import java.util.List;

public class TableTests {

    @Test
    public void tableTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\drago\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);
        homePage.openPage();
        homePage.selectExample("Sortable Data Tables");

        TablePage tablePage = new TablePage(driver);
        List<List<String>> tableData = tablePage.getTableData();
        for(int i = 0; i < tableData.size(); i++) {
            List<String> tableRow = tableData.get(i);
            int row = i + 1;
            for(int j = 0; j < tableRow.size(); j++) {
                System.out.println("Row " + row + " : " + tableRow.get(j));
            }
        }

        tablePage.close();

    }

}
