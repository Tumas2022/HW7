import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;
public class MainPageTest extends AbstractTest {

    @Test
    void mainMenuNavigateTest() {
        MainMenu mainMenu = new MainMenu( getWebDriver() );
        mainMenu
                .clickPsychology()
                .clickVideo()
                .clickFood()
                .clickHealth()
                .clickTraveling();
        Assertions.assertEquals( "https://www.livejournal.com/category/puteshestviya/", getWebDriver().getCurrentUrl() );
    }

    @Test
    void mainMenuWelcomeTest() {
        MainMenu mainMenu = new MainMenu( getWebDriver() );
        mainMenu.clickWelcome();
        Assertions.assertEquals( "https://www.livejournal.com/", getWebDriver().getCurrentUrl() );
    }

    @Test
    void searchTest() {
        SearchPage searchPage = new SearchPage( getWebDriver() );
        searchPage.toSearch( "Русское географическое общество" );
    }

    @Test
    @DisplayName("Дай логи")
    @Description("Создаем логи")
    @Link("https://www.livejournal.com/")

    @Severity(SeverityLevel.NORMAL)
    void testLogs() {
        LogEntries browserLogs = getWebDriver().manage().logs().get( LogType.BROWSER );
        List<LogEntry> allLogRows = browserLogs.getAll();
        if (allLogRows.size() > 0) {
            allLogRows.forEach( logEntry -> {
                System.out.println( logEntry.getMessage() );
            } );
        }
    }
   }