package stud;

public class Student {
    int no=10;
    String name;
    int kor=10;
    int eng;
    int mat;


//    public Student(int no, String name,int kor,int eng,int mat) {}

    // 필드 5개
    // 학번 이름 국어 영어 수학

    // 메서드 2개 생성
    // 총점 평균

    public Student() {}

	//생성자 정의
    //다섯개의 필드 초기화를 하는 생성자를 작성
    //service 클래스의 register는 해당 생성자를 호출하는 코드로 변경
    public int sum() {
        return kor + eng + mat;

    }

    public int avg() {
        return sum() / 3;
    }

    @Override
    public String toString() {
        return String.format("Student [no=%d, name=%s, kor=%d, eng=%d, mat=%d,sum=%d,avg=%f]", no, name, kor, eng, mat,
                sum(), avg());
    }

}