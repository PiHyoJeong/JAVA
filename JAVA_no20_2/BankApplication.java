package JAVA_no20_2;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];//�������� ���µ��� ������ �� �ִ� Ÿ���� �迭�� �ʵ�� ��������
			//static���� ������ ������ main���� ������ �� �ֵ���.
	private static Scanner scanner = new Scanner(System.in);//keyborad�κ��� �Է¹ޱ�
	
	public static void main(String[] args) {
		boolean run = true;//boolean �̶�� ���ú��� run ����.
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("-----------------------------------");
			System.out.print("����>"); //����ڰ� �ٷ� �Է��� �� �ֵ��� ln�� ������ �ʴ´�.
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				creatAccount(); //���� creatAccount()�� main �޼ҵ忡�� �ٷ� ȣ���� �߱� ������ �� �޼ҵ�� static ���� ���ǵǾ���Ѵ�.
			}else if(selectNo==2) {
				accountList(); //�޼ҵ带 ȣ���ؼ� ���¹�ȣ�� ������ �� �ֵ��� ó������.
			}else if(selectNo==3) {
				deposit(); //����
			}else if(selectNo==4) {
				withdraw(); //���
			}else if(selectNo ==5 ) {
				run = false;
			}
			
		}		
		System.out.println("���α׷� ����");
			
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void deposit() { //deposit �Ϸ��� ������ ���¹�ȣ�� �ݾ��� �ʿ���.
		System.out.println("-------");
		System.out.println("����");
		System.out.println("-------");
		System.out.print("���¹�ȣ:");
		String ano = scanner.next();
		System.out.print("���ݾ�");
		int money = scanner.nextInt();
		
		//���¹�ȣ�� �ش��ϴ� account ��ü�� �迭���� ã�ƿ;� �Ѵ�. ����ڰ� �Է��� ���¹�ȣ�� ������ ���¹�ȣ�� ������ �ִ� account ��ü�� ã�ƿ;��Ѵ�.
		Account account = findAccount(ano);//Account��� �ϴ� ��ü�� ã�ƾ��Ѵ�. ano �� �ش��ϴ� account ��ü�� ã�ƾ��ϴµ�, ���⼭ ã�� �ڵ� ���� findAccount �޼ҵ带 ȣ���ؼ� �� �޼ҵ��� �Ű������� ã���� �ϴ� ano���� �Ѱ��ָ�, ano �� �ش��ϴ� account ��ü �� return�ȴ�. 
	
	
	}

	private static Account findAccount(String ano) {
		Account account = null;//account��ü�� ã�ƾ��ϴ� account ������ ��������.
		
		//�迭���� ano �� ������ �ִ� account�� ã�Ƽ� �������ִ� �ڵ带 ������.
		for(int i = 0 ; i < accountArray.length ; i++) {
			if(accountArray[i] != null) { //accountArray[i] �� �ִ� ���� null �� �ƴ� ���, � ���� �� ���� ���
				String dbAno = accountArray[i].getAno(); //dbAno �� accountArray ���� i ��°�� �ִ� getAno �� �о �����Ѵ�.
				if(dbAno.equals(ano)) { //��� ã�� ano(dbAno) �� ���� ano �� ������ Ȯ���ϰ�
					account = accountArray[i]; //���ٸ� �츮�� ã���� �ϴ� �ä��� ã������ account �� �־��ش�.
					break;
				}
			}
		}
		
		return account; //account ������ �����ϴ� ��ü�� �����ϵ��� ����.
	}

	private static void accountList() {
		System.out.println("-------");
		System.out.println("���¸��");
		System.out.println("-------");
		
		for(int i = 0 ; i < accountArray.length ; i++) {
			Account account = accountArray[i]; //�迭�� ����Ǿ��ִ� Account�� �ִ� accountArray[i] ��ü�� ��� 
			if(account != null) { //account �� null �� �ƴ� ���, �迭�� �׸��� null�� �ƴ� ��� , account ��ü�� ������ �Ǿ� �ִٸ�
				System.out.println(account.getAno()); //�ʵ尡 private�� ����Ǿ� �ֱ� ������ �ٷ� ������ �� ���� getter�� ���ؼ� �޾ƿ´�.
				System.out.println(account.getOwner());
				System.out.println(account.getBalance());
			}
		}
		
	}

	private static void creatAccount() {
		//���¹�ȣ ������ �ʱ�ݾ� �Է�
		//������ �� ������ ���ο� account ��ü�� ���� �迭�� ����������.
		System.out.println("-------");
		System.out.println("���»���");
		System.out.println("-------");
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		
		System.out.print("������ : ");
		String owner = scanner.next();
		
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		//���� ��ü�� ������.
		Account newAccount = new Account(ano,owner,balance);
//		private static Account[] accountArray = new Account[100];
		//�� ��ü�� �� ���� Account[] accountArray �� ���� ���̴�.
		//���ο� ���¸� �Է��� ��, index ��ȣ�� ó������ ���캸�� null�� ���� ã�� �־���Ѵ�.
		for(int i = 0 ; i < accountArray.length ; i++) {
			if(accountArray[i] ==null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}

}
