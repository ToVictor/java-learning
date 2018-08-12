package designpattern.decorator;

public class Test {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		ConcreteDecoratorA a = new ConcreteDecoratorA();
		ConcreteDecoratorB b = new ConcreteDecoratorB();
		
		a.setComponent(component);
		b.setComponent(a);
		b.operation();
		
	}
}
