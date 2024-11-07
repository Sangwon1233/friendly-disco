package stud;

import java.util.Arrays;

public class ary {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
//		System.out.println(Arrays.toString(arr));
//	
//		System.out.println(Arrays.toString(arr));
		int cnt=1;
		for(int i=0; i<arr.length-1;i++) {
			arr[i]=arr[cnt++];
			
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
