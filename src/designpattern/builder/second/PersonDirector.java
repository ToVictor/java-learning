package designpattern.builder.second;

/**
 * 构建人物的指挥者类
 *
 */
public class PersonDirector {
	private PersonBuilder builder;
	
	public PersonDirector(PersonBuilder builder){
		this.builder = builder;
	}
	
	// 创建人物的步骤在指挥者类中就指定了
	public void createPerson(){
		builder.buildHead();
		builder.buildBody();
		builder.buildArmLeft();
		builder.buildArmRight();
		builder.buildLegLeft();
		builder.buildLegRight();
	}
}
