package stud;

import java.util.Scanner;

public class utils {

    static Scanner scanner=new Scanner(System.in);
   
    //문자열 반환
    static String nextline(String str) {
        System.out.println(str);
        String ret = utils.scanner.nextLine();
        return ret;
    }
    
    static int nextInt(String str) {
        String s= utils.nextline(str);
        int ret = Integer.parseInt(s);
        return ret;
    }
    
    static int parseInt(String s) {
    	return Integer.parseInt(s);
    }

}
