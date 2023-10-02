package step_Definitions;

import io.cucumber.java.en.*;
import pageEvents.FlipkartPageEvents;

public class flipkartSteps {
	FlipkartPageEvents FPO = new FlipkartPageEvents();
	@Given("I visit flipkart E-commerce site")
	public void i_visit_flipkart_e_commerce_site() {
		FPO.crossBTN();
	}

	@And("I go to mobile section of site")
	public void i_go_to_mobile_section_of_site() {
		FPO.mobile_BTN();
	}

	@And("I hover to electronics section")
	public void i_hover_to_electronics_section() {
		FPO.ElectronicBTNhover();
	}

	@And("I click on one of the available mobile brand")
	public void i_click_on_one_of_the_available_mobile_brand() {
		FPO.BrandBTN();
	}
	@And("I search for Iphone {int}")
	public void i_search_for_iphone(Integer int1) throws InterruptedException  {
		FPO.searchBox();
	}

	@When("I click on product and new window pops up")
	public void i_click_on_product_and_new_window_pops_up() throws InterruptedException {
		FPO.product();
	}

	@And("I hover over video icon of mobile")
	public void i_hover_over_video_icon_of_mobile() throws InterruptedException {
		FPO.videoICON();
	}

	@And("I enter pincode in delivery text")
	public void i_enter_pincode_in_delivery_text() throws InterruptedException {
		FPO.pinCodeTXT();
	}

	@And("I click on “View Details”link under the Delivery pincode  Close the Modal")
	public void i_click_on_view_details_link_under_the_delivery_pincode_close_the_modal() throws InterruptedException {
		FPO.viewDetailsBTN();
		

	}

	@And("I verify that the modal pop up is opened or not if yes close the Modal")
	public void i_verify_that_the_modal_pop_up_is_opened_or_not_if_yes_close_the_modal() throws InterruptedException {
		FPO.viewDetailsCloseBTN();
	}

	@And("I add item to the cart")
	public void i_add_item_to_the_cart() {
		FPO.addToCartBTN();
	}

	@Then("I verify final price of the item.")
	public void i_verify_final_price_of_the_item() {
		FPO.price();
	}

}
