package task4;

public class SavingAccount extends Account {
	double interestRate;
	int time;
	public SavingAccount(int accNumber,double interestRate,int time) {
		super(accNumber);
		this.interestRate=interestRate;
		this.time=time;
	}
	public void addInterest() {
		double interest=getBalance()*(interestRate/100)*time;
		deposit(interest);
	}
	public String toString() {
		return super.toString();
	}

}
