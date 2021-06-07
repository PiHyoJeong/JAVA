package JAVA_P267;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-10);
		System.out.println(myCar.getSpeed()); //0
		myCar.setSpeed(10);
		System.out.println(myCar.getSpeed()); //10
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		} //∏ÿ√„
		
		System.out.println("«ˆ¿Áº”¥ı : " + myCar.getSpeed());
	}

}
