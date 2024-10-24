package day2.ex2;

public class OverEx {
	public static void main(String[] args) {
		//bind : 관계 형성,어떤 객체가 특정 멤버를 호출 시 대상을 지정하는게 바인드라고 한다
		
		//정적 바인드: 컴파일 시 지정
		//동적 바인드: (실행전까지 모른다)런타임 시 지정
		
		A obj = new B();
		System.out.println(obj.i);//정적 바인드
		obj.m();// 동적 바인드
		System.out.println(obj.si);
		obj.sm();
		
	}

}
class A{
	static int si=1;
	int i=2;
	static void sm() {
		System.out.println("A.sm();");
	}
	void m() {
		System.out.println("A.m()");
	}
}
class B extends A{
	static int si=3;
	int i=4;
	static void sm() {
		System.out.println("B.sm();");
	}
	void m() {
		System.out.println("B.m()");
	}
}
	
