package threadEx;

public class SumJob extends Thread {
	static int sum=0;
	@Override
	public void run() {
	for(int i=0;i<100000;i++) {
		sum=sum+i;
		
	}
	System.out.println("Toatal sum is>>"+ sum);
	
	}

}
