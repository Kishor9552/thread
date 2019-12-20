package threadEx;

public class SumAvgTrigger {

	public static void main(String[] args) throws InterruptedException {
		SumJob sj=new SumJob();
		sj.start();
		//Thread.sleep(1500);
		sj.join();
		//sj.wait(1500);
		//sj.notify();
		AvgJob av=new AvgJob();
		av.start();
		

	}

}
