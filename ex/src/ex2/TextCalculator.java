package ex2;

import java.util.Scanner;

public class TextCalculator {
	public static void main(String[] args) {
				//switch
				//숫자 두개, 부호도 입력
				//반환된 값을 여기서 출력
		Cals c1 =new Cals();
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		double x =Double.parseDouble(input.nextLine());
		System.out.println("두번째 숫자를 입력해주세요");
		double y =Double.parseDouble(input.nextLine());
		System.out.println("수식을 입력하세요 + , - , * , / , %");
		String operator=input.nextLine();

		switch (operator) {
		case "+":
			System.err.println(c1.add(x, y));
			break;
		case "-":
			System.out.println(c1.sub(x, y));
			break;
		case "*":
			System.out.println(c1.mul(x, y));
			break;
		case "/" :
			System.out.println(c1.div(x, y));
			break;
		case "%" :
			System.out.println(c1.mod(x, y));
		}
		
	}
	
	
		
}
class Cals{
	double add(double x , double y){
		return x+y;
	}
	double sub(double x, double y) {
		return x-y;
	}
	double mul(double x, double y) {
		return x*y;
	}
	double div(double x, double y) {
		return x/y;
	}
	double mod(double x, double y) {
		return x%y;
	}
}
//메서드 구현
//반환 해야하고.
//더하기 피라미터 두개 add
//뺴기 sub
//곱하기 mul
//나누기 div
//나머지 mod
