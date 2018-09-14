package designpattern.abstractFactory.third;

/**
 * 具体工厂角色
 * 时尚女装工厂
 */
public class FashionWomanClothes extends AbstractClothes {

	@Override
	AbstractCoat createCoat() {
		return new FashionWomanCoat();
	}

	@Override
	AbstractTrouser createTrouser() {
		return new FashionWomanTrouser();
	}

}
