package designpattern.simpleFactory;

public class OperationMul extends Operation2 {

	@Override
	public double getResult() {
		return getNumberA()*getNumberB();
	}

}
