package lab_Test_02;

public class Queue {
	private int front;
	private int rear;
	private int maxSize;
	private char queueArray[];
	private int nItem;
	
	
	public Queue(int s) {
		front = 0;
		rear = -1;
		maxSize = s;
		queueArray = new char[maxSize];
		nItem = 0;
	}


	public void insert(char item) {
		if(rear == maxSize-1) {
			System.out.println("Queue is full");
		}
		else {
			queueArray[++rear] = item;
			nItem++;
		}
	}
	
	public char remove() {
		if(nItem == 0) {
			System.out.println("Queue is empty");
			return '\0';
		}
		else {
			nItem--;
			return queueArray[front++];
		}
			
		
	}
	
	public boolean isEmpty() {
		return nItem == 0;
	}
	
	public boolean isFull() {
		return nItem == maxSize;
	}
}