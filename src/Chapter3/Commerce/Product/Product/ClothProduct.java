package Chapter3.Commerce.Product.Product;

import Chapter3.Commerce.Feature.Locatable;
import Chapter3.Commerce.Feature.Priceable;

public class ClothProduct extends Product implements Priceable, Locatable {

	String sex;
	String size;

	public ClothProduct(String sku, String description, double price, double tax, String sex, String size) {
		super(description, sku, price, tax);
		this.sex = sex;
		this.size = size;

	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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
