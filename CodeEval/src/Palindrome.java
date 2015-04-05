public class Palindrome {
	
	private boolean isPalin;
	
	public boolean isPalindrome(String input){		
		isPalin = true;		
		for(int i = 0, j = input.length() - 1; i <= j;){			
			
			if(!Character.isLetter(input.charAt(i))){
				++i;
			}				
			
			if(!Character.isLetter(input.charAt(j))){
				--j;
			}									
			
			if(Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))){
				isPalin = false;
				break;
			}
			
			++i;
			--j;
		}		
		return isPalin;
	}
	
	public static void main(String[] args){
		Palindrome p = new Palindrome();
		String inputArr[] = {"ab","m adamimada M","!m adamimada M#"};
		for(String str : inputArr){
			System.out.println(p.isPalindrome(str)+" : "+str);
		}
	}
}