package parkSystem;

public class Queue<T> {
	 int maxSize;
	 T[] data ;
	 int front ;
	 int rear;
	
	 
	 
	 
	Queue() {
		super();
		this.maxSize = 100;
		this.data = (T[])new Object[100];
		this.front = 0;
		this.rear = 0;
	}

	Queue(int initialisation){
		if (initialisation>=0) {
			this.maxSize=initialisation;
			data=(T[])new Object[maxSize];
			front=0;
			rear=0;
			
		}
		else {
			
			throw new RuntimeException("Do not initialize using numbers below zero");
			
		}
	}//initialise a new queue
	
	public boolean isEmpty() {
		if (front==rear) {return true;}
		else {;}
		return false;
		
		
	}//whether empty
	
	public boolean isFull() {
		
		if ((rear+1)%maxSize==front) {return true;}
		else {return false;}
	}//whether full
	
	public boolean enQueue(T item) {
		if ((rear+1)%maxSize==front) {
			return false;
		}
		else {
			data[rear]=item;
			rear=(rear+1)%maxSize;
			return true;
		}
		
	}//insert a new item into the queue
	
	public T deQueue() {
		
		if (rear==front) {return null;}
		else {
			T temp=data[front];
			
			front=(front+1)%maxSize;
			return temp;
		}
		
		
	}// pump out the head item
	
	public T peak() {
		
		if (this.isEmpty()!=true) {return this.data[front];}
		else {return null;}
		
	}
	
}
