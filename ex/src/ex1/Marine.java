package ex1;

public class Marine {
	 // 클래스
    // 공격력, 방어력, 최대 체력, 가격
	static int attack=6;
	static int defence;
	static int maxHp=40;
	static int mineral=50;
	
	   // 인스턴스
    // 킬수, 현재 체력, 좌표
	
	int kill;
	int hp =maxHp;
	int x,y;


	public String toString() {
		return String.format("Marine [attack=%s,defence=%s,kill=%s, hp=%s, x=%s, y=%s]",attack,defence, kill, hp, x, y);
	}
	
	
}
