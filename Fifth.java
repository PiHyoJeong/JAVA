package java_01JUN21;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number : ");
		int number1 = sc.nextInt();
		System.out.println("enter second number : ");
		int number2 = sc.nextInt();
		System.out.println("enter numerical expression : ");
		String exp = sc.next();
		//next()�� ���๮�ڿ� ������ �����ϰ� ���ڸ� �Է¹޴´�. ���� �Ǵ� ���ڿ��� ������ �������� �� �ܾ� �Ǵ� �� ���ھ� �Է¹޴´�.
		//nextLine() �� �� �� ������ �Է� �ޱ� ������ ���๮�ڵ� �� �ٷ� �ν��Ѵ�.
		
		switch(exp) {
		case "+" : System.out.println("result : " + number1 + number2);
			break;
		case "-" : System.out.println("result : " + (number1 - number2));
			break;
		case "*" : System.out.println("result : " + number1 * number2);
			break;
		case "/" : System.out.println("result : " + number1 / number2);
			break;
		default : System.out.println("re-enter");
		}
	}

}
