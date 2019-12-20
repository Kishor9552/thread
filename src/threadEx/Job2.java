package threadEx;

public class Job2 extends Thread {
	@Override
	public void run() {
		System.out.println("thread name job2>>"+ Thread.currentThread().getName());
		super.run();
	} }


