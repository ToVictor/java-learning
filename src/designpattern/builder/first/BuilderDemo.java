package designpattern.builder.first;

public class BuilderDemo {
	public static void main(String[] args) {
		PersonThinBuilder thinBuilder = new PersonThinBuilder();
		thinBuilder.build();
		
		System.out.println();
		System.out.println("------------------");
		System.out.println();
		
		PersonFatBuilder fatBuilder = new PersonFatBuilder();
		fatBuilder.build();
	}
}
