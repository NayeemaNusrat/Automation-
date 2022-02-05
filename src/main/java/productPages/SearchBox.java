package productPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
	public SearchBox (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath = "//div[contains(.,'miss out on the latest')]/following-sibling::button")
		public WebElement closePopup;
		@FindBy(id = "gh-search-input")
		public WebElement searchBar;
}
