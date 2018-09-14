package designpattern.abstractFactory.third;

/**
 * 具体工厂角色
 * 商务男士套装
 */
public class BusinessManClothes extends AbstractClothes {

	@Override
	AbstractCoat createCoat() {
		return new BusinessManCoat();
	}

	@Override
	AbstractTrouser createTrouser() {
		return new BusinessManTrouser();
	}

}
