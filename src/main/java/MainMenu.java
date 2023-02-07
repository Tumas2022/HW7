import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainMenu extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/header/div[1]/div/a[1]/span")
    private WebElement ljLogo;
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[5]/a")
    private WebElement video;
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[6]/a")
    private WebElement traveling;
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[7]/a")
    private WebElement psychology;
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[8]/a")
    private WebElement food;
    @FindBy(xpath = "//*[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[11]/a")
    private WebElement health;
    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public MainMenu clickLJLogo() {
        ljLogo.click();
        return this;
    }
    public MainMenu clickVideo(){
        video.click();
        return this;
    }
    public MainMenu clickTraveling(){
        traveling.click();
        return this;
    }
    public MainMenu clickPsychology(){
        psychology.click();
        return this;
    }
    public MainMenu clickFood(){
        food.click();
        return this;
    }
    public MainMenu clickHealth(){
        health.click();
        return this;
    }
    public void clickWelcome(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement( ljLogo ).click().build().perform();
    }


}