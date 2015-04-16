package generics;

public class SimpleGenerics {
	
	public void print(E[] iObj){
		for(Integer i : iObj){
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		SimpleGenerics sg = new SimpleGenerics();
		Integer iObj [] = new Integer[10];
		
		for(int i=0; i < iObj.length; i++)
			iObj[i] = i;
		
		sg.print(iObj);
	}

}
