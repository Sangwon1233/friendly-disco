package ex;

import java.util.Arrays;

public class ArrayMain1 {
	public static void main(String[] args) {
		//30 50 20 10 40 출력
		//기존 배열 길이의 두배의 길이를 가지는 배열을 생성
		//기존 배열에 있던 데이터를 같은 인덱스 위치에 복사
		int[] arr={30,50,20,10,40};
		int[] arr2=new int[arr.length*2];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		for(int i=0; i<arr.length;i++) {
			arr2[i]=arr[i];
			
		}
		arr=arr2;
		System.out.println(Arrays.toString(arr));
		
	}

}
