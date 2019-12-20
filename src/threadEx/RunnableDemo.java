package threadEx;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj1=new Hi();
		Runnable obj2=new Hello();
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		t1.setName("hi thread");
		t2.setName("hello thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try {Thread.sleep(10);}catch (Exception e) {}
		
		
		System.out.println(t1.isAlive());
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("bye");
	}
}
