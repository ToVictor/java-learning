package designpattern.chapter01;

public abstract class Operation2 {
	private double numberA;
	private double numberB;
	
	public abstract double getResult();
	
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
}
