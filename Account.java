package JAVA_no19;

public class Account {
	
	final int min_balance = 0;
	final int max_balance = 1000000;
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance < min_balance || balance > max_balance) {
			System.out.println("check your amounts");
			return;
		}else {
			this.balance = balance;
		}
		
	}
	
	
	
}
