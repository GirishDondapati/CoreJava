package com.girish.madhukar;

public class Depatment 
{
	private String deptname;
	private String loc;
	
	public Depatment(String deptname, String loc)
	{
		this.deptname = deptname;
		this.loc = loc;
	}
	
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
