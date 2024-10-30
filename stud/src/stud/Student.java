package stud;

public class Student {
		
		int no;
		String name;
		int kor;
		int eng;
		int mat;
		
//	public Student(int no, String name,int kor,int eng,int mat) {
//		return;
//	}
		
		
	//필드 5개
	//학번 이름 국어 영어 수학


	

	//메서드 2개 생성
    //총점 평균
	public int sum() {
		return kor+eng+mat;
		
	}
	
	public double avg() {
		return (kor+eng+mat)/3d;
	}

	@Override
	public  String toString() {
		return String.format("Student [no=%d, name=%s, kor=%d, eng=%d, mat=%d,sum=%d,avg=%f]"
				, no, name, kor, eng, mat,sum(),avg());
	}


	
}

