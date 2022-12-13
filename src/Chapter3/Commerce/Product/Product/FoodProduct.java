package Chapter3.Commerce.Product.Product;

import java.util.Date;

import Chapter3.Commerce.Feature.Locatable;
import Chapter3.Commerce.Feature.Priceable;

public class FoodProduct extends Product implements Locatable, Priceable {

	Date productionDate;
	int life;

	public FoodProduct(String sku, String description, double price, double tax, Date productionDate, int life) {
		super(description, sku, price, tax);
		this.productionDate = productionDate;
		this.life = life;
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
