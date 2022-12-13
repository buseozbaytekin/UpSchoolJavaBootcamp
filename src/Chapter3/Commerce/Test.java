package Chapter3.Commerce;

import Chapter3.Commerce.Product.Product.ClothProduct;
import Chapter3.Commerce.Product.Product.ConsultancyProduct;
import Chapter3.Commerce.Product.Product.Gift;
import Chapter3.Commerce.Product.Product.SecondHand;

public class Test {

	public static void main(String[] args) {
		ClothProduct cloth = new ClothProduct("a01","Trouser", 200.00, 20.00, "woman", "S");
		cloth.getPlace();
		System.out.println(cloth.toString());
		cloth.getDepot();
		cloth.purchase();
		
		System.out.println();
		
		SecondHand oldPC = new SecondHand("Old computer", 2000.00, false);
		oldPC.getDepot();
		oldPC.isSold();
		oldPC.getPlace();
		oldPC.isSold = true;
		oldPC.isSold();
		
		System.out.println();

		
		Gift gift = new Gift("a11", "Scarf");
		gift.getDepot();
		gift.getPlace();
		gift.giveAGift(cloth);
		
		System.out.println();

		ConsultancyProduct consultancy = new ConsultancyProduct("Development consultancy","c38a", 3880, 221);
		consultancy.purchase();
		consultancy.consultancy();
		
		
	}

}
