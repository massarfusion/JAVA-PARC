package parkSystem;

public class Voiture {
	String plate;
	double startTime;//the moment it goes into the park
	double endTime;//the moment it drives out.
	Voiture(String chepai){
		this.plate=chepai;
		endTime=0;
		startTime=0;
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
