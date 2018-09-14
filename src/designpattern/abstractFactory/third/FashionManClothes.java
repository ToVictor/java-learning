package designpattern.abstractFactory.third;

/**
 * 具体工厂角色
 * 时尚男装工厂
 */
public class FashionManClothes extends AbstractClothes {

	@Override
	AbstractCoat createCoat() {
		return new FashionManCoat();
	}

	@Override
	AbstractTrouser createTrouser() {
		return new FashionManTrouser();
	}

}
