package threadEx;

public class Job1Trigger {

	public static void main(String[] args) {
		int i;                            
		
		for(i=10;i<20;i++)                                  
		System.out.println("in main 1>>"+i);

	
	Job1 jb =new Job1();
	jb.start(); 
	jb.setName("aaaa");
	System.out.println("thread name main>>"+ Thread.currentThread().getName());
	Job1 jb1 =new Job1();
	jb1.start();
	jb1.setName("cccc");
	Job2 jb2=new Job2();
	jb2.start();
	jb2.setName("bbbb");
	//System.out.println("thread name main>>"+ Thread.currentThread().getName());
	
	//for(i=21;i<30;i++) {
	//System.out.println("in main 2>>"+i);
	
}
}