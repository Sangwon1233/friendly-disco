package stud;



public class StudentMain {
	public static void main(String[] args) {
		Service service =new Service();
		Student s1 =new Student();
//		s1.kor=90;
//		
//		System.out.println(s1);
//		
//		Student s2 =new Student(10, "dasd", 100, 100, 100);
//		s2.kor=70;
		
		
		service.register();
		service.list();
		service.remove();
		service.list();
		
		
		
		
		
	}
}
