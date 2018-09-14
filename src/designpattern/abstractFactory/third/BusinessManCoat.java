package designpattern.abstractFactory.third;

/**
 * 具体产品角色
 * 商务男士套装上衣
 */
public class BusinessManCoat extends AbstractCoat {

	@Override
	String getSex() {
		return "男性";
	}

	@Override
	String getStyle() {
		return "商务";
	}

}
