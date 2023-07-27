package com.Sb101;

public class Employ implements Comparable<Employ>{
	private int emid;
   private String ename;
   private int salary;
   
    public Employ(int emid, String ename, int salary) {
	super();
	this.emid = emid;
	this.ename = ename;
	this.salary = salary;
}

	public int getEmid() {
		return emid;
	}

	public void setEmid(int emid) {
		this.emid = emid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employ other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.salary, other.salary);
	}

	@Override
	public String toString() {
		return "Employ [emid=" + emid + ", ename=" + ename + ", salary=" + salary + "]";
	}
   
   
}
