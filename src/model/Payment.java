package model;
/*
 * Payment. Holds data of customers credit card info and transfer info. 
 * it can also make payments.
 */
public class Payment {
	int amount=0;

	private Boolean verifyCreditCardInfo;

	private Boolean paymentTransfereInfo;
	/**
	 * confirms credit card validity
	 * @return true if card is valid
	 */
	public boolean creditCardInfo(){
		if(verifyCreditCardInfo == true){

			System.out.println("Credit card verified: ");
			return false;
		}return true;
	}
	/**
	 * 
	 * @param paymentTransfereInfo
	 * @return true if payment transfere is successfull 
	 */
	public boolean transfereInfo(Boolean paymentTransfereInfo){
		if(paymentTransfereInfo = true){
			System.out.println("Payment Transfer succcessfull: ");
			return true;
		}
		return false;
	}
	/**
	 *  A constructor of the payment calss
	 * @param verifyCreditCardInfo
	 * @param paymentTransfereInfo
	 */
	public Payment(Boolean verifyCreditCardInfo, Boolean paymentTransfereInfo){
		this.paymentTransfereInfo = paymentTransfereInfo;
		this.verifyCreditCardInfo = verifyCreditCardInfo;
	}
}
