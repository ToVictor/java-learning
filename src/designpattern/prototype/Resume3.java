package designpattern.prototype;

public class Resume3 {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume3(String name) {
		this.name = name;
		work = new WorkExperience();
	}
	
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String timeArea, String company) {
		work.setWorkDate(timeArea);
		work.setCompany(company);
	}

	public void display() {
		System.out.printf("%s %s %s%n", name, sex, age);
		System.out.printf("����������%s %s%n", work.getWorkDate(), work.getCompany());
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume3 a = new Resume3("����");
		a.setPersonalInfo("��", "29");
		a.setWorkExperience("1998-2000", "xx��˾");
		
		
		Resume3 b = (Resume3)a.clone();
		b.setWorkExperience("1998-2006", "xx��ҵ");
		
		Resume3 c = (Resume3)a.clone();
		c.setWorkExperience("1998-2003", "zz��ҵ");
		
		a.display();
		b.display();
		c.display();
	}
}
