package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	void showInfo() {
		System.out.println(busNumber + "�� ������ �°���" + passengerCount + "���Դϴ�.");
		System.out.println("������" + money + "�Դϴ�.");
	}
}
