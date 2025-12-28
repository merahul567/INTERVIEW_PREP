package com.kumar.interview.solid.dip;

public class ShoppingMall {

	private DebitCard debitCard;
	
	//Lot of change needed if we want to use credit card
	private CreditCard creditCard;
	
	private BankCard bankCard;
	
//	public ShoppingMall(DebitCard debitCard) {
//		this.debitCard = debitCard;
//	}
	
//	public ShoppingMall(CreditCard creditCard) {
//		this.creditCard = creditCard;
//	}
	
	//To support SOLID
	public ShoppingMall(BankCard bankCard) {
	this.bankCard = bankCard;
}
	
	
//	public void doPurchaseSomething(long amount) {
//		debitCard.doTransaction(amount);
//	}
	
//	public void doPurchaseSomething(long amount) {
//		creditCard.doTransaction(amount);
//	}
	
	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String [] args) {
		//DebitCard debitCard = new DebitCard();
		//CreditCard cardiCard = new CreditCard();
		
//		BankCard bankCard = new DebitCard();
		BankCard bankCard = new CreditCard();
		
		//Tightly coupled with Debit Card
		//ShoppingMall shoppingMall = new ShoppingMall(cardiCard);
		
		//No it follow SOLID
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(100);
	}
}
