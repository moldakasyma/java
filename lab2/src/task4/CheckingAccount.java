package task4;

public class CheckingAccount extends Account {
	private int count;
	private int freeTransaction;
	
	public CheckingAccount(int accNumber,int freeTransaction ) {
		super(accNumber);
		this.count=0;
		this.freeTransaction=freeTransaction;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		count++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		count++;
	}
	public void deductFee() {
	
		int totalTransactions = count - freeTransaction;
		if (totalTransactions > 0) {
			double fee = 0.02 * totalTransactions;
			if (fee > 0) {
			        withdraw(fee);
			}
		}
		
	
	}
	public String toString() {
		return super.toString();
	}
}
