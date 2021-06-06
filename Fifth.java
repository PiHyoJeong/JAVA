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
		//next()는 개행문자와 공백을 무시하고 문자를 입력받는다. 문자 또는 문자열을 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다.
		//nextLine() 은 한 줄 단위로 입력 받기 때문에 개행문자도 한 줄로 인식한다.
		
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
