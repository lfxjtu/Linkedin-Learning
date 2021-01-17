package _01_02_how_abstractions_help.begin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowAbstractionsHelpTest {
    private WebDriver driver;

    @BeforeEach
    public void setupData(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://eviltester.github.io/simpletodolist");
    }

    @Test
    public void canCreateATodoList(){

        // ATodoAppNavigator
        // ATodoListsPage

    }

    @Test
    public void canCreateAnotherTodoList() {

        // ATodoAppUser
        // ATodoListsPage

    }

    @AfterEach
    public void closeBrowser(){
        driver.close();
    }
}
