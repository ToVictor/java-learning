package designpattern.template;

public class TemplateClient {
	public static void main(String[] args) {
		AbstractClass a = new ConcreteClassA();
		a.templateMethod();
		
		AbstractClass b = new ConcreteClassB();
		b.templateMethod();
	}
}
