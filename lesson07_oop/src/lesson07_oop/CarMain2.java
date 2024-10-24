package lesson07_oop;

public class CarMain2 {
	public static void main(String[] args) {
		//Car 타입의 배열객체 생성
		
		Car[] cars =new Car[3];//null로 만들고 주소를 만들고 cars에 주소 알려주는것을 이 줄에서 함
		
		//car 객체 생성
		Car tico = new Car();
		
		tico.color= "화이트";
		tico.company= "대우";
		tico.type= "경차";
		
		//모든 인덱스에 tico 객체 저장
		for(int i=0;i<cars.length;i++) {
			System.out.println(i);
			cars[i] = tico;
		}
		System.out.println("0번 인덱스 color : " +cars[0].color);
		System.out.println("2번 인덱스 color : " +cars[2].color);
		cars[0].color="블랙"; //0번 인덱스 객체의 color 필드에 "블랙" 대입
		System.out.println("0번 인덱스 color : " +cars[0].color);
		System.out.println("2번 인덱스 color : " +cars[2].color);
	}
}