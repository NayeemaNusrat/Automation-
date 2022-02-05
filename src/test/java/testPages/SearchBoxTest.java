package testPages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BasePage;
import productPages.SearchBox;

public class SearchBoxTest extends BasePage {

	@Test
	public void simpleSearch() {
		SearchBox searchBox = new SearchBox(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(searchBox.closePopup));
		searchBox.closePopup.click();
		wait.until(ExpectedConditions.elementToBeClickable(searchBox.searchBar));
		searchBox.searchBar.click();
		searchBox.searchBar.sendKeys("Hp Laptop", Keys.ENTER);
	}
}
