package main2;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	private int rollNo;
	private String sname;
	private String mobNo;
	@Id
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + ", mobNo=" + mobNo + "]";
	}
	
}