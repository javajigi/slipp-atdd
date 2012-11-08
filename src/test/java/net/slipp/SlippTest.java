package net.slipp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class SlippTest {
	private WebDriver driver; 
	
	@Before
	public void setup() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("webdriver.firefox.bin", "/usr/bin/firefox");
		driver = new FirefoxDriver(profile);
	}
	
	@Test
	public void search() throws Exception {
		driver.get("http://www.slipp.net");
		assertThat(driver.getTitle(), is("SLiPP"));
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
}
