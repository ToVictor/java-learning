package designpattern.simpleFactory;

public class OperationDiv extends Operation2 {

	@Override
	public double getResult() {
		if(getNumberB() == 0){
			throw new RuntimeException("除数不能为0");
		}
		
		return getNumberA()/getNumberB();
	}

}
