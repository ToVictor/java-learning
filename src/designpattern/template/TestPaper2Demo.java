package designpattern.template;

public class TestPaper2Demo {
	public static void main(String[] args) {
		System.out.println("学生A的试卷……");
		TestPaper2 studentA = new TestPaper2A();
		studentA.testQuestion1();
		studentA.testQuestion2();
		
		System.out.println();
		System.out.println();
		System.out.println("学生B的试卷……");
		TestPaper2 studentB = new TestPaper2B();
		studentB.testQuestion1();
		studentB.testQuestion2();
		
	}
}
