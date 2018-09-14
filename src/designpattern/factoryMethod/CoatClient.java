package designpattern.factoryMethod;

public class CoatClient {
	// 工厂类的类名可以保存在配置文件中，这样可以不改动客户端代码，
	// 当需要新产品时，增加新产品类、新产品工厂类，修改客户端的工厂类名即可
	static String factoryName = "designpattern.factoryMethod.BusinessFactory";
	
	public static void main(String[] args) throws Exception {
		IFactory factory = (IFactory) Class.forName(factoryName).newInstance();
		ICoat coat = factory.createCoat();
		coat.showCoat();
	}
}
