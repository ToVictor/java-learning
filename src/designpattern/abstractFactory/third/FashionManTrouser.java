package designpattern.abstractFactory.third;

/**
 * 具体产品
 * 时尚男装裤子
 */
public class FashionManTrouser extends AbstractTrouser {

	@Override
	String getSex() {
		return "男性";
	}

	@Override
	String getStyle() {
		return "时尚";
	}

}
