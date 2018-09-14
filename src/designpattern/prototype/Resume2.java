package designpattern.prototype;

public class Resume2 implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume2(String name) {
		this.name = name;
	}
	
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}
	
	public void display() {
		System.out.printf("%s %s %s%n", name, sex, age);
		System.out.printf("%s %s%n", timeArea, company);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume2 a = new Resume2("大鸟");
		a.setPersonalInfo("男", "29");
		a.setWorkExperience("1998-2000", "xx公司");
		
		
		Resume2 b = (Resume2)a.clone();
		b.setWorkExperience("1998-2006", "xx企业");
		
		Resume2 c = (Resume2)a.clone();
		c.setWorkExperience("1998-2003", "zz公司");
		
		a.display();
		b.display();
		c.display();
	}
}
