package cooperation;

public class Subway {
	String lineNumber;
	int money;
	int passengerCount;
	
	
	
	public Subway(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}
	
	
	void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	void showInfo() {
		System.out.println(lineNumber + "ȣ���� �°���" + passengerCount + "���Դϴ�.");
		System.out.println("������" + money + "�Դϴ�.");
	}
}
