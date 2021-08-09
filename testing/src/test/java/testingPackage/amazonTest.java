package testingPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class amazonTest {

	public static String uRl = "https://www.amazon.com/";
	public static String driverKey = "webdriver.chrome.driver";
	public static String driverValue = "./Driver/chromedriver.exe";
	public static String mobileModel = "OnePlus";
	public static String actualTitle = " ";
	public static String expectedTitle = "Amazon.com. Spend less. Smile more.";
	public static void main(String[] args) throws Exception {

		// Driver launch
		try {
			System.setProperty(driverKey, driverValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebDriver driver = new ChromeDriver();

		// Open Amazon website
		try {
			driver.get(uRl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed !");
		}
		else
		{
			System.out.println("Test Failed !" );
		}
		
		elements amazonTest = new elements(driver);
	    Thread.sleep(2000);
		amazonTest.allButton();
		amazonTest.electronicsButton();
		amazonTest.cellPhoneOption();
		amazonTest.cellPhone();
		amazonTest.onePlusCheckBox();
		amazonTest.selectMobile();
		
		//get price 
		String price1 = amazonTest.priceElement1();
		String price2 = amazonTest.priceElement2();
		String price3 = amazonTest.priceElement3();
		System.out.println("PRICE 1 : " + price1 +"\n" + "PRICE 2 : " + price2 +"\n" +"PRICE 3 : "+price3);	
		
		//add mobile to cart
		amazonTest.addtoCart();
		System.out.println("Mobile is added to the cart");	
		String cartCount = amazonTest.actualcart();//get
		System.out.println("Count of Mobile added to the cart is : " + cartCount);
		System.out.println("****** Assignment End ******");	
	    driver.quit();
		System.exit(0);

	}

}

