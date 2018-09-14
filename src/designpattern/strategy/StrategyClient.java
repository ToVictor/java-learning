package designpattern.strategy;

public class StrategyClient {
	public static void main(String[] args) {
		baseUse();
		useWithSimpleFactory();
	}
	
	public static void baseUse(){
		Context context = null;
		String type = "A";//根据type选择不同的策略
		switch(type){
			case "A":
				context = new Context(new ConcreteStrategyA());
				break;
			case "B":
				context = new Context(new ConcreteStrategyB());
				break;
			case "C":
				context = new Context(new ConcreteStrategyC());
				break;
		}
		context.contextInterface();
	}
	
	public static void useWithSimpleFactory(){
		// 选择具体算法的职责由客户端转移到Context对象，客户端代码更加清晰
		ContextWithSimpleFactory context = new ContextWithSimpleFactory("A");
		context.contextInterface();
	}
}
