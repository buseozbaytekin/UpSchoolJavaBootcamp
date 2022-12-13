package Chapter3.Commerce.Product.Product;

import Chapter3.Commerce.Feature.Priceable;

public class ConsultancyProduct extends Product implements Priceable {
	
	public ConsultancyProduct(String description, String sku, double price, double tax) {
		super(description, sku, price, tax);
		
	}

	public void consultancy() {
		System.out.println(super.getDescription()+" service provided.");
	}
	
	@Override
	public void purchase() {
		System.out.println(super.getDescription() + " service cost is " + super.getPrice());
	}

}
