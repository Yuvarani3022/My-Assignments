package week4.day1;

public class PaymentExecutor {
	    public static void main(String[] args) {
	        Amazon amazon = new Amazon();
	        amazon.cashOnDelivery();
	        amazon.cashOnPickup();
	        amazon.cardPayment("Credit Card");
	        amazon.netBanking();
	        amazon.recordPaymentDetails();
	    }
	}

