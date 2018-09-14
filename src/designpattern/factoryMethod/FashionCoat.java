package designpattern.factoryMethod;

/**
 * 具体产品
 * 时尚上衣
 */
public class FashionCoat implements ICoat {

	@Override
	public void showCoat() {
		System.out.println("这是时尚上衣");
	}

}
