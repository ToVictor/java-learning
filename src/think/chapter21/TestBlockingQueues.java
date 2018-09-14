package think.chapter21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class TestBlockingQueues {
	static void getkey(){
		try {
			new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	static void getkey(String message){
		System.out.print(message);
		getkey();
	}
	static void test(String msg, BlockingQueue<LiftOff> queue){
		System.out.print(msg);
		LiftOffRunner runner = new LiftOffRunner(queue);
		Thread t = new Thread(runner);
		t.start();
		for(int i=0; i<5; i++){
			runner.add(new LiftOff(5));
		}
		getkey("Press 'Enter' ("+msg+")");
		t.interrupt();
		System.out.println("Finished " + msg + " test");
	}
	public static void main(String[] args){
		test("LinkedBlockingQueue", new LinkedBlockingQueue<LiftOff>());
		test("ArrayBlockingQueue", new ArrayBlockingQueue<LiftOff>(3));
		test("SynchronousQueue", new SynchronousQueue<LiftOff>());
	}
	
	
}
class LiftOffRunner implements Runnable{
	private BlockingQueue<LiftOff> rockets;
	public LiftOffRunner(BlockingQueue<LiftOff> rockets){
		this.rockets = rockets;
	}
	public void add(LiftOff lo){
		try {
			rockets.put(lo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				LiftOff rocket = rockets.take();
				rocket.run();// 只运行其run方法，而不是新创建一个线程执行
			}
			
		}catch(InterruptedException e){
			System.out.println("Waking from take()");
		}
		System.out.println("Exiting LiftRunner");
	}
	
}
