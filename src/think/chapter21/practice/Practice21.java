package think.chapter21.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Practice21 {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool();
		RunnableA task = new RunnableA();
		exec.execute(task);
		exec.execute(new RunnableB(task));
		TimeUnit.SECONDS.sleep(8);
		exec.shutdownNow();
	}
}
class RunnableA implements Runnable{
	@Override
	public void run() {
		
		synchronized (this) {
			try {
				wait();
				System.out.println("wait之后");
			} catch (InterruptedException e) {
			}
		}
	}
}
class RunnableB implements Runnable{
	private Runnable r;
	public RunnableB(Runnable r){
		this.r = r;
	}
	
	@Override
	public void run() {
		synchronized (r) {
			try {
				System.out.println("进入RunnableB");
				TimeUnit.SECONDS.sleep(5);
				System.out.println("RunnableB休眠5秒");
				r.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}




