package designpattern.chapter01;

public class OperationSub extends Operation2 {

	@Override
	public double getResult() {
		return getNumberA()-getNumberB();
	}

}
