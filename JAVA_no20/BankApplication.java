package JAVA_no20;

import java.util.Scanner;


public class BankApplication {

		private static Account[] accountArray = new Account[100]; //�迭 . ���¹߱�. ������ ��ƾ��Ѵ�. �迭�� ������ �����ʹ� �����ߴ� Ÿ����(new ������ �ִ°�) �迭�� ���� Ÿ���� �ڿ��ִ� Account_Application�̴�./ �迭�� Ÿ���� �տ� �ִ� Account_Application
		//Account_Application ������ ������ ��ü������ ����� �� �ְ� ���������� ���´�. �ּҰ��� ������ �Ͱ� ����. ������(ano, pwner , balance )�� ����¥���̴�. �׸��� getter �� setter �� �������� �ֵ�. 
		private static Scanner scanner = new Scanner(System.in);
		
		//������. �� �� ���������� �װ���.  ����������+������ ������.  �迭�� static �ϰ� ����Ǿ��ִ�. static �� �ֵ��� �ش�Ÿ���� ��ü���� �̹� �޸𸮰� �Ҵ�ż�. ���� static������ ����� �����ϴ�. static �� ������ instance�� ����� �� ����. / instance�� �ݵ�� ������ ����� �Ѵ�. ���� �� �޸𸮰� ��������� ������ �����ϴ�.
		//instance�� �޼ҵ�� static�� �� �� �ִ�.
		public static void main(String[] args) {
			
			boolean run = true;
			while(run) {
				System.out.println("------------------------------");
				System.out.println("1���»���|2���¸��|3����|4���|5������ü|6����");
				System.out.println("------------------------------");
				System.out.println("����>");
				
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
			System.out.println("���α׷� ����");
		}
		
		private static void createAccount() { //�Լ��� ���� �� , ���ϰ��� ������� ���ƾ����� �����غ���. Ȱ���� �ȵǴ°� ������ ���ϰ��� ���� �ʾƵ� �� �� ����.
												//�� �޼ҵ带 ������ �� static ���� instance���� Ȯ���ؾ� �Ѵ�. 
			System.out.println("----------");
			System.out.println("���»���");
			System.out.println("----------");
			System.out.println("���¹�ȣ:");
			String ano = scanner.next();
			System.out.println("������:");
			String owner = scanner.next();
			System.out.println("�ʱ��Աݾ�:");
			int balance = scanner.nextInt();
			
			//�Է¹��� �������� �����ؼ� ������ �ϳ� �輳�ؾ��Ѵ�. �迭�� �̿��ؼ� �����غ���.
			Account newAccount = new Account(ano,owner,balance);
			
			//0��°�� �־���. �ι�° ���¸� �������� �� �� ���� ������ �Ǿ���Ѵ�. 
			//�迭������ �迭 �ȿ� �迭�� �����Ǹ鼭 �⺻���� ����. int �� 0, ��üŸ���� null. 
			//�迭 �ȿ� �����Ͱ� �ִ��� �������� Ȯ���ؾ��Ѵ�. ���°���� ���ִ��� Ȯ���ؾ��ϰ� �� ���� ��ġ�� ���¸� �־���Ѵ�.
			
			for(int i = 0 ; i <= accountArray.length ; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newAccount;
					break;
				}
				
			}
		}
		
		private static void accountList() {
			System.out.println("----------");
			System.out.println("���¸��");
			System.out.println("----------");
			
			for(Account acc : accountArray) {
				if(acc != null) {
					System.out.println(acc.getAno() + " " + acc.getOwner() + " " + acc.getBalance()); //private �ϴϱ� getter setter ����ؾ��� //�ѻ���� ���������� ����� �� �ֵ�.
				}
			}
		}
		
		private static void deposit() {
			System.out.println("----------");
			System.out.println("����");
			System.out.println("----------");
			
			System.out.println("���¹�ȣ:");
			String ano = scanner.next();
			
			System.out.println("���ݾ�:");
			int money = scanner.nextInt();
			
			Account account = findAccount(ano); //���¹�ȣ�� �޾Ƽ� �迭�� �ִ� ��ü�߿� �� ���¹�ȣ�� �ִ� ��ü�� ������ return �Ѵ�. ����ϱ� Ǧ�ϰ� ������ ����������
			if(account == null) {
				System.out.println("���°� �������� ����");
				
			}else {
				account.setBalance(account.getBalance() + money); //������ �ܰ�(balance)�� �߰��� ���ָ� �Ա��� �Ϸ�ȴ�.money //�߰��� �ִ� �ݾ��� �߰��� �ȵȴ�. �׷��� account.getBalance()+money �� �ؾ��Ѵ�.
				System.out.println("���:���ݼ���");
			}
		}
		
		private static void withdraw() {
			
			System.out.println("----------");
			System.out.println("���");
			System.out.println("----------");
			
			System.out.println("���¹�ȣ:");
			String ano = scanner.next();
			
			System.out.println("��ݾ�:");
			int money = scanner.nextInt();
			
			Account account = findAccount(ano); 
			if(account == null) {
				System.out.println("���°� �������� ����");
				
			}else {
				account.setBalance(account.getBalance() - money); //������ �ܰ�(balance)�� �߰��� ���ָ� �Ա��� �Ϸ�ȴ�.money //�߰��� �ִ� �ݾ��� �߰��� �ȵȴ�. �׷��� account.getBalance()+money �� �ؾ��Ѵ�.
				System.out.println("���:��ݼ���");
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
			System.out.println("������ü");
			System.out.println("----------");
			
			System.out.println("���¹�ȣ:");
			String ano = scanner.next();
			
			
			System.out.println("��ü�� ���¹�ȣ");
			String transfer = scanner.next();

			Account my_acc = findAccount(ano);
			Account to_acc = findAccount(transfer);
			
			if(my_acc == null || to_acc==null) {
				System.out.println("���°� �������� ����");
				
			}else {

				System.out.println("��ü��:");
				int money = scanner.nextInt();
				my_acc.setBalance(my_acc.getBalance() - money);
				to_acc.setBalance(to_acc.getBalance() - money);
				System.out.println("���:��ݼ���");
			}
		}

	}


