package designpattern.strategy;

/**
 * Context与简单工厂模式结合使用
 * 
 */
public class ContextWithSimpleFactory {
	Strategy strategy;
	
	public ContextWithSimpleFactory(String type){
		switch(type){
			case "A":
				strategy = new ConcreteStrategyA();
				break;
			case "B":
				strategy = new ConcreteStrategyB();
				break;
			case "C":
				strategy = new ConcreteStrategyC();
				break;
		}
	}
	
	public void contextInterface(){
		strategy.algorithmInterface();
	}
}
