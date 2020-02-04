package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("mang")
public class Manager extends Emp {
	@Column(name="allowance")
	private double allowance;
	public Manager() {
		
	}
	public Manager(long eid,String eName, double basic, double allowance) {
		super(eid,eName,basic);
		this.allowance=allowance;
	}
	public Double getAllowance() {
		return allowance;
	}
	public void setAllowance(Double allowance) {
		this.allowance=allowance;
	}
}
