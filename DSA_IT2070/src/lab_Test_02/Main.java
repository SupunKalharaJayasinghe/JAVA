package lab_Test_02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	Stack stack = new Stack(5);
	Queue queue = new Queue(5);
	
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<=4; i++) {
		System.out.print("Enter Item: ");
		char value = sc.next().charAt(0);
		queue.insert(value);
	}
	
	while(!queue.isEmpty()) {
		stack.push(queue.remove());
	}
	
	Queue queue1 = new Queue(5);
	
	while(!stack.isEmpty()) {
		queue1.insert(stack.pop());
	}
	
	while(!queue1.isEmpty()) {
		char items = queue1.remove();
		System.out.println("Item: "+items);
	}
	
	sc.close();
	}
}
