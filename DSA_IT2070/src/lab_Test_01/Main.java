package lab_Test_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Stack stack1 = new Stack(5);
		Queue queue1 = new Queue(10);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter five values ");
		for(int i=0; i<=4; i++) {
			char value = sc.next().charAt(0);
			queue1.insert(value);
		}
		
		while(!queue1.isEmpty()) {
			stack1.push(queue1.remove());
		}
		
		//Before 
		while(!stack1.isEmpty()) {
			queue1.insert(stack1.pop());
		}
		

		Queue tempq = new Queue(10);
		
		while(!queue1.isEmpty()) {
			char c = queue1.remove();
			tempq.insert(c);
			stack1.push(c);
		}
		
		while(!stack1.isEmpty()) {
			tempq.insert(stack1.pop());
		}
		System.out.println();
		System.out.println("Final queue");
		
		while(!tempq.isEmpty()) {
			char valnew = tempq.remove();
			System.out.print(valnew);
			System.out.print(" ");
		}
		
	}

}