package threadEx;

public class Hi implements Runnable{
	public void run(){
		for(int i =1;i<=5;i++) {
			System.out.println("hi     "+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
				
			}
			catch (Exception e) {	
			}
		}
	}
}

class Hello implements Runnable{
public void run(){
		for(int i =1;i<=5;i++) {
			System.out.println("hello    "+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
				
			}
			catch (Exception e) {
				
			}		
		}
	}
}

 


