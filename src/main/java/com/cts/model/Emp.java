package com.cts.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.DiscriminatorType;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="ALLINONEEMP")
@DiscriminatorColumn(name="emp_type",
 discriminatorType = DiscriminatorType.STRING)
public class Emp {
	@Id
	@Column(name="eid")
	private long eid;
	@Column(name="eName")
	private String eName;
	@Column(name="Basic")
	private double Basic;
	public Emp() {
		
	}
	
 public long geteid() {
	 return eid;
 }
 public void seteid(long eid) {
	 this.eid=eid;
 }
 public String getename() {
	 return eName;
 }
 public void seteName(String ename) {
	 this.eName= ename;
 }
 public double getbasic() {
	 return Basic;
 }
 public void setBasic(double basic) {
	this.Basic=basic;
 }
 public Emp(long eid,String ename, double baisc) {
		super();
		this.eid=eid;
		eName=ename;
	    Basic=Basic;
}


}
