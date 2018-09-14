package designpattern.proxy;

public class ProxyDemo {
	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("娇娇");
		
		// girl不认识pursuit追求者，但通过代理proxy可以收到礼物
		Proxy proxy = new Proxy(girl);
		proxy.giveDolls();
		proxy.giveFlowers();
		proxy.giveChocolate();
	}
}
