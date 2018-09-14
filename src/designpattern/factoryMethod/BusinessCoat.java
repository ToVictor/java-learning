package designpattern.factoryMethod;

/**
 * 具体产品
 * 商务上衣
 */
public class BusinessCoat implements ICoat {

	@Override
	public void showCoat() {
		System.out.println("这是商务上衣");
	}

}
