package commonClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import baseClass.BasePage;

public class CommonWaits {
public void waitUntilClickable(WebElement element) {
	try {
		BasePage.wait.until(ExpectedConditions.elementToBeClickable(element));
	} catch (NullPointerException e) {
		System.out.println(element + " : Not Found");
		e.printStackTrace();
		Assert.fail();
	}
}
}

