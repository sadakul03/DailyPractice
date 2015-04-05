
public class PrimeNumber {
	
	/* Prime number is a number which is divisible by exactly two different
	 * natural number 1 and itself only. natural number means 1,2,3....n
	 * 
	 * 1 is not prime because 1 is divided by itself and 1 but this is not
	 * satisfying prime number characteristics since for prime no. should be divisible
	 * by exactly 2  distinct numbers 1 and itself but here both number are same
	 * 
	 * 2 is only even prime number and it divides itself(2) and 1
	 */
	
	
	//Procedure 1: beginner step
	//since any number(n) is divisible by itself and 1, so we can run loop 2 to n-1
	//since 1 is not prime we can start loop from 2
	public void primeCompute1(int n){
		boolean flag = false;
		for(int i=2; i < n; i++){
			if(n%i == 0){
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(n+" is prime");
		else{
			System.out.println(n+ " is not prime");
		}
	}
	
	//Procedure 2: more faster
	//we do not continue loop until 2 to n-1. we can check upto n/2. since if
	//a number is divisible from 2 to n-1 it should be divisible by n/2
	
	public void primeCompute2(int n){
		boolean flag = false;
		int m = n/2;
		for(int i=2; i <= m; i++){
			if(n%i == 0){
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(n+" is prime");
		else{
			System.out.println(n+ " is not prime");
		}		
	}

	//Procedure 3: Advanced
	//It is found that we can use square root function. since square root is the 
	//middle of a number	
	public void primeCompute3(int n){
		boolean flag = false;
		int m = (int) Math.sqrt(n);
		for(int i=2; i <= m; i++){
			if(n%i == 0){
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println(n+" is prime");
		else{
			System.out.println(n+ " is not prime");
		}		
		
	}

	
	
	public static void main(String[] args) {
		PrimeNumber n1 = new PrimeNumber();
		long start, end;
		int primeNumber = 2147483647;
		
		start = System.currentTimeMillis();
		n1.primeCompute1(primeNumber);
		end = System.currentTimeMillis();
		System.out.println("Time taken by method1: "+(end-start)+"ms");
		
		start = System.currentTimeMillis();
		n1.primeCompute2(primeNumber);
		end = System.currentTimeMillis();
		System.out.println("Time taken by method2: "+(end-start)+"ms");

		start = System.currentTimeMillis();
		n1.primeCompute3(primeNumber);
		end = System.currentTimeMillis();
		System.out.println("Time taken by method3: "+(end-start)+"ms");
		
	}
	
	

}