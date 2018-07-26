package think.chapter21;

import java.util.concurrent.TimeUnit;

public class Exercise22 {
	public static void main(String[] args) throws InterruptedException {
		Condition condition = new Condition();
		new Thread(new SecondTask2(condition)).start();
		TimeUnit.SECONDS.sleep(3);
		new Thread(new FirstTask2(condition)).start();
//		FirstTask2 f = new FirstTask2(condition);
//		SecondTask2 s = new SecondTask2(condition);
//		System.out.println(f.getConditionStr());
//		System.out.println(s.getConditionStr());
	}
}
class FirstTask2 implements Runnable{
	private Condition condition;
	public FirstTask2(Condition condition){
		this.condition = condition;
	}
	
	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(3);
			System.out.println("FirstTask执行……");
			condition.setFlag(true);
			TimeUnit.SECONDS.sleep(15);
			System.out.println("FirstTask执行完毕……");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getConditionStr(){
		return condition.toString();
	}
	
}
class SecondTask2 implements Runnable{
	private Condition condition;
	public SecondTask2(Condition condition){
		this.condition = condition;
	}
	
	@Override
	public void run() {
		System.out.println("SecondTask等待任务一执行完毕……");
		while(true){
			if(condition.getFlag()){
				System.out.println("SecondTask开始执行任务……");
				return;
			}/*else{
				System.out.println("SecondTask继续等待……");
			}*/
		}
	}
	
	public String getConditionStr(){
		return condition.toString();
	}
}
class Condition{
	private boolean flag;
	public Condition(){
		flag = false;
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	public boolean getFlag(){
		return this.flag;
	}
}

