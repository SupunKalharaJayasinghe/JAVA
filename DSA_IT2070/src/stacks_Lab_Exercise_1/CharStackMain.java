package stacks_Lab_Exercise_1;

import java.util.*;

public class CharStackMain {

	public static boolean isBalanced(String expr) {
			
			CharStack stack = new CharStack(expr.length());
			
			for(int i = 0; i < expr.length(); i++) {
				
				char ch = expr.charAt(i);
				
				if(ch == '(') {
					stack.push(ch);
				}
				else if(ch == ')') {
					if(stack.isEmpty()) {
						return false;
					}
					stack.pop();
				}
			}
			return stack.isEmpty();
		}
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an expression: ");
		String expr = scanner.nextLine();
		
		if(isBalanced(expr)) {
			System.out.println("Expression is VALID.");
		}
		else {
			System.out.println("Expression is not VALID.");
		}
		
		scanner.close();
	}
}
