package designpattern.factoryMethod;

/**
 * 具体工厂角色
 * 商务上衣工厂
 */
public class BusinessFactory implements IFactory {

	@Override
	public ICoat createCoat() {
		return new BusinessCoat();
	}

}
