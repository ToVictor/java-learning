package designpattern.proxy;

/**
 * 追求者的代理类，因此和追求者有同样的接口
 *
 */
public class Proxy implements GiveGift {
	Pursuit gg;
	
	public Proxy(SchoolGirl mm){
		gg = new Pursuit(mm);
	}
	
	@Override
	public void giveDolls() {
		gg.giveDolls();
	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}

}
