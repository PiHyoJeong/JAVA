package sec04.exam01_overriding;

public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) { //자식 메소드 재정의하기
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
