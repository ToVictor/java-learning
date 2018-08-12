package designpattern.decorator;

public class ConcreteDecoratorA extends Decorator {

	@Override
	public void operation() {
		super.operation();
		methodA();
	}
	
	public void methodA(){
		System.out.println("methodA……");
	}
}
