package think.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MissingNotifySignal {
	private static boolean flag = true;
	
	public static void main(String[] args) {
		final MissingNotifySignal obj = new MissingNotifySignal();
		
		Runnable r1 = new Runnable(){
			@Override
			public void run() {
				System.out.println("进入r1……");
				synchronized (obj) {
					flag = false;
					obj.notifyAll();
					System.out.println("notifyAll……");
				}
			}
		};
		
		Runnable r2 = new Runnable(){
			@Override
			public void run() {
				while(flag){
					System.out.println("进入r2……");
					Thread.yield(); // 在这个地点，任务1已经发送过notifyAll信号
					synchronized (obj) {
						try {
							obj.wait();
						} catch (InterruptedException e) {
						}
					}
				}
				System.out.println("r2结束……");
			}
		};
		
		Runnable r3 = new Runnable(){
			@Override
			public void run() {
				synchronized (obj) {
					while(flag){
						System.out.println("进入r3……");
						Thread.yield(); // 即使线程调度让步，任务3依旧保留锁
						try {
							obj.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
				System.out.println("r3结束……");
			}
		};
		
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(r1);
		exec.execute(r2);
//		exec.execute(r3);
	}
}
