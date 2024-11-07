package stud;

public class Student {
    int no;
    String name;
    int kor;
    int eng;
    int mat;

    //this? 나를 먼 시점에서 바라보는 나 
    Student(int no, String name, int kor ,int eng,int mat){ 
    	this.no=no;
    	this.name=name;
    	this.kor=kor;
    	this.eng=eng;
    	this.mat=mat;
    }// 파라미터가 있는 생성자
    
    
    
    

    // 필드 5개
    // 학번 이름 국어 영어 수학

    // 메서드 2개 생성
    // 총점 평균

	 Student() {
		 this(3, "개똥이", 80, 60, 80);
		 // TODO Auto-generated constructor stub
	}





	//생성자 정의
    //다섯개의 필드 초기화를 하는 생성자를 작성
    //service 클래스의 register는 해당 생성자를 호출하는 코드로 변경
    public int sum() {
        return this.kor + this.eng  + this.mat;

    }

    public int avg() {
        return this.sum() / 3;
    }





	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", sum()="
				+ sum() + ", avg()=" + avg() + "]";
	}

   

}