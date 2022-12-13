package HomeworksChapter6.Stack;

public class Stack {
	
	public static final int MAX_STACK_SIZE = 5;
	boolean full = false;
	boolean empty = true;
	
	String[] array = new String[MAX_STACK_SIZE];
	int pointer = 0;
	
	public boolean push(String newElement) {
		if(!full) {
			array[pointer] = newElement;
			pointer++;
			if(pointer == MAX_STACK_SIZE)
				full = true;
			return true;
		}
		else
			return false;
		
	}
	
	
	
	public String pop() {
		String lastItem = null;
		lastItem = array[pointer - 1];
		pointer--;
		if(pointer != MAX_STACK_SIZE)
			full = false;
		return lastItem;
		
	}
	
	
	
	public void clear() {
		
	}
	
	
	public boolean isEmpty() {
		return full;
		
	}
	
	
	
	public boolean isFull() {
		return empty;
		
	}
	
	
	
	public int size() {
		return 0;
		
	}
	
	
	
	public int getCapacity() {
		return MAX_STACK_SIZE;
	}
	
	
	
	public void showElements() {
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
