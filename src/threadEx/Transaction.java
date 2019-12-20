package threadEx;

public class Transaction extends Thread {
	static int balance=1000;
	@Override
	public void run() {
	for(int i=0;i<10;i++) {
		withdraw (150);
		
	}
	
	}
	static synchronized private void withdraw(int amt) {
		System.out.println("trying to withdraw>>"+Thread.currentThread().getName());
		try {Thread.sleep(500);
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		if (balance>200) {
			balance=balance-amt;
			System.out.println("balance remained in bank>>"+balance);
		}else
			System.out.println("insuff balance");
	}
		

	}


