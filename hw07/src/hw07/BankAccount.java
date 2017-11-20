package hw07;

class BankAccount {
	int accountNumber;
	String owner;
	int balance;
	
	void deposit (int amount) {
		balance = balance + amount;
	}
	void withdraw (int amount) {
		balance = balance - amount;
	}
	public String toString (){
		
		return "°èÁÂ¹øÈ£ : "+accountNumber+"\n°èÁÂÀÌ¸§ : "+owner+"\nÀÜ¾× : "+balance;
	}
}
	