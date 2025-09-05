package stacks_Lab_Exercise_1;

public class MainClass {

	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		stack.push('A');
		stack.push('B');
		stack.push('C');
		stack.push('D');
		stack.push('E');
		
		System.out.println("Removing item from stack");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println("\nObservation:");
        System.out.println("Elements inserted in order: A, B, C, D, E");
        System.out.println("Elements removed in order: E, D, C, B, A");
        System.out.println("=> This shows that Stack follows LIFO (Last In First Out).");
	}
}
