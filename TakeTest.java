package cooperation;

public class TakeTest {

	public static void main(String[] args) { 
		
		Student aji = new Student("aji",1,1000);
		Student woori = new Student("woori",2,2000);
		
		Bus bus100 = new Bus(100);		
		Subway subway2 = new Subway("2");
		
		
		
		aji.takeBus(bus100);
		woori.takeSubway(subway2);
		woori.takeBus(bus100);
		
		subway2.showInfo();
		bus100.showInfo();
	}

}
