package designpattern.factoryMethod;

/**
 * 抽象工厂角色
 * 只需要定义一个创建产品的接口方法即可
 */
public interface IFactory {
	ICoat createCoat();
}
