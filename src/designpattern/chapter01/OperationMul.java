package designpattern.chapter01;

public class OperationMul extends Operation2 {

	@Override
	public double getResult() {
		return getNumberA()*getNumberB();
	}

}
