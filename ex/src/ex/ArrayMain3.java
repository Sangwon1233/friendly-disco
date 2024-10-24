package ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain3 {
	public static void main(String[] args) {
		//문제1. int 배열의 중간값 계산
		//{1,2,3,4,5} 홀수일때는 단일 수 3이 나와야함
		
//		int tmp=0;
//		int[] arr= {1,2,3,4,5};
//		if(arr.length%2==1) {
//			tmp=arr.length/2;
//			System.out.println(arr[tmp]);
//		}
		
		//{4,5,2,3,4,1}짝수일땐  평균값 2,3의 평균값
		
//		int[] arr1={4,5,2,3,4,1};
//		if(arr1.length%2==0) {
//			tmp=arr1.length/2;
//			System.out.println((double)(arr1[tmp]+arr1[tmp-1])/2);
//		}
//		
		
		//문제2.배열의 요소 뒤집기 (순서 역순 만들기)
		
//		int[] arr={1,2,3,4,5};
//		int[] arr1=new int[5];
//		arr1[0]=arr[4];
//		arr1[1]=arr[3];
//		arr1[2]=arr[2];
//		arr1[3]=arr[1];
//		arr1[4]=arr[0];
//		System.out.println(Arrays.toString(arr1));
//		
//		for(int i=0;i<arr.length;i++) {
//			arr1[arr.length-1-i]=arr[i];
//		}s
//		System.out.println(Arrays.toString(arr1));
		
		//문제1. 배열의 값이 좌우 대칭인지 확인
//		int[] arr= {1,3,3,2,2,3,3,2,2,1};
//		int[] arr1=new int[arr.length];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr1[i]=arr[arr.length-1-i];
//			System.out.println(arr1[i] == arr[i] ? "대칭":"대칭아님");
//		}	
			
//			boolean result=false;
//			if(result==false) {	
//				
//			}

		
	
		
		
		
		
		//문제2. 배열의 특정 구간의 합계 구하기
		
		
		
		//문제3.{1,2,3,4,5}
		 //5입력시 포함됨 6입력시 포함되지 않음
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int input =scanner.nextInt();
			int[] arr = {1,2,3,4,5,6};
			boolean result=false;
			int tmp=0;
			for(int i =0; i<arr.length;i++) {
				if(input==arr[i]){
					tmp=arr[i];
						
					
					return;	
				}
				
			}
	}
		
}


