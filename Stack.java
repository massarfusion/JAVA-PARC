package parkSystem;

public class Stack <T> {
	 int maxSize;
	 T[] data ;
	 int top ;
	
	Stack(){
		
		this.maxSize=10;
		
	}//Default setup
	
	Stack(int initialiazation){
		if (initialiazation>=0) {
			this.maxSize=initialiazation;
			data=(T[])new Object[maxSize];
			top=-1;
		}
		else {
			
			throw new RuntimeException("Do not initialize using numbers below zero");
			
		}
		
		
	}//Initialization
	
	public boolean isEmpty() {
		if (top==-1) {return true;}
		else{return false;}
	}//whether empty
	
	public boolean isFull() {
		if (top==maxSize-1) {return true;}
		else{return false;}
		
	}//whether full
	
	public boolean push(T value) {
		if (top==maxSize-1) {return false;}
		else {;}
		top++;
		data[top]=value;
		return true;
	}// push in a new value
	
	public T[] getData() {
		return data;
	}

	

	public T pop() {
		if (top==-1) {return null;}
		else {;}
		T temp=data[top];
		data[top]=null;
		top--;
		return temp;
		
	}// pop off the item on the top
	
	public T peak() {
		
		if (this.isEmpty()!=true) {
			return this.data[top];
		}
		else {return null;}
	}
	
	
}
