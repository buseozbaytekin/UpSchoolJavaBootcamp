package Chapter3.Commerce.Product.Product;

import Chapter3.Commerce.Feature.Locatable;
import Chapter3.Commerce.Feature.Priceable;
import Chapter3.Commerce.Product.AbstractProduct;

public class SecondHand implements Locatable, Priceable {

	String description;
	double price;
	public boolean isSold = false;

	public SecondHand(String description, double price, boolean isSold) {

		this.description = description;
		this.price = price;
		this.isSold = isSold;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void purchase() {
		System.out.println(description + " product is sold.");

	}

	@Override
	public void getDepot() {
		System.out.println(getDescription() + " product in the depot.");

	}

	@Override
	public void getPlace() {
		System.out.println(getDescription() + " product get placed.");

	}

	public boolean isSold() {

		if (!isSold) {
			isSold = true;
			System.out.println("This second hand " + getDescription() + " is available to sell.");
		} else {
			System.out.println("Product is sold for "+ price +" ! You can not sell anymore this good.");
		}

		return isSold;
	}

}
