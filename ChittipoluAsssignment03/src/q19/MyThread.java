package q19;


	public class MyThread extends Thread{
		 public void run()
		 {
		  System.out.println("Thread started running..");
		 }
		 public static void main( String args[] )
		 {
			MyThread mt = new  MyThread();
		  	mt.start();
		 }
	}



