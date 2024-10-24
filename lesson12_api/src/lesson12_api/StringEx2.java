package lesson12_api;

public class StringEx2 {
	public static void main(String[] args) {
		String str ="a";
		str += "b";
		String str2 = "1"+"2"+"3";
		
		//"a" "b" "ab" "1" "2" "12" "3" "123"
		
		str = "";
		StringBuffer sb = new StringBuffer(""); //임시 저장공간
//		sb.append("e");
//		System.out.println(sb);
		long start = System.currentTimeMillis();
		for(int i=0; i <1000_000; i++) {
//			str += "0";
			sb.append("0");	
			}
		
		long end = System.currentTimeMillis();
		str=sb.toString();
		sb= new StringBuffer(str);
		System.out.println(sb.length()+":::"+(end -start)+"ms");
//		System.out.println(str.length()+":::"+(end -start)+"ms");
		
		//cache , hash , buffer 성능향상
		
		String s =  "abcde";//"abc123de"
//		s= s.substring(0,3)+"123"+s.substring(3);
//		System.out.println(s);
		
//		System.out.println(s);
//		System.out.println(s.replace("c", ""));//c를 뺸 값
		
		sb=new StringBuffer(s);//객체 자체 수정가능
		sb.insert(3, "123");//3번째에 123을 넣겠다
		sb.deleteCharAt(sb.indexOf("c"));//c를 빼겠다
		System.out.println(sb);
		
//		StringBffer: Thread safe
//		StringBuilder: Thread unsafe
		
//		ArratList :Thread unsafe
//		Vector :Thread safe
		
		
	}

}