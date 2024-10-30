package stud;

import java.util.Scanner;

public class utils {

    static Scanner scanner=new Scanner(System.in);
    //문자열 반환
    static String nextline(String str) {
        System.out.println(str);
        String ret = scanner.nextLine();
        return ret;
    }
    static int nextInt(String str) {
        String s= nextline(str);
        int ret = Integer.parseInt(s);
        return ret;
    }

}
