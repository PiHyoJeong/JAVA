package Override;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator(); //Calculator 객체의 areaCircle() 실행
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer(); //Computer 객체의 areaCircle() 실행
		System.out.println("원면적 : " + computer.areaCircle(r)); 
	}

}
