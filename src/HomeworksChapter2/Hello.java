package HomeworksChapter2;

public class Hello {

		// TODO Auto-generated method stub

		
		private String world = "guys"; 
		
		public String sayHi(String who) {
			
			String sentence;
			
			if (who != "")
				sentence = "Hello " + who + " :)";
			else
				sentence = "Hello " + world + " :)";
			
			return sentence;
			
		}    
	

}
