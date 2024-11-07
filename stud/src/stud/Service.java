package stud;

import java.util.Arrays;

public class Service {
	Student[] students = new Student[10];

	// 등록
	int cnt;
	
	Service() {
		students[cnt++] = new Student(1,"이름",90,90,90);
		students[cnt++] = new Student(2,"이름",90,90,90);
		students[cnt++] = new Student(3,"이름",90,90,90);
		students[cnt++] = new Student(4,"이름",90,90,90);
		students[cnt++] = new Student(5,"이름",90,90,90);
		students[cnt++] = new Student(6,"이름",90,90,90);
			
	}
	

	public void register() {
//		Student student =new Student();

		students[cnt++] = new Student(utils.nextInt("학번"), utils.nextline("이름"), utils.nextInt("국어"),
				utils.nextInt("영어"), utils.nextInt("수학"));

		System.out.println(Arrays.toString(students));
	}

	// 조회
	void list() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(students[i].no + " " + students[i].name + " " + students[i].kor + " " + students[i].eng
					+ " " + students[i].mat + " " + students[i].sum() + " " + students[i].avg() + " ");

		}
	}

	// 수정
	void modify() {
		int no= utils.parseInt("학번");
		Student s =null;
		for(int i= 0; i<cnt;i++) {
			if(no == students[i].no){
				s= students[i];
				break;
			}
		}
		if(s !=null) {
			s.kor=utils.nextInt("국어");
			s.eng=utils.nextInt("영어");
			s.mat=utils.nextInt("수학");
			
		}
		else {
			System.out.println("학번 없음");
		}
			// 2-1. 찾았을때
			// 국어 영어 수학 점수를 입력 받고 반영
			// 2-2. 못찾았을때
		
			// 못찾은 알림 메시지 출력하기
	}

	void remove() {
		// 1. 삭제할 학생의 학번 입력
		int no= utils.parseInt("학번");
		
	}
}
