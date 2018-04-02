package framework;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import stepdefinition.SharedSD;


public class BasePage {
  public void clickOn(By locator) {
	  try {
		  SharedSD.getDriver().findElement(locator).click();
	  }catch(NoSuchElementException e) {
		 Assert.fail("Element is not found with this locator " +locator.toString()); 
		 e.printStackTrace();
	  }
  }
  public void sendEmailText(By locator, String text) {
		try {
			SharedSD.getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
}
    public void sendPassText(By locator, String text) {
    	try {
    		SharedSD.getDriver().findElement(locator).sendKeys(text);
    	}catch(NoSuchElementException e) {
    		Assert.fail("Element is not found with this locator " +locator.toString());
    		e.printStackTrace();
    	}
    }
    public void clickLogIn(By locator) {
    	try {
    		 SharedSD.getDriver().findElement(locator).click();
    	}catch(NoSuchElementException e) {
    		 Assert.fail("Element is not found with this locator " +locator.toString()); 
    		e.printStackTrace();
    	}
    }
}