package parkSystem;

public class Chemin extends Queue {

	public Chemin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chemin(int initialiazation) {
		super(initialiazation);
		// TODO Auto-generated constructor stub
	}
	/////////////////////////////////////////////////
	public boolean driveIn (Voiture car) {
		
		if (this.isFull()!=true) {
			this.enQueue(car);
			return true;
		}
		else {return false;}
		
	}
	///////////////DRIVE IN///////////////////
	public Voiture driveOut() {
		
		if (this.isEmpty()!=true) {return (Voiture) this.deQueue();}
		else {return new Voiture ("empty");}
		
	}
	//////////////////DRIVE OUT/////////////////////////////
	/*
	 * 
	 * WARNIGN:SEVERE LEAK  MUST BE FIXED
	 * 
	 * 
	 * 
	 */
	
	
	
	
	public Voiture driveOut(String chepai ) {
		Stack  <Voiture> tempo=new Stack<Voiture>(this.maxSize);
		if (this.isEmpty()) {return new Voiture ("empty chemin");}
		else {;}
		while (this.isEmpty()!=true) {
			if (this.peak().equals(chepai)) {
				Voiture rcv=(Voiture) this.deQueue();
				while (tempo.isEmpty()!=true) {
					
					this.enQueue(tempo.pop());
					
				}
				return rcv;
				
			}
			else {
				
				tempo.push((Voiture) this.deQueue());
				
				
			}
			
		}
		while (tempo.isEmpty()!=true) {
			
			this.enQueue(tempo.pop());
			
		}
		
		
		return new Voiture ("nomatch");
		
	}
	
	/*
	 * 
	 * WARNIGN:SEVERE LEAK  MUST BE FIXED
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	///////////////////NOT IN USE NOW//////////////////////////
	
	public int count(){
		Queue  <Voiture> tempo=new Queue<Voiture>(this.maxSize);
		int counter=0;
		if (this.isEmpty()) {return 0;}
		else {;}
		while(this.isEmpty()!=true) {
			
			tempo.enQueue(this.driveOut());
			counter++;
			
		}
		while (tempo.isEmpty()!=true) {
			
			this.enQueue(tempo.deQueue());
			
		}
		
		return counter;
	}
	
	public int count (String chepai) {
		int count=0;
		if (this.isEmpty()) {return -1;}
		Stack  <Voiture> tempo=new Stack<Voiture>(this.maxSize);
		while (this.isEmpty()!=true) {
			Voiture tmp=this.driveOut();
			tempo.push(tmp);
			if (tmp.getPlate().equalsIgnoreCase(chepai)) {
				while(tempo.isEmpty()!=true) {this.enQueue(tempo.pop());}
				
				return count;
			}
			else {
				
				count++;
			}
		}
		
		
		while(tempo.isEmpty()!=true) {this.enQueue(tempo.pop());}
		
		
		return -2;
	}
	/////////////-1 means empty,-2 means no math, others indicates how many cars are in front of the appointed one////////////////////
	
}
