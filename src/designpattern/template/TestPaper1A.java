package designpattern.template;

public class TestPaper1A extends TestPaper1 {

	@Override
	public void testQuestion1() {
		super.testQuestion1();
		System.out.println("答案：a");
	}

	@Override
	public void testQuestion2() {
		super.testQuestion2();
		System.out.println("答案：b");
	}
	
}
