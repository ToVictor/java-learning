package think.chapter21.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class E22_WaitNotify {
	public static void main(String[] args) throws InterruptedException {
		final Runnable r1 = new Runnable(){
			@Override
			public void run() {
				for(;;){
					try {
						TimeUnit.MICROSECONDS.sleep(10);
						synchronized (this) {
							notify();
						}
					} catch (InterruptedException e) {
						return;
					}
				}
			}
			
		};
		
		Runnable r2 = new Runnable(){
			@Override
			public void run() {
				for(;;){
					try{
						synchronized (r1) {
							r1.wait();
						}
						System.out.println("Cycled");
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		};
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(r1);
		exec.execute(r2);
		TimeUnit.SECONDS.sleep(5);
		exec.shutdownNow();
	}
}
