package entities;

public class BankAccount {
	
		private int accountNumber;
		private String name;
		private double accountBalance;
		
		public BankAccount(int accountNumber, String name, double accountBalance) {
			this.accountNumber = accountNumber;
			this.name = name;
			this.accountBalance = accountBalance;
		}
		
		public BankAccount(int accountNumber, String name) {
			this.accountNumber = accountNumber;
			this.name = name;
		}
		
		public int getAccoutNumber() {
			return accountNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double accountBalance() {
			return accountBalance;
		}

		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		
		public String toString() {
			return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", accountBalance);
		}
}
