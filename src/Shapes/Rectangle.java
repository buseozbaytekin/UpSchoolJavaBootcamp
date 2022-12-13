package Shapes;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
//		r.drawFilledRectangle(10, 5);
//		r.drawFilledFakeRectangle();
//		r.drawVoidRectangle(10, 5);
		r.drawTriangle(10, 0);
		
		System.out.println();
		
	}
	
	
	public void drawFilledFakeRectangle() {
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");
		System.out.println("******");

	}
	
	public void drawFilledRectangle(int row, int column) {
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
				if(j == column -1) {
					System.out.println();
				}
				
			}
		}
	}
	
	public void drawVoidRectangle(int row, int column) {
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 | i == row - 1) {
					System.out.print("*");
				}
					else {
						if(j == 0 | j == column - 1)
							System.out.print("*");
						else
							System.out.print(" ");
					}
			}
			
			System.out.println();

				
			}
	}
	
	public static void drawTriangle (int row, int column) {
		for(int i = 1; i < row; i++) {
			for(int k = 0; k < column - 1 / 2; k++) {
			System.out.print(" ");
			}
			for(int j = 0; j < 2 * i - 1; j++) {
			System.out.print("*");
			}
			column--;
			System.out.println();
			}

		
		
		
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	


