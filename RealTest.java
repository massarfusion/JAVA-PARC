package parkSystem;


public class RealTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parc parkone=new Parc (100);
		System.out.println(parkone.search("114514"));
		Voiture voi1=new Voiture("NYC114514");
		parkone.leadIn(voi1);
		Voiture voi2=new Voiture("NYC1919");
		parkone.leadIn(voi2);
		Voiture voi3=new Voiture("NYC810");
		parkone.leadIn(voi3);
		
		System.out.println(parkone.search("NYC114514"));
		parkone.leadOut();
				
				
//		System.out.println(parkone.accountNum());
//		System.out.println(parkone.leadOut("NYC1919").plate);
//		Parc parktwo=new Parc (0);
//		
//		Chemin rd1=new Chemin(100);
//		Voiture voi4=new Voiture("NYC893");
//		System.out.println(rd1.count(null));
//		//rd1 is still empty by now
//		rd1.driveIn(voi4);
//		System.out.println(rd1.count(null));
//		System.out.println(rd1.count(voi4.getPlate()));
		
	}

}
