package designpattern.template;

public abstract class TestPaper2 {
	public void testQuestion1(){
		System.out.println("世界上最好的编程语言是[] a.Java b.PHP c.C++ d.Python");
		System.out.println("答案："+answer1());
	}
	
	public void testQuestion2(){
		System.out.println("Java之父是[] a.苏超臣 b.比尔盖茨 c.马云 d.詹姆斯·高斯林");
		System.out.println("答案："+answer2());
	}
	
	public abstract String answer1();
	public abstract String answer2();
}
