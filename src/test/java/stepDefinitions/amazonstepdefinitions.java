package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class amazonstepdefinitions {
	public WebDriver driver;
	
	@Given("User is on Amazon website home page")
	public void user_is_on_amazon_website_home_page() {
	     driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	}
	@When("User searches with {string} on search bar")
	public void user_searches_with_on_search_bar(String searchname) {
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(searchname);
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
	@Then("User should be able to observe {string} on results page")
	public void user_should_be_able_to_observe_on_results_page(String result1) {
		String result = driver.findElement(By.xpath("//span[@class='a-truncate-cut'][normalize-space()='Shop vivo']")).getText();
	   Assert.assertEquals(result, result1);
	   driver.quit();
	}

}
