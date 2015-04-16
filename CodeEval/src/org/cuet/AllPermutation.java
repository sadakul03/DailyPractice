package org.cuet;

public class AllPermutation {
	
	public void swap(char a, char b){
		char temp = a;
		a = b;
		b = temp;
		
	}
	
	public void permute(char chArr[],int i, int n){
		
	}
	
	
	public static void main(String[] args) {
		AllPermutation ap = new AllPermutation();
		String inputStr = "123";
		ap.permute(inputStr.toCharArray(),0,inputStr.length());
	}
	

}
