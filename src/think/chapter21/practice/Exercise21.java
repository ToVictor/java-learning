package think.chapter21.practice;

import java.util.concurrent.TimeUnit;

public class Exercise21 {
	public static void main(String[] args) {
		SecondTask run = new SecondTask();
		new Thread(run).start();
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		new Thread(new FirstTask(run)).start();
		System.out.println("main()方法结束");
	}
}
class FirstTask implements Runnable{
	private Runnable run;
	public FirstTask(Runnable run){
		this.run = run;
	}
	
	@Override
	public void run() {
		try {
			synchronized (run) {
				TimeUnit.SECONDS.sleep(10);
				System.out.println("FirstTask执行……");
				run.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
class SecondTask implements Runnable{
	@Override
	public void run() {
		try {
			synchronized (this) {
				wait();
				System.out.println("SecondTask被唤醒了……");
				System.out.println("SecondTask开始执行任务……");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

