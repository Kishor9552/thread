package threadEx;

public class Job1 extends Thread {
	@Override
	public void run() {
		System.out.println("thread name job>>"+ Thread.currentThread().getName());
		int i;
		for(i=0;i<10;i++)
		
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		System.out.println("in job>>"+i);
	
		
		
	}
	

	}
