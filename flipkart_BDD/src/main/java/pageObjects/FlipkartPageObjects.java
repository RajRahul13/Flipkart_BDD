package pageObjects;

public interface FlipkartPageObjects {
	//closing login modal
	String crossBTN = "/html/body/div[3]/div/span" ;
	//click mobile icon
	String mobile_BTN ="//img[@alt='Mobiles']";
	//hover over to electronicssection
	String ElectronicBTNhover="(//span[@class='_2I9KP_'])[1]";
	//clicking on mi
	String BrandBTN ="//a[@title='Mi']";
	//sliding the price slider
	String slider1 ="(//div[@class='_3FdLqY'])[2]";
	String slider2 ="(//div[@class='_3FdLqY'])[1]";	
	//Searchfor“redmi go (black, 8 gb)”in the search bar
	String searchBox = "//input[@title=\"Search for products, brands and more\"]";
	//Click on the first product displayed on the screen
	String product = "//*[contains(text(),'APPLE iPhone 13 (Midnight, 128 GB)')]";
	//Hover on the image thumbnail which displays play video icon
	String videoICON = "//div[@class='_3g-Cpg']";
	//entering value in delivery text
	String pinCodeTXT = "//input[@id='pincodeInputId']";
	String checkBTN = "//div//span[@class='_2P_LDn']";
	//Click on “View Details”link under the Delivery pincode and verify that the modal pop up is opened or not. Close theModal(Use Modal )
	String viewDetailsBTN = "//div//span[@class='YxlyDn']";
	//closing modal
	String viewDetailsCloseBTN = "//*[@id=\"container\"]/div/div[1]/div/button";
	//adding item in cart
	String addToCartBTN = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button";
	//price
	String price = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/div[2]/span/div/div/div[2]/span";
	
	
}
