package think.chapter21.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Practice22 {
	public volatile boolean flag = false;
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		Practice22 obj = new Practice22();
		exec.execute(new RunnableA_22(obj));
		exec.execute(new RunnableB_22(obj));
	}
}
class RunnableA_22 implements Runnable{
	private Practice22 obj;
	public RunnableA_22(Practice22 obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(5);
			obj.flag = true;
			synchronized (obj) {
				obj.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class RunnableB_22 implements Runnable{
	private Practice22 obj;
	public RunnableB_22(Practice22 obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		System.out.println("开始时间："+start);
		while(true){//5001
			if(obj.flag){
				obj.flag = false;
				break;
			}
		}
		/*synchronized (obj) {
			if(!obj.flag){
				try {
					obj.wait();
				} catch (InterruptedException e) {
				}
			}
		}*/
		
		System.out.println("结束,共花费："+(System.currentTimeMillis() - start));
	}
}
