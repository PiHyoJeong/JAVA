package JAVA_no19;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		
		account.setBalance(100);
		System.out.println(account.getBalance()); //100
		
		account.setBalance(-100);
		System.out.println(account.getBalance()); //�ݾ��� Ȯ���ϼ��� 100
		
		
		account.setBalance(30000);
		System.out.println(account.getBalance()); //30000

	}

}
