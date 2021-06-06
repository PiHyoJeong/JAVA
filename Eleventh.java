package java_01JUN21;

import java.util.Scanner;

public class Eleventh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int number = sc.nextInt();
		int result = 0;
		
		while(number!=0) {
			result = (number%10) + (result*10);
			number = number / 10;
		}
		System.out.println("result : " + result);

	}

}
