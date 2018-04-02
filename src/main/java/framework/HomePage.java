package framework;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends BasePage {
	private By logIn = By.xpath("//a[text()='Log In']");
	private By emailID = By.id("email");
	private By password = By.id("pwd");
	private By clickButton=  By.id("submitBtn");
	
	public void clickOnLoginButton() {
		clickOn(logIn);
	}


	public void enterEmail(String enterEmail) {
		sendEmailText(emailID, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		sendPassText(password, enterPassword);
	}
	public void clickOnLogin() {
		clickLogIn(clickButton);
	}
	
	
	
}
