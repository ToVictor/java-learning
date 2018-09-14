package designpattern.factoryMethod;

/**
 * 具体工厂角色
 * 时尚上衣工厂
 */
public class FashionFactory implements IFactory {

	@Override
	public ICoat createCoat() {
		return new FashionCoat();
	}

}
