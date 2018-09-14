package designpattern.builder.second;

public class PersonFatBuilder extends PersonBuilder {

	@Override
	public void buildHead() {
		System.out.println("画胖子的头");
	}

	@Override
	public void buildBody() {
		System.out.println("画胖子的身体");
	}

	@Override
	public void buildArmLeft() {
		System.out.println("画胖子的左手");
	}

	@Override
	public void buildArmRight() {
		System.out.println("画胖子的右手");
	}

	@Override
	public void buildLegLeft() {
		System.out.println("画胖子的左脚");
	}

	@Override
	public void buildLegRight() {
		System.out.println("画胖子的右脚");
	}

}
