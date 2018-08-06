package designpattern.chapter01;

public class OperationFactory {
	public static Operation2 createOperation(String operate){
		Operation2 oper = null;
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
