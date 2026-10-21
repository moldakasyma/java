package task4;

import java.util.Vector;

public class Bank {
		Vector<Account> accounts;
		public Bank() {
			accounts=new Vector<>();
		}
		public void openAccount(Account account) {
			accounts.add(account);
			
		}
		public void closeAccount(Account account) {
			accounts.remove(account);
		}
		
		public void update() {
			for(Account account:accounts) {
				if(account instanceof SavingAccount) {
					SavingAccount savingAccount=(SavingAccount) account;
					savingAccount.addInterest();
				}
				else if(account instanceof CheckingAccount) {
					CheckingAccount checkingAccount=(CheckingAccount) account;
					checkingAccount.deductFee();
					
				}
			}

	}

}
