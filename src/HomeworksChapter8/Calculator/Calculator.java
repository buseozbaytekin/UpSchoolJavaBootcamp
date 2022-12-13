package HomeworksChapter8.Calculator;


public class Calculator {
	String name;

	

	public int add(int first, int second) {
		return first + second;
	}

	public int subtract(int first, int second) {
		return first - second;
	}

	public int multiply(int first, int second) {
		int sonuc =  first * second;
		return sonuc;
	}
	
	public double mode(int first, int second) {
		double sonuc = first % second;
		return sonuc;
	}


	public double divide(int first, int second) {
		return (double)first / second;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		
		int i = calculator.add(12, 27);
		System.out.println(i);
		
		double d = calculator.mode(5, 55);
		System.out.println(d);
		
		System.out.println(calculator.subtract(83, 56));
		System.out.println(calculator.multiply(8, 7));
	
		
		
//	
	}
}
