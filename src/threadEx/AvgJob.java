package threadEx;

public class AvgJob extends Thread{
	@Override
	public void run() {
		SumJob sj=new SumJob();
		int avg=sj.sum/10;
		System.out.println("avg>>"+avg);
		
	}

}
