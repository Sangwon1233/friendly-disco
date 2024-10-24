package ex1;

public class Zealot {
	 // 정보 >> 변수

    // 클래스
    // 공격력, 방어력, 최대 체력, 가격
	static int attack=16;
	static int defence;
	static int maxHp=100;
	static int maxShield=60;
	static int mineral=100;
	
    // 인스턴스
    // 킬수, 현재 체력, 좌표
	int kill;
	int hp=maxHp;
	int Shield=maxShield;
	int x,y;
	@Override
	public String toString() { 
		return String.format("Zealot [defence=%s,attack=%s,kill=%s, hp=%s, Shield=%s, x=%s, y=%s]",defence,attack, kill, hp, Shield, x, y);
	}
	
	
	
}
