package Override;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator(); //Calculator ��ü�� areaCircle() ����
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer(); //Computer ��ü�� areaCircle() ����
		System.out.println("������ : " + computer.areaCircle(r)); 
	}

}
