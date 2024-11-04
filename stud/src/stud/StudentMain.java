package stud;

import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
		Service service =new Service();
		service.register();
		service.list();
		service.register();
		service.list();
		service.register();
		service.list();
	}
}
