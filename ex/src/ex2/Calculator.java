package ex2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		double x = Double.parseDouble(input.nextLine());
		System.out.println("두번째 숫자를 입력하세요");
		double y = Double.parseDouble(input.nextLine());
	
		
				
		System.out.println("연산 기호를 입력하세요 (+,-,&,/,%)");
		String operator	=input.nextLine();
		
		Calc c1=new Calc();
		
//		double result=c1.add(10, 20);
//		double result2=c1.div(10, 20);
//		double result3=c1.mod(10, 20);
//		double result4=c1.mul(10, 20);
//		double result5=c1.sub(10, 20);
//		System.out.println(result);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
//		System.out.println(result5);
		
		
	
		switch (operator) {//입력을 2개를 받아 연산을한 값을 출력 
		case "+":
			System.out.println(c1.add(x,y));
			break;
		case "-":
			System.out.println(c1.sub(x,y));
			break;
		case "*":
			System.out.println(c1.mul(x,y));
			break;
		case "/":
			System.out.println(c1.div(x,y));
			break;
		case "%":
			System.out.println(c1.mod(x,y));
			break;
			

		default:
			break;
		}
		
		
		
		
//		switch (scanner.nextInt()) {
//		case 0:
//			System.out.println(c1.add(scanner.nextInt(),scanner.nextInt()));
//			System.out.println(c1);
//			break;
//		case 1:
//			System.out.println(c1.sub(scanner.nextInt(),scanner.nextInt()));
//			System.out.println(c1);
//			break;
//		case 2:
//			System.out.println(c1.mul(scanner.nextInt(),scanner.nextInt()));
//			System.out.println(c1);
//			break;
//		case 3:
//			System.out.println(c1.div(scanner.nextInt(),scanner.nextInt()));
//			System.out.println(c1);
//			break;
//		case 4:
//			System.out.println(c1.mod(scanner.nextInt(),scanner.nextInt()));
//			System.out.println(c1);
//			break;
//		}
//		
		
		
	}

}
class Calc{
	 double add(double x, double y) {
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
	//switch
	//숫자 두개, 부호도 입력
	//반환된 값을 여기서 출력
			
	 
	//메서드 구현
	
	//반환 해야하고.
	
	//더하기 피라미터 두개 add
	
	//뺴기 sub
	
	//곱하기 mul
	
	//나누기 div
	
	//나머지 mod
}
