package Interview;

public class Combination {
	
	private String input;
	StringBuffer out;
	
	public Combination(String input){
		this.input = input;
		out = new StringBuffer();
		combine(0);
	}

	public void combine(int start){
		
		for(int i = start ; i < input.length() ; i++){
		
			out.append(input.charAt(i));
			System.out.println(out);
			combine(i+1);
			out.setLength(out.length()-1);
			
		}
		
	}
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	
	public static void main(String[] args){

		String input = "ABCD";
		Combination combinatioin = new Combination(input);
		
	}
}
