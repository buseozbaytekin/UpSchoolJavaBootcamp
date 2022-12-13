package HomeworksChapter8.Calculator;

public class CalculatorApp {
	
	public int multiply (int first, int second) {
		return first * second;
	}
	
	public double mode (int first, int second) {
		double mode1 = first % second;
		return mode1;
	}
	
	
	
	
	public static void main(String[] args) {
		Calculator calculatorApp = new Calculator();
		
		int i = calculatorApp.multiply(20, 22);
		System.out.println(i);
		
		double m = calculatorApp.mode(6, 10);
		System.out.println(m);
		
		
	}

}
