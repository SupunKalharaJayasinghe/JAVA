package lab_Test_01;


public class Queue {
	private int maxSize;
	private int front;
	private int rear;
	private char queueArray[];
	private int nItems;
	
	public Queue(int s) {
		
		maxSize = s;
		front = 0;
		rear = -1;
		queueArray = new char[maxSize];
		nItems = 0;
	}
	
	public void insert(char item) {
		if(nItems == maxSize) {
			System.out.println("Queue is full");
		}
		else {
			if(rear == maxSize-1) {
				rear = -1;
			}
			queueArray[++rear] = item;
		    nItems++;
		}
	}
	
	public char remove() {
		if(nItems == 0) {
			System.out.println("Queuse is empty");
			return '\0';
		}
		else {
			char temp = queueArray[front++];
			if(front == maxSize-1) {
				front = 0;
			}
			nItems--;
			return temp;
		}
	}
	public char peekFront() {
		if(nItems == 0) {
			System.out.println("Queuse is empty");
			return '\0';
		}
		else
			return queueArray[front];
	}
	
	public boolean isEmpty() {
		if(nItems == 0) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isFull() {
		if(nItems == maxSize) {
			return true;
		}
		else
			return false;
	}
}