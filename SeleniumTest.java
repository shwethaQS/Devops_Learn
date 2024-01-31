import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage with the dropdown
        driver.get("https://example.com");

        // Locate the dropdown element by its ID, name, XPath, or other suitable locators
        WebElement dropdownElement = driver.findElement(By.id("dropdownId"));

        // Create a Select object based on the dropdown element
        Select dropdown = new Select(dropdownElement);

        // Get the list of options from the dropdown
        java.util.List<WebElement> options = dropdown.getOptions();

        // Print each option's text
        for (WebElement option : options) {
            System.out.println("Dropdown Option: " + option.getText());
        }

        // Close the browser
        driver.quit();
    }
}
