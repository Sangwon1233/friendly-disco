package ex;

public class ArrayMain2 {
	public static void main(String[] args) {
	int[] arr={30,40,20,10,50,1};
	
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		sum += arr[i];
	}
	System.out.println(sum);
	
	 
//	avg=sum/arr.length-1;
	double avg=((double)sum / arr.length * 100);
	double tmp=(int)avg/100d;
	System.out.println(tmp);
	avg=tmp;
	System.out.println(avg);
	//25.16
		
		
	//배열의 합계 평균 구하기 {30,40,20,10,50,1}
	//짝수가 몇개인지 출력
	//소수 둘째자리까지 출력
	}
}
