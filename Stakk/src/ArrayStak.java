//Lektion 1

public class ArrayStak implements Stak {
	
	private String[] stack;
	private final int MAXELEMENTS = 5;
	
	public ArrayStak() {
		
		stack = new String[0];
		
	}

	public void push(String e) {

		if (full()) {
			System.out.println("The stack is full.");
		} else {

			int size = stack.length + 1;

			String[] temp = new String[size];

			for (int i = 0; i < stack.length; i++) {
				temp[i] = stack[i];
			}

			temp[size - 1] = e;
			stack = temp;
			temp = null;
		}
	}
	
	public String pop() {
		if(empty()) {
			return "The stack is empty.";
		}
		else {
		int size = stack.length - 1;
		String[] temp = new String[size];
		String popRetur = stack[size];

		for (int i = 0; i < size; i++) {
			temp[i] = stack[i];
		}

		stack = temp;
		temp = null;

		return popRetur;
		}

	}
    
    public boolean empty() {
    	
    	return stack.length == 0;
    
    }
    
    public boolean full() {
    	
    	return stack.length == MAXELEMENTS;
    	
    }
    
    public void show() {
    	String display = "";
    	
    	for(int i = stack.length-1; i >= 0; i--) {
    		display += stack[i] + " ";
    	}
    	
    	System.out.println(display);
    }

}
