package Interview;

public class Permutation {
	
	
	private boolean[] used;
	StringBuffer permuteStr;
	
	public Permutation(String input){
		used = new boolean[input.length()];
		permuteStr = new StringBuffer();
		permute(input);
	}
	
	public void permute(String input){
		
		if(permuteStr.length() == input.length()){
			System.out.println(permuteStr);
			return;
		}
		
		for(int i = 0 ; i < input.length() ; i ++){
		
			if(!used[i]){
				permuteStr.append(input.charAt(i));
				used[i] = true;
				permute(input);
			}else{
				continue;
			}
			
			permuteStr.setLength(permuteStr.length() - 1);
			used[i] = false;
			
			
		}
		
	}

	public boolean[] getUsed() {
		return used;
	}

	public void setUsed(boolean[] used) {
		this.used = used;
	}

	public static void main(String[] args) {

		String input = "ABC";
		Permutation permute = new Permutation(input);
		
	}

}
