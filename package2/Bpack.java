package package2;

import package1.Apack;

public class Bpack extends Apack{ //Apack �� ����ߴ�.
	
	Apack ap = new Apack();
//	ap.y = 100; //err! protected���� �ٸ� ��Ű������ ������ �� �� ����. (��ӵ� �ƴϿ��� �ȵ�)
	
	
	void printTest() { 
//		x = 10; //err! private �ؼ� ������ �� �� ����.
		y = 20; //protected ���� ������ �ٸ� ��Ű������ ������ �� �� ���µ�, ����Ѵٸ� ������ �� �� �ִ�.
		z = 30;
		
//		System.out.println(x); //err! 
		System.out.println(y);
		System.out.println(z);
	}

}
