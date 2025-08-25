package testclasses;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.letskodeit.pageclasses.AllProductsPage;
import com.letskodeit.pageclasses.LoginPage;
import com.letskodeit.pageclasses.ResultsPage;
import com.letskodeit.pageclasses.SearchBarPage;

public class AllProductsTests {
	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		baseURL = "https://tutorialsninja.com/demo";
		driver.get(baseURL);
	}
	
	@Test
	public void verifySearchProduct() {
		LoginPage login = new LoginPage(driver);
		login.open();
		login.signInWith("marvel01@gmail.com", "Ironman@123");
		
		AllProductsPage allProductsPage = new AllProductsPage(driver);
		allProductsPage.open();
		
//		SearchBarPage search = new SearchBarPage(driver);
//		search.product("iPhone");
		
		SearchBarPage search = new SearchBarPage(driver);
		
		ResultsPage result = search.product("iPhone");
		
		boolean searchResult = result.verifySearchResult();
		Assert.assertTrue(searchResult);
		
	}
	
	public void sortBy() {
		AllProductsPage allProductsPage = new AllProductsPage(driver);
		allProductsPage.open();
		
		SortByFilterPage sortByPage = new SortByFilterPage(driver);
		ResultsPage result = sortByPage.select("Model (Z - A)");
		
		
		
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
//		driver.quit();
	}
	
}
