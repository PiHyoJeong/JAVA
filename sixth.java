package java_01JUN21;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one of 1.rock 2.scissor 3.paper");
		int user,com;
		
		user = sc.nextInt();
		
		com = (int)(Math.random()*3)+1; //1부터 3까지 난수 만들기
		
		System.out.println("user : " + user);
		System.out.println("computer : " + com);
		
		if(user==com) {
			System.out.println("again!");
		}else if(user==1) {
			if(com==2) {
				System.out.println("win user!");
			}else if(com==3) {
				System.out.println("win computer!");
			}
		}else if(user==2) {
			if(com==1) {
				System.out.println("win computer!");
			}else if(com==3) {
				System.out.println("win user!");
			}
		}else if(user==3) {
			if(com==1) {
				System.out.println("win user!");
			}else if(com==2) {
				System.out.println("win computer!");
			}
		}
	}

}
