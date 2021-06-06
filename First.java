package java_01JUN21;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		System.out.println("enter your score : ");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>100 || score<0) {
			System.out.println("re-enter your score");
		}else if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		

	}

}
