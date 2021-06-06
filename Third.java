package java_01JUN21;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		System.out.println("enter your score : ");
		int score = sc.nextInt();
		
		if(score>100 || score<0) {
			result = "re-enter your score ";
		}else if(score>=90) {
			if(score>=98) {
				result = "A+";
			}else if(score>=94) {
				result = "A0";
			}else {
				result = "A-";
			}
		}else if(score>=80) {
			if(score>=88) {
				result = "B+";
			}else if(score>=84) {
				result = "B0";
			}else {
				result = "B-";
			}
		}else if(score>=70) {
			if(score>=78) {
				result = "C+";
			}else if(score>=74) {
				result = "C0";
			}else {
				result = "C-";
			}
		}else {
			result = "D";
		}
		System.out.println("your result : " + result);
	}

}
