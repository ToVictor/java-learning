package designpattern.prototype;

public class Resume1 {
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume1(String name) {
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
		System.out.printf("����������%s %s%n", timeArea, company);
	}
	
	public static void main(String[] args) {
		Resume1 a = new Resume1("����");
		a.setPersonalInfo("��", "29");
		a.setWorkExperience("1998-2000", "xx��˾");
		
		Resume1 b = new Resume1("����");
		b.setPersonalInfo("��", "29");
		b.setWorkExperience("1998-2000", "xx��˾");
		
		Resume1 c = new Resume1("����");
		c.setPersonalInfo("��", "29");
		c.setWorkExperience("1998-2000", "xx��˾");
		
		a.display();
		b.display();
		c.display();
	}
}
