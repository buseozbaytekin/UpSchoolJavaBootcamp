package Chapter3.Commerce.Product.Product;

import Chapter3.Commerce.Feature.Locatable;
import Chapter3.Commerce.Product.AbstractProduct;

public class Gift extends AbstractProduct implements Locatable {

	public Gift(String description, String sku) {
		super(description, sku);

	}

	public void giveAGift(Product product) {
		System.out.println("This product is your gift: " + super.getDescription());

	}

	@Override
	public void getDepot() {
		System.out.println(super.getDescription() + " product in the depot.");

	}

	@Override
	public void getPlace() {
		System.out.println(super.getDescription() + " product get placed.");

	}

}
