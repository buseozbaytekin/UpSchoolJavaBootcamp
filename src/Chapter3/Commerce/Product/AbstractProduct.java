package Chapter3.Commerce.Product;

public abstract class AbstractProduct {

	protected String sku;
	protected String description;

	public AbstractProduct(String sku, String description) {
		this.sku = sku;
		this.description = description;
	}

	public final String getSku() {
		return this.sku;
	}

	public String getDescription() {
		return this.description;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
