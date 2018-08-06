package designpattern.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 控制台版本计算器
 *
 */
public class Calculator {
	public static void main(String[] args) throws IOException {
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
				
				Double result = null;
				switch(operation){
				case "+":
					result = Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB);
					break;
				case "-":
					result = Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB);
					break;
				case "*":
					result = Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB);
					break;
				case "/":
					Double doubleNumberB = Double.parseDouble(strNumberB);
					if(doubleNumberB == 0){
						System.out.println("除数不能为0！");
					}else{
						result = Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB);
					}
					break;
				}
				System.out.println("结果为："+result);
				System.out.println("输入Exit结束计算，其它任意键继续计算：");
				continueFlag = reader.readLine();
			}
		} catch(Exception e) {
			System.out.println("输入有误:"+e);
		}
	}
}
