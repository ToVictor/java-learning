package designpattern.simpleFactory;

public class OperationAdd extends Operation2 {

	@Override
	public double getResult() {
		return getNumberA()+getNumberB();
	}

}
