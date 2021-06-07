package JAVA_no20;

import java.util.Scanner;


public class BankApplication {

		private static Account[] accountArray = new Account[100]; //배열 . 계좌발급. 변수에 담아야한다. 배열에 들어오는 데이터는 선언했던 타입이(new 다음에 있는거) 배열의 실제 타입은 뒤에있는 Account_Application이다./ 배열의 타입은 앞에 있는 Account_Application
		//Account_Application 생성될 때마다 객체정보를 사용할 수 있고 참조변수가 들어온다. 주소값이 들어오는 것과 같다. 멤버면수(ano, pwner , balance )는 세개짜리이다. 그리고 getter 와 setter 가 여섯개가 있따. 
		private static Scanner scanner = new Scanner(System.in);
		
		//제어자. 그 중 접근제어자 네가지.  접근제어자+나머지 제어자.  배열이 static 하게 선언되어있다. static 한 애들은 해당타입의 객체들이 이미 메모리가 할당돼서. 같은 static끼리는 사용이 가능하다. static 한 변수는 instance를 사용할 수 없다. / instance는 반드시 생성을 해줘야 한다. 생성 후 메모리가 만들어져서 접근이 가능하다.
		//instance한 메소드는 static을 쓸 수 있다.
		public static void main(String[] args) {
			
			boolean run = true;
			while(run) {
				System.out.println("------------------------------");
				System.out.println("1계좌생성|2계좌목록|3예금|4출금|5계좌이체|6종료");
				System.out.println("------------------------------");
				System.out.println("선택>");
				
				int selectNo = scanner.nextInt();
				
				if(selectNo==1) {
					createAccount();
				}else if(selectNo==2) {
					accountList();
				}else if(selectNo==3) {
					deposit();
				}else if(selectNo==4) {
					withdraw();
				}else if(selectNo==5) {
					transfer();
				}
				
				else if(selectNo==6) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		}
		
		private static void createAccount() { //함수를 만들 떄 , 리턴값을 줘야할지 말아야할지 생각해보자. 활용이 안되는거 같으니 리턴값을 주지 않아도 될 것 같다.
												//이 메소드를 정의할 떄 static 한지 instance한지 확인해야 한다. 
			System.out.println("----------");
			System.out.println("계좌생성");
			System.out.println("----------");
			System.out.println("계좌번호:");
			String ano = scanner.next();
			System.out.println("계좌주:");
			String owner = scanner.next();
			System.out.println("초기입금액:");
			int balance = scanner.nextInt();
			
			//입력받은 정보들을 저장해서 통장을 하나 계설해야한다. 배열을 이용해서 저장해보자.
			Account newAccount = new Account(ano,owner,balance);
			
			//0번째에 넣었다. 두번째 계좌를 개설했을 때 그 다음 순서가 되어야한다. 
			//배열변수는 배열 안에 배열이 생성되면서 기본값이 들어간다. int 는 0, 객체타입은 null. 
			//배열 안에 데이터가 있는지 없는지를 확인해야한다. 몇번째까지 들어가있는지 확인해야하고 그 다음 위치에 계좌를 넣어야한다.
			
			for(int i = 0 ; i <= accountArray.length ; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
					break;
				}
				
			}
		}
		
		private static void accountList() {
			System.out.println("----------");
			System.out.println("계좌목록");
			System.out.println("----------");
			
			for(Account acc : accountArray) {
				if(acc != null) {
					System.out.println(acc.getAno() + " " + acc.getOwner() + " " + acc.getBalance()); //private 하니까 getter setter 사용해야함 //한사람의 계좌정보를 출력할 수 있따.
				}
			}
		}
		
		private static void deposit() {
			System.out.println("----------");
			System.out.println("예금");
			System.out.println("----------");
			
			System.out.println("계좌번호:");
			String ano = scanner.next();
			
			System.out.println("예금액:");
			int money = scanner.nextInt();
			
			Account account = findAccount(ano); //계좌번호를 받아서 배열에 있는 객체중에 이 계좌번호가 있는 객체가 있으면 return 한다. 사용하기 푠하게 변수를 지정해주자
			if(account == null) {
				System.out.println("계좌가 개설되지 않음");
				
			}else {
				account.setBalance(account.getBalance() + money); //계좌의 잔고(balance)에 추가를 해주면 입금이 완료된다.money //추가로 넣는 금액이 추가가 안된다. 그래서 account.getBalance()+money 를 해야한다.
				System.out.println("결과:예금성공");
			}
		}
		
		private static void withdraw() {
			
			System.out.println("----------");
			System.out.println("출금");
			System.out.println("----------");
			
			System.out.println("계좌번호:");
			String ano = scanner.next();
			
			System.out.println("출금액:");
			int money = scanner.nextInt();
			
			Account account = findAccount(ano); 
			if(account == null) {
				System.out.println("계좌가 개설되지 않음");
				
			}else {
				account.setBalance(account.getBalance() - money); //계좌의 잔고(balance)에 추가를 해주면 입금이 완료된다.money //추가로 넣는 금액이 추가가 안된다. 그래서 account.getBalance()+money 를 해야한다.
				System.out.println("결과:출금성공");
			}
		}
		
		
		
		private static Account findAccount(String ano) { 
			
			Account account = null;
			
			for(int i = 0 ; i<accountArray.length; i++) {
				if(accountArray[i] != null) {
					String dbAno = accountArray[i].getAno();
					if(ano.equals(dbAno)) {
						account = accountArray[i];
					}
				}
			}
			return account;
		}
		
		private static void transfer() {
			System.out.println("----------");
			System.out.println("계좌이체");
			System.out.println("----------");
			
			System.out.println("계좌번호:");
			String ano = scanner.next();
			
			
			System.out.println("이체할 계좌번호");
			String transfer = scanner.next();

			Account my_acc = findAccount(ano);
			Account to_acc = findAccount(transfer);
			
			if(my_acc == null || to_acc==null) {
				System.out.println("계좌가 개설되지 않음");
				
			}else {

				System.out.println("이체액:");
				int money = scanner.nextInt();
				my_acc.setBalance(my_acc.getBalance() - money);
				to_acc.setBalance(to_acc.getBalance() - money);
				System.out.println("결과:출금성공");
			}
		}

	}


