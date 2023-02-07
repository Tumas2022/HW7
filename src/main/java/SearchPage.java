import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[1]/div/form/button/span")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[4]/div[1]/section[3]/div/div/form/div/input")
    private WebElement input;
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void toSearch(String value){
    searchButton.click();
    input.sendKeys(value);
    searchButton.click();
    }
}