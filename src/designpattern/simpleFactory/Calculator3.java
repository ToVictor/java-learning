package designpattern.simpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator3 {
	public static void main(String[] args) {
		try {
			System.out.println("开始控制台版计算器……");
			String continueFlag = null;
			while(!"Exit".equals(continueFlag)){
				System.out.println("请输入数字A：");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String strNumberA = reader.readLine();
				System.out.println("请输入运算符：");
				String operation = reader.readLine();
				System.out.println("请输入数字B：");
				String strNumberB = reader.readLine();
				
				Operation2 oper = OperationFactory.createOperation(operation);
				oper.setNumberA(Double.parseDouble(strNumberA));
				oper.setNumberB(Double.parseDouble(strNumberB));
				Double result = oper.getResult();
				System.out.println("结果为："+result);
				System.out.println("输入Exit结束计算，其它任意键继续计算：");
				continueFlag = reader.readLine();
			}
		} catch(Exception e) {
			System.out.println("输入有误:"+e);
		}
	}
}
