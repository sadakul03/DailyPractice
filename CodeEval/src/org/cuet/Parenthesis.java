package org.cuet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;


public class Parenthesis {
	
	
	@SuppressWarnings("unchecked")
	public int findParenPos(String input, int pos){		
		int output = 0;
		
		@SuppressWarnings("rawtypes")
		Stack<Map> stack = new Stack<Map>();
		for(int i = 0; i < input.length(); i++){
			
			switch(input.charAt(i)){			
				case '(':
					Map map = new HashMap();
					map.put(i, input.charAt(i));
					stack.add(map);
					break;

				case ')':			
					Iterator it = stack.peek().keySet().iterator();
					int p = (Integer) it.next();
					if(p != 28)
						stack.pop();
					else{
						map = new HashMap();
						map.put(i, input.charAt(i));
						stack.add(map);
						break;
					}
					break;
					
				default:
					break;
			}
			
			
			
		}
		
		
		System.out.println("s: "+stack.toString());
		
		return output;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		final String input;
		final int pos;

		Parenthesis p = new Parenthesis();
		input = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
		pos = 28;//output 79
		p.findParenPos(input, pos);
		
	}
	
	//Sometimes (when I nest them (my parentheticals) too much (like this (and this)))	
	
	

}
