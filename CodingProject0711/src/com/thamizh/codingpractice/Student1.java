package com.thamizh.codingpractice;

public class Student1 implements BeaCoder{
	private int sid;
	private int ename;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getEname() {
		return ename;
	}
	public void setEname(int ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", ename=" + ename + ", getSid()=" + getSid() + ", getEname()=" + getEname()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void codingPractice() {
		System.out.println("Do the practice at 5am"+wakeuptime);
	}

}
