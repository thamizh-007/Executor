package com.thamizh.codingpractice;

public class Student2 implemets BeaCoder{
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Student2 [cid=" + cid + ", cname=" + cname + ", getCid()=" + getCid() + ", getCname()=" + getCname()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public void codingPractice() {
		System.out.println("Do the practice at 6am"+wakeuptime);
	}

}
