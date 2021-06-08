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
		System.out.println(busNumber + "번 버스의 승객은" + passengerCount + "명입니다.");
		System.out.println("수입은" + money + "입니다.");
	}
}
