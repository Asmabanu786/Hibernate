package com.cts.model;

import javax.persistence.Column;

public class Contract extends Emp {
@Column(name="duration")
	private int duration; 
public Contract() {
	
}
public Contract(long eid, String eName, double basic, int duration) {
	super(eid,eName,basic);
	this.duration=duration;

}
public void setDuration(int duration) {
	this.duration=duration;
}
	public int getDuration() {
		return duration;
	
    }
}
