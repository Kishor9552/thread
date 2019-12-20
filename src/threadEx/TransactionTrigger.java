package threadEx;

public class TransactionTrigger {

	public static void main(String[] args) {
		Transaction tt1=new Transaction();
		tt1.setName("Amazon...");
		tt1.start();
		Transaction tt2=new Transaction();
		tt2.setName("Flipcart...");
		tt2.start();


	}

}
