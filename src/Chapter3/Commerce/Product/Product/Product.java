package Chapter3.Commerce.Product.Product;

import Chapter3.Commerce.Feature.Priceable;
import Chapter3.Commerce.Product.AbstractProduct;


public class Product extends AbstractProduct implements Priceable{

	private double price;
	private double tax;

	
	Product(String sku, String description, double price, double tax) {
		super(description, sku);
		this.price = price;
		this.tax = tax;
		
	}
	
	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		this.price = price;
	}

	public final double getTax() {
		return tax;
	}

	public final void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public void purchase() {
		System.out.println(super.getDescription() + " product is sold for " + this.getPrice());

	}

	@Override
	public String toString() {
		return "Product: "+ super.description + ", price=" + price + ", tax=" + tax ;
	}
	
}
