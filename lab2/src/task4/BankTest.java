package task4;

public class BankTest {

	public static void main(String[] args) {
		Bank bank=new Bank();
		SavingAccount savingAccount=new SavingAccount(1,4,1);
		CheckingAccount checkingAccount=new CheckingAccount(2,5);
		
		bank.openAccount(savingAccount);
		bank.openAccount(checkingAccount);
		
		savingAccount.deposit(100000);

		checkingAccount.deposit(10000);	
		savingAccount.transfer(16000, checkingAccount);
		checkingAccount.deposit(1500);
		checkingAccount.deposit(2500);
		checkingAccount.deposit(1500000);
		checkingAccount.deposit(1500);
		
		bank.update();
		
		for(Account account:bank.accounts) {
			System.out.println(account);
			
		}
		
			
		

	}

}
