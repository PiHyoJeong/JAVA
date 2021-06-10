package sec03.exam01_parent_constructor_call;
//
//public class Student extends People {
//
//	public Student() {
//		super("홍길동","1222234"); //부모생성자를 호출해야만 한다.
//		
//	}
//	
//}


//외부에서 값을 넣고싶다면, Student(String name,String ssn) { super(name,ssn) } 이다.
//public class Student extends People {
//
//	public Student(String name, String ssn) {
//		super(name, ssn); 
//		
//	}
//	
//}


public class Student extends People {

	//자식 class 에서 추가적으로 필드를 가질 수 있다.
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); 
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
	
}
