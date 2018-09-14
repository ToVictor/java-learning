package designpattern.abstractFactory.third;

/**
 * 具体产品角色
 * 时尚女装裤子
 */
public class FashionWomanTrouser extends AbstractTrouser {

	@Override
	String getSex() {
		return "女性";
	}

	@Override
	String getStyle() {
		return "时尚";
	}

}
