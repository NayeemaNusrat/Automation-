package commonClass;

import org.openqa.selenium.WebElement;

public class CommonMethod {

	public void click(WebElement element) {
		element.click();

	}

	public void sendKeys(WebElement element, String value) {
		element.sendKeys(value);

	}
}
