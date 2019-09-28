package parkSystem;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Parc park=new Parc(3);
		Chemin rd=new Chemin(114514);
		
		System.out.println("3 places for the park and 114514 places for chemin,feel free to fulfill the smelly chemin"+"\n");
		
		double price=10;
		
		System.out.println("a or A means arrive;enter plate and press the ENTER bottom;then enter the time of arrivement,enter plate and press the ENTER bottom"
				+"\n"+ "d or D means departure;enter plate and press the ENTER bottom;then enter the time of arrivement,enter plate and press the ENTER bottom"
				+"\n"+"P or p is for consulting the number of cars parked inside the park"+"\n"
				+"W or w is for consulting the number of cars parked inside the chemin"+"\n"
				+"E or e is for consulting the number of cars parked inside the park"+"\n"+
				"P AND W AND E NEED NO PARAMETER,JUST PUT IN AND PRESS THE ENTER BOTTOM");/////////////here to complete////////////
		
		////////////////loop
		while (true) {
		String instruction=in.next();
	    if (instruction.equalsIgnoreCase("P")) {
			
			System.out.println(park.accountNum());
			continue;
		}
		
		else if (instruction.equalsIgnoreCase("W")) {
			System.out.println(rd.count());
			continue;
		}
		
		else if  (instruction.equalsIgnoreCase("E")) {
			System.out.println("instruction received, this program is to be terminated SOON");
			System.exit(0);
		
		
		}
		else {;}
		String plate=in.next();
		double time=in.nextDouble();
			
			
			
			
		if (instruction.equalsIgnoreCase("A")) {
			Voiture tmpo=new Voiture(plate);
			tmpo.setStartTime(time);
			if (park.isFull()) {
				int cnt=rd.count();
				
				rd.driveIn(tmpo);
				System.out.println("Into the chemin");
				
				System.out.println(cnt+" cars waiting ahead in chemin and you are the "+(cnt+1)+" one");
				continue;
			}
			
			else {
				int cnt=park.accountNum();
				park.leadIn(tmpo);
				System.out.println("Into the park");
				System.out.println(cnt+" cars in the park before this car and this is the "+(cnt+1)+" one");
				continue;
			}
			
		}
		else if (instruction.equalsIgnoreCase("D")) {
			if (park.isEmpty()) {System.out.println("Empty park!");continue;}
			else {
				Voiture tmp_D=park.leadOut(plate);
				if (tmp_D.equal("nomatch")) {
					System.out.println("No such car");
					
					continue;
				}
				else {;}
				tmp_D.setEndTime(time);
				
				if (tmp_D.getEndTime()-tmp_D.getStartTime()<0) {
					System.out.println("We don't accept cars that can conduct time travelling"
							+ "\n"+"By the way, this car has gone nowhere and we cannot find it");
					continue;
				}
				else {;}	
					
					
					
				if (rd.isEmpty()!=true) {
					park.leadIn(rd.driveOut());
					
					System.out.println("Plate:"+tmp_D.getPlate()+" has driven out and a car from chemin head drove in");
				}
				else {
					System.out.println("Plate:"+tmp_D.getPlate()+" has driven out and no car from chemin head drove in");}
				
					System.out.println(price*(tmp_D.getEndTime()-tmp_D.getStartTime())+" bucks is all you have to pay");
			}
			
			
		}
		
		else {
			
			System.out.println("Invalid instruction return to the top");
			
			
		}
			
			
		
		
		
		
		}////////loop
	}

}
