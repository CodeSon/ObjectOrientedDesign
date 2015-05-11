package model;
/*
 * Payment. Holds data of customers creditcardinfo and transferinfo. 
 * it can also make payments.
 */
public class Payment {
	int amount=0;

	private Boolean verifyCreditCardInfo;

	private Boolean paymentTransfereInfo;

	public boolean creditCardInfo(){
		if(verifyCreditCardInfo == true){

			System.out.println("Credit card verified: ");
			return false;
		}return true;

	}
	public boolean transfereInfo(Boolean paymentTransfereInfo){
		if(paymentTransfereInfo = true){
			System.out.println("Payment Transfer succcessfull: ");
			return true;
		}
		return false;

	}
	public Payment(Boolean verifyCreditCardInfo, Boolean paymentTransfereInfo){
		this.paymentTransfereInfo = paymentTransfereInfo;
		this.verifyCreditCardInfo = verifyCreditCardInfo;
	}


	public Payment(){

	}

}
