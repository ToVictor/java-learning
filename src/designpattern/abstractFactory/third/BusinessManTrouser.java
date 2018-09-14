package designpattern.abstractFactory.third;

/**
 * 具体产品角色
 * 商务男士套装裤子
 */
public class BusinessManTrouser extends AbstractTrouser {

	@Override
	String getSex() {
		return "男性";
	}

	@Override
	String getStyle() {
		return "商务";
	}

}
