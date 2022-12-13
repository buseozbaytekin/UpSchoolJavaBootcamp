package HomeworksChapter11;

public class Account {
	
	double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double withDraw(double amount) {
		System.out.println("Withdraw is processing");
		return balance += amount;
		
	}
	
	public double depositAccount(double amount) {
		System.out.println("Payment is processing");
		return balance -= amount;
		
	}
	
	public double Transfer(double transfer, AccountClient client ) {
		double transferPayment = 0;
		client.setBalance(client.getBalance() + transfer);
		
		if(transfer < 1000) {
			transferPayment = 2.54;
		} else {
			transferPayment = transfer * (2.54 / 100);
		}
		
		balance -= (transferPayment + transfer);
		
		return transferPayment;
	}
}
