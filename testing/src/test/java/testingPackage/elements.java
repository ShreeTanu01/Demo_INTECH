package testingPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class elements {
	
	WebDriver driver;
	By allButtonValue = By.xpath("//*[@id=\"nav-hamburger-menu\"]");	                             
	By electronicsButtonValue = By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a");	                                    
	By cellPhoneOptionValue = By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a");	                                  
	By cellPhoneValue = By.xpath("//*[@id=\"n/7072561011\"]/span/a/span");
	By onePlusCheckBoxValue = By.xpath("//*[@id=\"p_89/OnePlus\"]/span/a/div/label/i");                                  
	By selectMobileValue = By.xpath("//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')]  [contains(text(),'OnePlus 8 Glacial Green,​ 5G Unlocked Android Smartphone U.S Version, 8GB RAM+128GB Storage, 90Hz Fluid Display,Triple Camera, with Alexa Built-in,')]");                                
	By priceElement1Value = By.xpath("//span[contains(@id,'mbc-price-1')]  [contains(@class,'a-size-medium a-color-price')]");         
	By priceElement2Value = By.xpath("//span[contains(@id,'mbc-price-2')]  [contains(@class,'a-size-medium a-color-price')]");                                  
	By priceElement3Value = By.xpath("//span[contains(@id,'mbc-price-3')]  [contains(@class,'a-size-medium a-color-price')]");                                 
	By addtoCartValue = By.xpath("//input[@class='a-button-input'][contains(@aria-labelledby,'mbc-buybutton-addtocart-1-announce')]");                             
	By actualcartValue = By.xpath("//span[@id='nav-cart-count'][@class = 'nav-cart-count nav-cart-1 nav-progressive-attribute nav-progressive-content']");
	                               
   
	public elements(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	public void allButton()
	{
		driver.findElement(allButtonValue).click();
	}
	public void electronicsButton()
	{
		driver.findElement(electronicsButtonValue).click();
	}
	public void cellPhone()
	{
		driver.findElement(cellPhoneValue).click();
	}
	public void selectMobile()
	{
		driver.findElement(selectMobileValue).click();
	}
	public void onePlusCheckBox()
	{
		driver.findElement(onePlusCheckBoxValue).click();
	}
	public String priceElement1()
	{
		String price1 = driver.findElement(priceElement1Value).getText();
		return price1;
	}
	public String priceElement2()
	{
		String price2 =driver.findElement(priceElement2Value).getText();
		return price2;
	}
	public String priceElement3()
	{
		String price3 = driver.findElement(priceElement3Value).getText();
		return price3;
	}
	public void addtoCart()
	{
		driver.findElement(addtoCartValue).click();
	}
	public void cellPhoneOption()
	{
		driver.findElement(cellPhoneOptionValue).click();
	}
	public String actualcart()
	{
		String cartCount = driver.findElement(actualcartValue).getText();
		return cartCount;
	}
}
