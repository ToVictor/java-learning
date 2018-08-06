package designpattern.chapter01;

public class OperationAdd extends Operation2 {

	@Override
	public double getResult() {
		return getNumberA()+getNumberB();
	}

}
