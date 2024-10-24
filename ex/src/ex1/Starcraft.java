package ex1;

public class Starcraft {
	static Marine m1=new Marine();
	static Marine m2=new Marine();
	static Marine m3=new Marine();
	static Zealot zealot=new Zealot();
	static Marine[] marines= {m1,m2,m3};   
	
	public static void main(String[] args) {
	
	while(true) {
		zealoHit(Marine.attack);
		zealoHit(Marine.attack);
		zealoHit(Marine.attack);
		
		marineHit(zealot.attack);
		
		showLog();
		if(m1.hp<0) {	
			zealoHit(Marine.attack);
			zealoHit(Marine.attack);
			zealoHit(Marine.attack);
			
			marineHit(zealot.attack);
			
			showLog();
		}
		else if(m2.hp<0) {
			zealoHit(Marine.attack);
			zealoHit(Marine.attack);
			zealoHit(Marine.attack);
			
			marineHit(zealot.attack);
			
			showLog();
		}
		else if(m3.hp<0||zealot.hp<0) {
			zealoHit(Marine.attack);
			zealoHit(Marine.attack);
			zealoHit(Marine.attack);
			
			marineHit(zealot.attack);
			
			showLog();
			break;
		}
	}
//	showLog();
//	
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	
//	marineHit(zealot.attack);
//	
//	showLog();
//	
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	
//	marineHit(zealot.attack);
//	
//	showLog();
//	
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	
//	marineHit(zealot.attack);
//	
//	showLog();
//	
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	zealoHit(Marine.attack);
//	
//	marineHit(zealot.attack);
//	
//	showLog();
	
//	marineHit//마린떄리기
//	remainHp//남은체력
//	zealotHit//질럿떄리기
//	damage// 데미지
		
	}
	static void marineHit(int damage){//마린떄리기
		Marine m =null; //m이 널값이면
		for(int i=0; i<marines.length;i++) { //마린의 길이만큼 반복			
			if(marines[i] != null) { //마린 i가 널이 아니면
				m = marines[i]; //마린i가 m이되고
				break; //멈추면서 빠져나간다
				
			}
		}
		if(m==null) { //m이 널이면
			System.out.println("모든 마린 사망");
			System.exit(0); //강제종료
		}
		int remainHp=m.hp-damage;
		if(remainHp<0) {
			m.hp=0;
			
		}
		else {
			m.hp=remainHp;
		}
	
	}
		static void showLog(){//전투
			System.out.println(zealot);
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);	
		}
		
		static void zealoHit(int damage) {
			int remainShield=zealot.Shield-damage;
			if(remainShield<0) {
				zealot.hp+=remainShield;
			
			}
			else {
				zealot.Shield=remainShield;
			}
		}

}
