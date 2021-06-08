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
		System.out.println(lineNumber + "호선의 승객은" + passengerCount + "명입니다.");
		System.out.println("수입은" + money + "입니다.");
	}
}
