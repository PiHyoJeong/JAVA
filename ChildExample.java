package Promotion;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //자동 타입 변환
		parent.method1(); //Parent-method1()
		parent.method2(); //Child-method2() 재정의된 메소드가 호출.(상속)
		//parent.method3(); err!

	}

}
