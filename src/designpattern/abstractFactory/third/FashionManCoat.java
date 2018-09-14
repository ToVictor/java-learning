package designpattern.abstractFactory.third;

/**
 * 具体产品
 * 时尚男装上衣
 */
public class FashionManCoat extends AbstractCoat {

	@Override
	String getSex() {
		return "男性";
	}

	@Override
	String getStyle() {
		return "时尚";
	}

}
