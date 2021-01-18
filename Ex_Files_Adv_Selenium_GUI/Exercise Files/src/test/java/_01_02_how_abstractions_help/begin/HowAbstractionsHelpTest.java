package _01_02_how_abstractions_help.begin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.Assert;

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

        ATodoAppNavigator navigate = new ATodoAppNavigator(driver);
        ATodoListsPage todolists = navigate.to().todoListsPage();
        todolists.enterTodoListName("my todo list");
        Assertions.assertEquals("my-todo-list",
                todolists.getDisplayedListText("my-todo-list"));
        // ATodoListsPage

    }

    @Test
    public void canCreateAnotherTodoList() {

        String listName = new ATodoAppUser(driver).createsATodoList();
        Assertions.assertEquals(listName,
                new ATodoListsPage(driver).getDisplayedListText(listName));

    }

    @AfterEach
    public void closeBrowser(){
        driver.close();
    }
}
