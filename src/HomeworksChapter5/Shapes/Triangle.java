package HomeworksChapter5.Shapes;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawTriangle(10);
		drawTriangleSimple(10);
	}
	
	public static void drawTriangle(int height) {
		
		for(int row = 0; row < height; row++) {
			for(int k = 0; k < (height - row); k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2* row + 1; j++) {
				System.out.print("*");
			}
			for(int k = 0; k < (height - row); k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	public static void drawTriangleSimple(int height) {
		for(int row = 0; row < height ; row++) {
			for(int k = 0; k < 2 * height ; k++) {
				int star = ((2 * height - 1) - (2 * row + 1)) / 2;
				if(k <= star | k > star + (2 * row + 1)) 
					System.out.print(" ");
				
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
	}
	

}
