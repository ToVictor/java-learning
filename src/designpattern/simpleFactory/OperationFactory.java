package designpattern.simpleFactory;

public class OperationFactory {
	public static Operation2 createOperation(String operate){
		Operation2 oper = null;//Operation2是运算类接口，是具体运算类的共同接口
		switch(operate){
			case "+":
				oper = new OperationAdd();
				break;
			case "-":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OperationDiv();
				break;
		}
		
		return oper;
	}
}
