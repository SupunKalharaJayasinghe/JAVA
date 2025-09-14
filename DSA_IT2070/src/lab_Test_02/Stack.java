package lab_Test_02;

public class Stack {
	private int maxSize;
	private int top;
	private char[] stackArray;
	
	public Stack(int s) {

		maxSize = s;
		top = -1;
		stackArray = new char[maxSize];
	}
	
	public void push(char item) {
		if(top == maxSize-1) {
			System.out.println("Array is full");
		}
		else
			stackArray[++top]=item;
	}
	
	public char pop() {
		if(top == -1) {
			System.out.println("Array is empty");
			return '\0';
		}
		else
			return stackArray[top--];
	}
	public char peek() {
		if(top == -1) {
			System.out.println("Array is empty");
			return '\0';
		}
		else
			return stackArray[top];
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else 
			return false;
	}
	public boolean isFul() {
		if(top == maxSize-1) {
			return true;
		}
		else 
			return false;
	}
}