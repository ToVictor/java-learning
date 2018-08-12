package designpattern.simpleFactory;

public class OperationSub extends Operation2 {

	@Override
	public double getResult() {
		return getNumberA()-getNumberB();
	}

}
