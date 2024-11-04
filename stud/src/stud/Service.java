package stud;

public class Service {
	Student[] students = new Student[10];

	// 등록
	int cnt = 0;

	public void register() {
		int no = utils.nextInt("학번을 입력하세요");
		String name = utils.nextline("이름을 입력하세요");
		int kor = utils.nextInt("국어점수");
		int eng = utils.nextInt("영어점수");
		int mat = utils.nextInt("수학점수");


		Student tmp = new Student();

		tmp.no = no;
		tmp.name = name;
		tmp.kor = kor;
		tmp.eng = eng;
		tmp.mat = mat;

		students[cnt] = tmp;
		cnt++;

		System.out.println("1번 추가 2번 조회");
	}

	// 조회
	 void list() {
       for (int i = 0; i < cnt; i++) {
           System.out.println(students[i].no + " " + students[i].name + " " + students[i].kor + " " + students[i].eng
                   + " " + students[i].mat + " " + students[i].sum() + " " + students[i].avg() + " ");

       }
   }

}