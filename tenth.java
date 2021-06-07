package java_01JUN21;

import java.util.Scanner;

public class tenth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		do {
			System.out.println("enter alphabet : ");
			input = sc.nextLine();
			System.out.println(input);
		}while(!input.equals("q"));
		System.out.println("end");

	}

}
