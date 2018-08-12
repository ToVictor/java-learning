package designpattern.decorator;

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		methodB();
	}
	
	public void methodB(){
		System.out.println("methodB……");
	}
	
}
