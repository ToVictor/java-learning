package think.chapter21;

import java.util.concurrent.TimeUnit;

public class Test {
	class Thread1 extends Thread{
		private Thread2 thread2;
		public Thread1(Thread2 thread2){
			this.thread2 = thread2;
		}
		@Override
		public void run() {
			System.out.println("enter 线程一");
			synchronized (thread2) {
				try {
					long start = System.currentTimeMillis();
					System.out.println("wait thread2 begin...");
					thread2.wait();
					System.out.println("thread2 wait over, cost "+(System.currentTimeMillis()-start)/1000+"秒");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	class Thread2 extends Thread{
		
		@Override
		public void run() {
			System.out.println("enter 线程二");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
	    Thread2 thread2 = test.new Thread2();
	    Thread1 thread1 = test.new Thread1(thread2);
	    thread1.start();
	    thread2.start();
	}
}
