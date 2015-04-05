package com.codeeval;

public class LargestPrimePalindrome {
	private boolean isPrime = false;
	private boolean isPalin = true;
	public LargestPrimePalindrome(){
		
	}
	
	public boolean isPrime(int n){
		isPrime = true;
		int m = (int) Math.sqrt(n);
		for(int i=2; i <= m; i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}		
		return isPrime;
	}
	
	public boolean isPalindrome(String input){
		isPalin = true;		
		for(int i = 0, j = input.length() - 1; i <= j;){			
			
			/*if(!Character.isLetter(input.charAt(i))){
				++i;
			}				
			
			if(!Character.isLetter(input.charAt(j))){
				--j;
			}*/									
			
			if(Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))){
				isPalin = false;
				break;
			}
			
			++i;
			--j;
		}		
		return isPalin;
		
	}
	
	public void checkingPrimeandPalindrome(int input){
		
		/*if(input < 1){
			System.out.println(input+": not satisfied");
			System.exit(0);
		}*/
			
		for(int i = input; i > 1; i--){
			if(isPrime(i)){
				if(isPalindrome(String.valueOf(i))){
					System.out.println(i);
					break;
				}
			}
		}
	}	
}
