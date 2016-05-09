package cucumber_test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	private final WebDriver driver = new FirefoxDriver();

	@Given("^I am on the Google search page$")
	public void iVisitGoogle() {
		driver.get("https://www.google.com");
	}

	@When("^I search for \"(.*)\"$")
	public void searchFor(String query) {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(query);
		element.submit();
	}

	@Then("^the page title should start with \"(.*)\"$")
	public void checkTitle(final String startsWith) {
		new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith(startsWith);
			}
		});
	}

}
