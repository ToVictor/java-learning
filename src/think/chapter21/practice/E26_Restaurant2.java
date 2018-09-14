package think.chapter21.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class E26_Restaurant2 {
	public static void main(String[] args){
		new Restaurant2();
	}
}
class Meal{
	private final int orderNum;
	public Meal(int orderNum){
		this.orderNum = orderNum;
	}
	public String toString(){
		return "Meal "+orderNum;
	}
}
class WaitPerson2 implements Runnable{
	private Restaurant2 restaurant;
	boolean notified;
	public WaitPerson2(Restaurant2 restaurant){
		this.restaurant = restaurant;
	}
	
	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					while (restaurant.meal == null) {
						wait(); // 等待Chef厨师做菜
					}
				}
				System.out.println("WaitPerson got " + restaurant.meal);
				synchronized (restaurant.busBoy) {
					restaurant.busBoy.notified = true;
					restaurant.busBoy.meal = restaurant.meal;
					restaurant.busBoy.notifyAll();
				}
				synchronized(restaurant.chef){
					restaurant.meal = null;
					restaurant.chef.notifyAll();
				}
				synchronized(this){
					if(!notified){
						wait();// 等待BusBoy清理
					}
					notified = false;
				}
			}
		} catch (InterruptedException e) {
			System.out.println("WaitPerson interrupted");
		}
	}
}
class BusBoy implements Runnable{
	private Restaurant2 restaurant;
	boolean notified;
	volatile Meal meal;
	
	public BusBoy(Restaurant2 restaurant){
		this.restaurant = restaurant;
	}
	
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()){
				synchronized(this){
					if(!notified){
						wait();
					}
					notified = false;
				}
				System.out.println("BusBoy cleaned up " + meal);
				synchronized(restaurant.waitPerson){
					restaurant.waitPerson.notified = true;
					restaurant.waitPerson.notifyAll();
				}
			}
		} catch(InterruptedException e) {
			System.out.println("BusBoy interrupted");
		}
	}
	
}
class Chef2 implements Runnable{
	private Restaurant2 restaurant;
	private int count = 0;
	public Chef2(Restaurant2 restaurant){
		this.restaurant = restaurant;
	}
	
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()){
				synchronized(this){
					while(restaurant.meal != null){
						wait();
					}
				}
				if(++count == 10){
					System.out.println("没有食物了，关门啦……");
					restaurant.exec.shutdownNow();
					//return;
				}
				System.out.println("Order up!");
				synchronized(restaurant.waitPerson){
					restaurant.meal = new Meal(count);
					restaurant.waitPerson.notifyAll();
				}
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch(InterruptedException e) {
			System.out.println("Chef interrupted");
		}
	}
	
}
class Restaurant2{
	Meal meal;
	ExecutorService exec = Executors.newCachedThreadPool();
	WaitPerson2 waitPerson = new WaitPerson2(this);
	BusBoy busBoy = new BusBoy(this);
	Chef2 chef = new Chef2(this);
	public Restaurant2(){
		exec.execute(chef);
		exec.execute(waitPerson);
		exec.execute(busBoy);
	}
}

