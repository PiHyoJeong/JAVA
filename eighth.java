package java_01JUN21;

import java.util.Scanner;

public class eighth {

	public static void main(String[] args) {
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("enter number : ");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("number one");
			}else if(num ==2) {
				System.out.println("number two");
			}else if(num==3) {
				System.out.println("number three");
			}else {
				System.out.println("not this number");
				flag = false;
			}
		}
		System.out.println("end");

	}

}
