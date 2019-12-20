package threadEx;

public class JobRunnableTrigger {

	public static void main(String[] args) {
		JobRunnable jr=new JobRunnable();
		Thread tt=new Thread(jr);
		tt.start();

	}

}
