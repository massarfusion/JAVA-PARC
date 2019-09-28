package parkSystem;

public class Parc extends Stack {
	private double feeRate;
	
	public double getFeeRate() {
		return feeRate;
	}
	public void setFeeRate(double feeRate) {
		this.feeRate = feeRate;
	}
	
	
	public Parc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parc(int initialiazation) {
		super(initialiazation);
		// TODO Auto-generated constructor stub
	}
	
	
//	public int search(String chepai) {
//		
////		Stack  <Voiture> tempo=new Stack<Voiture>(this.maxSize);
////		int count=0;
////		int final_count=114514810;
////		while (this.isEmpty()!=true) {
////			if (  ((Voiture) this.peak()) .equal(chepai)) {final_count=count;break;}
////			else {tempo.push((Voiture) this.pop());count++;}//You might want to check here, one cast was done
////		
////		}
////		while (tempo.isEmpty()!=true) {
////			
////			this.push(tempo.pop());
////			
////		}
////		if (this.isEmpty()) {return -2;}
////		else if   (count==this.maxSize&&count!=final_count) {return -1;}
////		else {return final_count;}
//		
//		Stack  <Voiture> tempo=new Stack<Voiture>(this.maxSize);
//		if (this.isEmpty()) {return -2;}
//		while (this.isEmpty()!=true) {
//			if (  ((Voiture) this.peak()) .equal(chepai)) {
//				Voiture rcv=(Voiture) this.pop();
//				while (tempo.isEmpty()!=true) {
//					
//					this.push(tempo.pop());
//					
//				}
//				return rcv;
//				
//			}
//			else {tempo.push((Voiture) this.pop());}//You might want to check here, one cast was done
//		
//		}
//		
//		
//		
//	}//carry out a search for the targeted plate number,0 means at the exit of the park
//	
	public boolean leadIn(Voiture car) {
		if (this.isFull()==true) {return false;}
		else {;}
		this.push(car);
//		car.setStartTime(System.currentTimeMillis());
		
		return true;
	}//park-in a automobile
	public Voiture leadOut() {
		
		Voiture temp = null;
		temp=(Voiture)this.pop();
//		double currentTime=System.currentTimeMillis();
//		double period=(currentTime-temp.startTime)/1000;
//		temp.setStartTime(0.0);
//		System.out.println(period);
		/*
		 * temporarily banned
		 * 
		 * 
		 */
		return temp;
		
		
	}//drive out(  THE TIME IS NOT USED NOW, STORED DANS LE FORMAT DU SECONDE   )
	
	
	public Voiture leadOut(String chepai) {
		Stack  <Voiture> tempo=new Stack<Voiture>(this.maxSize);
		if (this.isEmpty()) {return new Voiture("nocar");}
		while (this.isEmpty()!=true) {
			if (  ((Voiture) this.peak()) .equal(chepai)) {
				Voiture rcv=(Voiture) this.pop();
				while (tempo.isEmpty()!=true) {
					
					this.push(tempo.pop());
					
				}
				return rcv;
				
			}
			else {tempo.push((Voiture) this.pop());}//You might want to check here, one cast was done
		
		}
//		while (tempo.isEmpty()!=true) {
//			
//			this.push(tempo.pop());
//			
//		}
//		
		while (tempo.isEmpty()!=true) {
			
			this.push(tempo.pop());
			
		}
		
		
		return new Voiture ("nomatch");
		
		
	}
	
	public int accountNum() {
		Stack  <Voiture> tempo=new Stack<Voiture>(this.maxSize);
		if (this.isEmpty()) {return 0;}
		else {;}
		int account=0;
		while (this.isEmpty()!=true) {
			
			tempo.push( this.leadOut());
			account++;
			
		}
		while (tempo.isEmpty()!=true) {
			
			this.push(tempo.pop());
			
		}
		
		return account;
	}
	
	public int search(String chepai) {
		Stack  <Voiture> tempo=new Stack<Voiture>(this.maxSize);
		int totalNumber=0;
		if (this.isEmpty()) {return -1;}
		else {;}
		while (this.isEmpty()!=true) {
			Voiture tmp=this.leadOut();
			tempo.push(tmp);
			//////////////////////
			if (tmp.equal(chepai)){
				while (tempo.isEmpty()!=true) {
					
					this.push(tempo.pop());
					
				}
				return totalNumber;
			}
			else {
				totalNumber++;
				
				
			}
		}
		
		return -2;
	}
	//////////-1 means empty park, -2 means no match , others indicates the number of cars parked in front of itself//////
}
