//package student;
//
//public class StudentTest {
//	public static void main(String[] args) {
////		Student s1 = new Student(1,"새똥이",90,80,90);
////		//복제의 방법
////		//1.clone override
////		// -접근제어,타입 ,예외, cloneabla 인터페이스
////		//2.생성자를 통한 복제
////		System.out.println(s1);
////		
////			Student s2 =s1.clone();
////			s1.setName("개똥이");
////			System.out.println(s1);
////			System.out.println(s2);
////			
////			Student s4 = new Student(s1);
////			Student s5=s1;
////			
////		System.out.println (s1==s5);
////		System.out.println (s1.equals(s5)); //이퀄스의 존재목적은 오버라이드
////		
////		
////		System.out.println (s1==s4);
////		System.out.println (s1.equals(s4));//true
//		int i =StudentUtils.next("숫자",Integer.class,t -> t < 0 , "0보다 큰값");
//		System.out.println(i);
//	
//	}
//
//}

package student;

public class StudentTest {
	public static void main(String[] args) {
//		StudentUtils.next("이름", String.class, new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				// TODO Auto-generated method stub
//				return t.matches("^[가-힣]{2,4}");
//			}
//			
//		}, "한글로 2~4글자로 입력하세요");
//		StudentUtils.next("이름", String.class,t -> t.matches("^[가-힣]{2,4}"), "한글로 2~4글자로 입력하세요");
		int i = StudentUtils.next("숫자", Integer.class,t -> t < 0 , "0보다 큰값");
		System.out.println(i);
	}
}