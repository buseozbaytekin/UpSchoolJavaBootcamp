package HomeworksChapter4;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operators number = new Operators();
		
		number.multiple(0);
		number.buse();
		number.conditions();
		number.ternaryOperator();

	}
	
	int number1 = 10;
	int number2 = 15;
	int number3;
	
	public void multiple(int newNumber) {
		
		
		
		newNumber = number1 + number2;
		number3 += newNumber;
		
		
		System.out.println(number1);
		System.out.println(number2);

		System.out.println("New number: " + number3);
		
	}
	
	public void buse() {
		
		int number4 = ++number3;
		System.out.println(number4);
	}
	
	
	
	public void conditions() {
	
		int i = 8;
		int j = 10;
		
		if(i + j > 20) {
			System.out.println("i + j > 20");
		}else {
			System.out.println("i + j < 20");
		}
	
	}
	
	public void ternaryOperator() {
		
		int i = 8;
		int j = 10;
		boolean b;
		
		if( i + j > 20 ? true : false)
			System.out.println("with ternary: " + i + " + " + j + " > 20");
		else
			System.out.println("with ternary: " + i + " + " + j + " < 20");
	}


}
