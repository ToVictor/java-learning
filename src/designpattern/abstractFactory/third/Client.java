package designpattern.abstractFactory.third;

public class Client {
	// 只需替换套装工厂类名
//	static String factoryName = "designpattern.abstractFactory.third.FashionWomanClothes";
//	static String factoryName = "designpattern.abstractFactory.third.FashionManClothes";
	static String factoryName = "designpattern.abstractFactory.third.BusinessManClothes";
	
	public static void main(String[] args) throws Exception {
		AbstractClothes factory = (AbstractClothes) Class.forName(factoryName).newInstance();
		Suit suit = new Suit(factory);
		suit.showMyClothes();
	}
}
