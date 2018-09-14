package designpattern.template;

public abstract class AbstractClass {
	// 抽象行为，放到子类去实现
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	// 模板方法，定义逻辑的骨架
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("模板代码……");
	}
}
