package designpattern.template;

public class TestPaper1Demo {
	public static void main(String[] args) {
		System.out.println("学生A的试卷……");
		TestPaper1A studentA = new TestPaper1A();
		studentA.testQuestion1();
		studentA.testQuestion2();
		
		System.out.println();
		System.out.println();
		System.out.println("学生B的试卷……");
		TestPaper1B studentB = new TestPaper1B();
		studentB.testQuestion1();
		studentB.testQuestion2();
		
	}
}
