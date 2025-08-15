package week4.day1;

public abstract class CanaraBank implements Payments {
	    public abstract void recordPaymentDetails();
	    
	    @Override
	    public void cashOnDelivery() {
	        System.out.println("Cash on delivery");
	    }
	    
	    @Override
	    public void cashOnPickup() {
	        System.out.println("Cash on pickup");
	    }
	    
	    @Override
	    public void cardPayment(String cardType) {
	        System.out.println("Card payment using " + cardType);
	    }
	    
	    @Override
	    public void netBanking() {
	        System.out.println("Net banking");
	    }
	}

