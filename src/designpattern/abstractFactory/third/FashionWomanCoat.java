package designpattern.abstractFactory.third;

/**
 * 具体产品角色
 * 时尚女装上衣
 */
public class FashionWomanCoat extends AbstractCoat {

	@Override
	String getSex() {
		return "女性";
	}

	@Override
	String getStyle() {
		return "时尚";
	}

}
