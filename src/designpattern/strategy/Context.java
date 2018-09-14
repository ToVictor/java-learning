package designpattern.strategy;

/**
 * 使用具体的算法实现类配置，维护一个Strategy引用
 */
public class Context {
	Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	// Context的接口方法，实质上调用具体算法类的方法
	public void contextInterface(){
		strategy.algorithmInterface();
	}
}
