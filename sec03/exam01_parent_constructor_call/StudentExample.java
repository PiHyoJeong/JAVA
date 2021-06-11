package sec03.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동","123414567",1); 
		//여기서는 자식 객체를 만들어서 호출했지만, 실제로는 부모 생성자가 먼저 호출된다. (Student class 에서 super) 
		System.out.println(student.name); //부모의 필드를 물려받았다.
		System.out.println(student.ssn); //부모의 필드를 물려받았다.
		System.out.println(student.studentNo); //자신의 필드를 물려받았다.
	}

}
