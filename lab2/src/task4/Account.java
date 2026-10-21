package task4;

public class Account {
	private double balance;
	private int accNumber;
	public Account(int a) {
		balance=0.0;
		accNumber=a;
	}
	public void deposit(double sum) {
		balance+=sum;
	}
	public void withdraw(double sum) {
		if(balance>=sum) {
			balance-=sum;
		}
		else {
			System.out.println("Insuffiecient amount");
			
		}
	}
	public double getBalance() {
		return balance;
	}
	public double getAccountNumber() {
		return accNumber;
	}
	public void transfer(double amount,Account other) {
		if(this.balance>=amount) {
			this.withdraw(amount);
			other.deposit(amount);
			
		}
		else {
			System.out.println(("Inefficient ammount"));
	}
	}
	public String toString() {
		return accNumber+" "+balance;
	}
	public final void print() {
		System.out.println(toString());
	}

}
