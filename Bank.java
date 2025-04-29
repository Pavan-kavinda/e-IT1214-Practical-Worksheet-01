class BankAccount {
	private String accountHolderName;
	private double balance;

	public void deposit(double amount) { 
		
		if (amount > 0){
			balance = balance + amount;
		} 
		else{
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amount) {
		
		if( amount <= balance){
			
			balance = balance-amount;
			System.out.println("withdraw successfull");
		}
		else{
			System.out.println("invalid amount to withdraw");
		}
		
	}
	public void displayBalance() {
		
		System.out.println("Account holder name is: "+accountHolderName);
		System.out.println("current balance is: "+balance);
	
	}
}
