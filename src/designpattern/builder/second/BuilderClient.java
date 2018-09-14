package designpattern.builder.second;

public class BuilderClient {
	public static void main(String[] args) {
		// 客户端只需要选择不同类型的构造模式，交给指挥者即可
		PersonThinBuilder thin = new PersonThinBuilder();
		PersonDirector director = new PersonDirector(thin);
		director.createPerson();
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		
		PersonFatBuilder fat = new PersonFatBuilder();
		director = new PersonDirector(fat);
		director.createPerson();
	}
}
