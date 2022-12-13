package Chapter2.Shape;


public class ShapeFactory {
	
		
		public Shape createShape() {
			Shape shape = null;
			
			int i = (int) (5 * Math.random());
			
			switch (i) {
			case 0:
				shape = new Circle();
				break;
			case 1:
				shape = new Rectangle();
				break;
			case 2:
				shape = new Square();
				break;
			case 3:
				shape = new Triangle(2, 3, 6);
				break;
			}

			return shape;
		}
		
	}


