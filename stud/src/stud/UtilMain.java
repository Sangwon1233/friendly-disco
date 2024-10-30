package stud;

import java.util.Scanner;

public class UtilMain {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Service service = new Service();
		service.register();

		
		
		
		while (true) {	
		int input = scanner.nextInt();
		
			switch (input) {
			case 1:
				service.register();
				break;
			case 2:
				service.list();
				break;
			default:
				break;
			}
		}

	}

}