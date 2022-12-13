package Chapter8.SayHi;



public class SayHiTest {

	public static void main(String[] args) {
		SayHi english = (String who) -> System.out.println("Hi " + who);
		sayHi(english, "Buse");
		
		SayHi turkish = (String who) -> System.out.println("Selam " + who);

		
		SayHi italian = (String who) -> System.out.println("Ciao " + who);

	}

	private static void sayHi(SayHi sayHi, String string) {
		
		
	}

}
