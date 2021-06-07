package JAVA_no20_2;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];//여러개의 계좌들의 저장할 수 있는 타입은 배열을 필드로 선언하자
			//static으로 선언한 이유는 main에서 선언할 수 있도록.
	private static Scanner scanner = new Scanner(System.in);//keyborad로부터 입력받기
	
	public static void main(String[] args) {
		boolean run = true;//boolean 이라는 로컬변수 run 선언.
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>"); //사용자가 바로 입력할 수 있도록 ln을 붙이지 않는다.
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				creatAccount(); //지금 creatAccount()가 main 메소드에서 바로 호출을 했기 때문에 이 메소드는 static 으로 정의되어야한다.
			}else if(selectNo==2) {
				accountList(); //메소드를 호출해서 계좌번호를 보여줄 수 있도록 처리하자.
			}else if(selectNo==3) {
				deposit(); //예금
			}else if(selectNo==4) {
				withdraw(); //출금
			}else if(selectNo ==5 ) {
				run = false;
			}
			
		}		
		System.out.println("프로그램 종료");
			
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() { //deposit 하려면 예금할 계좌번호와 금액이 필요함.
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("예금액");
		int money = scanner.nextInt();
		
		//계좌번호에 해당하는 account 객체를 배열에서 찾아와야 한다. 사용자가 입력한 계좌번호와 동일한 계좌번호를 가지고 있는 account 객체를 찾아와야한다.
		Account account = findAccount(ano);//Account라고 하는 객체를 찾아야한다. ano 에 해당하는 account 객체를 찾아야하는데, 여기서 찾는 코드 말고 findAccount 메소드를 호출해서 이 메소드의 매개값으로 찾고자 하는 ano값을 넘겨주면, ano 에 해당하는 account 객체 가 return된다. 
	
	
	}

	private static Account findAccount(String ano) {
		Account account = null;//account객체를 찾아야하니 account 변수를 선언하자.
		
		//배열에서 ano 를 가지고 있는 account를 찾아서 대입해주는 코드를 만들어보자.
		for(int i = 0 ; i < accountArray.length ; i++) {
			if(accountArray[i] != null) { //accountArray[i] 에 있는 값이 null 이 아닐 경우, 어떤 값이 들어가 있을 경우
				String dbAno = accountArray[i].getAno(); //dbAno 에 accountArray 에서 i 번째에 있는 getAno 를 읽어서 저장한다.
				if(dbAno.equals(ano)) { //방금 찾은 ano(dbAno) 와 위에 ano 가 같은지 확인하고
					account = accountArray[i]; //같다면 우리가 찾고자 하는 ㅓㄳ을 찾았으니 account 에 넣어준다.
					break;
				}
			}
		}
		
		return account; //account 변수가 참조하는 객체를 리턴하도록 하자.
	}

	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(int i = 0 ; i < accountArray.length ; i++) {
			Account account = accountArray[i]; //배열에 저장되어있는 Account에 있는 accountArray[i] 객체를 얻어내어서 
			if(account != null) { //account 가 null 이 아닐 경우, 배열의 항목이 null이 아닐 경우 , account 객체가 저장이 되어 있다면
				System.out.println(account.getAno()); //필드가 private로 저장되어 있기 때문에 바로 접근할 수 없고 getter을 통해서 받아온다.
				System.out.println(account.getOwner());
				System.out.println(account.getBalance());
			}
		}
		
	}

	private static void creatAccount() {
		//계좌번호 계좌주 초기금액 입력
		//정보를 다 받으면 새로운 account 객체를 만들어서 배열에 저장해주자.
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		
		//계좌 객체를 만들자.
		Account newAccount = new Account(ano,owner,balance);
//		private static Account[] accountArray = new Account[100];
		//이 객체를 저 위에 Account[] accountArray 에 넣을 것이다.
		//새로운 계좌를 입력할 떄, index 번호를 처음부터 살펴보며 null인 곳을 찾아 넣어야한다.
		for(int i = 0 ; i < accountArray.length ; i++) {
			if(accountArray[i] ==null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}

}
