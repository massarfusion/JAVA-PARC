package parkSystem;

public class Voiture {
	String plate;
	double startTime;//the moment it goes into the park
	double endTime;//the moment it drives out.
	double price;
	Voiture(String chepai){
		this.plate=chepai;
		endTime=0;
		startTime=0;
		price=0;
	}
	public String getPlate() {
		return plate;
	}
	public double getStartTime() {
		return startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	public boolean equal (String another) {
		if ((this.plate).equals(another)){return true;}
		
		else
		{return false;}
	}
	public boolean equal (Voiture another) {
		if ((this.plate).equals(another.getPlate())){return true;}
		
		else
		{return false;}
	}
	
}
