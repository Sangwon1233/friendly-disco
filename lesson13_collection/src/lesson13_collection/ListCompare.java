package lesson13_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListCompare {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> link= new LinkedList<Integer>();
		
		incre(arr);
		incre(link);
//		System.out.println("access");
//		access(arr);
//		access(link);
//		System.out.println("incre2");
//		incre2(arr);
//		incre2(link);
//		System.out.println("remove");
//		remove(arr);
//		remove(link);
		System.out.println("remove2");
		remove2(arr);
		remove2(link);
		
	
		
		
	}
	static void incre(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i<100_000;i++) {
			list.add(i);
		}
		System.out.println(list.getClass().getSimpleName()+ "::"+(System.currentTimeMillis() -start +"ms"));
	}
	static void incre2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i<100_000;i++) {
			list.add(0,i);
		}
		System.out.println(list.getClass().getSimpleName()+ "::"+(System.currentTimeMillis() -start +"ms"));
		
	}
	
	static void remove(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i<100_000;i++) {
			list.remove(0);//0번 인덱스 지우기
		}
		System.out.println(list.getClass().getSimpleName()+ "::"+(System.currentTimeMillis() -start +"ms"));
		
	}
	static void remove2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 100_000 ; i>0;i--) {
			list.remove(i-1);//뒤에서 하나씩 삭제
		}
		System.out.println(list.getClass().getSimpleName()+ "::"+(System.currentTimeMillis() -start +"ms"));
		
	}

}