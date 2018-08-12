package designpattern.prototype;

/**
 * 工作经历类
 * @author scc
 *
 */
public class WorkExperience implements Cloneable {
	private String workDate;
	private String company;
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
