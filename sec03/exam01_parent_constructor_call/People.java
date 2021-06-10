package sec03.exam01_parent_constructor_call;

public class People {
	public String name;
	public String ssn;
	
	//생성자
	public People(String name,String ssn) { //이름과 주민번호를 받아서 
		this.name= name;					//필드값으로 초기화하기
		this.ssn =ssn;
		System.out.println("부모 객체 생성 완료");
	}
}
