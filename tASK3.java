package org.metho;

public class tASK3 {
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	tASK3(){
		balance=10000;
	}
public void deposit(int amount) {
	if(amount >0) {
		balance += amount;
		System.out.println("After deposit:" +balance);
	}
	else {
		System.out.println("Invalid");
	}
}
/*	public static void main(String[] args) {
		tASK3 T = new tASK3();
		T.deposit(5000);
		

	}
*/
}
