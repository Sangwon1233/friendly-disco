package ex2;

import java.util.Arrays;

public class ClassInfo {
	public static void main(String[] args) {
		
	
	//클래스:인스턴스를 만들기위한 설계도
	//변수,메서드
	//변수의 종류
	
	//1.클래스 변수
	//2.인스턴스 변수
	//3. 지역 변수(매개변수)

	
	
	// 시 분 초
	Time t1 =new Time();
//	t1.hour=3;
	t1.setHour(10);//호출
	t1.minute=11;
	t1.second=33.3333f;
	
	 System.out.println(t1.getHour());
	 
	 Time[] times =new Time[3];
	 times[0]=t1;
	 times[1]=new Time();
	 times[2]=new Time();
	 
	 System.out.println(Arrays.toString(times));
	 // DB 제약조건
	 //유일성 보장 :unique
	 //빈값 없음: not null
	 //범위 : check
	 //PRIMARY 키 = 유일성,빈값 없음
	 
	 
	 
	 //두점 사이의 거리 구하기
	 //(1,3) (5,8)
	 System.out.println(Math.sqrt(41));//제곱근 확인하기
	}
}
// 구조체의 목적
class Time{
	private int hour;
	//필드에 접근 하는 방법을 제공
	//지정 set
	//조회 get
	public void setHour(int h) {
//		if(h >= 0 && h< 24)
			
		if(h<0||h>23) {
			return;
		}
		hour = h;
	}
	public int getHour() {
		return hour;
	}
	
	public int[] get() {
		return new int[] {1,2,3,4,5,6,3,1,5,8};
	}
	
	
//	public int getMinute() {
//		return minute;
//	}
//	public void setMinute(int minute) {
//		this.minute = minute;
//	}
//	public float getSecond() {
//		return second;
//	}
//	public void setSecond(float second) {
//		this.second = second;
//	}


	int minute;
	float second;
	@Override
	public String toString() {
		return "time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
	
}
