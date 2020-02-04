package model.cts;
import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class StudentIdentity implements Serializable{
	/**
	 * 
	 */
	private static final long serialversionUID=1L;
	private int rollnumber;
	private char section;
	private int clas;
	public StudentIdentity() {}
	public StudentIdentity(int rollnumber,char section, int clas) {
		super();
		this.rollnumber=rollnumber;
		this.section=section;
		this.clas=clas;
		
	}

}
