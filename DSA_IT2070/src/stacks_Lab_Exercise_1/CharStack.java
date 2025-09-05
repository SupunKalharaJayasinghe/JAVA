package stacks_Lab_Exercise_1;

public class CharStack {
	
	private char[] charArray;
	private int top;
	private int maxSize;
	
	public CharStack(int size) {
		this.charArray = new char[size];
		this.top = -1;
		this.maxSize = size;
	}
	
	public void push(char item) {
		if(isFull()) {
			System.out.println("Stack is full. Cannot push "+item);
			return;
		}
		charArray[++top] = item;
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return '\0';
		}
		return charArray[top--];
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '\0';
		}
		return charArray[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public int size () {
		return top + 1;
	}
}
