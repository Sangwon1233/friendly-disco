package lesson09_interface.starcraft;

public class StarcraftMain {
	public static void main(String[] args) {
		SCV scv = new SCV();
		Marine marine = new Marine();
//		scv.repair(marine);
		
		Tank tank =new Tank();
		tank.toggleSige();
		
		scv.repair(tank);
		
		Repairable r= new Tank();
		Repairable r2= new SCV();
		
		Unit[] units = new Unit[12];//한 부대
		
		
		
	}

}