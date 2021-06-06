package java_01JUN21;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int number = sc.nextInt();
		
		switch(number) {
		case 1 : System.out.println("number one");
			break;
		case 2 : System.out.println("number two");
			break;
		case 3 : System.out.println("number three");
			break;
		case 4 : System.out.println("number four");
			break;
		default : System.out.println("re-enter number");
		}

	}

}
