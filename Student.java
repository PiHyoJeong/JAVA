package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	
	public Student(String studentName, int grade, int money) {
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	void takeBus(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
		
	}
	
	void takeSubway(Subway subway) {
		subway.take(2000);
		this.money -= 2000;
	}
	
	void showInfo() {
		System.out.println(studentName + " : 남은 돈은 " + money + "입니다.");
	}
	
}
