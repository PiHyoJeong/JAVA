package java_01JUN21;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		
		System.out.println("enter your score : ");
		
		int score = sc.nextInt();
		
		if(score>100 || score<0) {
			System.out.println("re-enter your score");
		}else if(score>=90) {
			result="A";
		}else if(score>=80) {
			result="B";
		}else if(score>=70) {
			result="C";
		}else {
			result="D";
		}
		System.out.println("result : " + result);
	}

}
