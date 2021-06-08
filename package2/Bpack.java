package package2;

import package1.Apack;

public class Bpack extends Apack{ //Apack 을 상속했다.
	
	Apack ap = new Apack();
//	ap.y = 100; //err! protected여서 다른 패키지에서 가지고 올 수 없다. (상속도 아니여서 안됨)
	
	
	void printTest() { 
//		x = 10; //err! private 해서 가지고 올 수 없다.
		y = 20; //protected 여서 원래는 다른 패키지에서 가지고 올 수 없는데, 상속한다면 가지고 올 수 있다.
		z = 30;
		
//		System.out.println(x); //err! 
		System.out.println(y);
		System.out.println(z);
	}

}
