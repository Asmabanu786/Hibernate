package model.cts;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.sql.Date;

import javax.persistence.Column;
@Entity
@Table(name="StudentIdentity")
public class Student {
	@EmbeddedId
	private StudentIdentity sid;
	@Column(name="fnm",nullable=false)
	private String firstName;
	@Column(name="lnm")
	private String lastName;
	@Column(name="dob", nullable=false)
	private Date dateOfBirth;
	public Student() {}
	public Student(StudentIdentity sid, String firstName, String lastName, Date dateOfBirth) {
		super();
		this.sid=sid;
		this.firstName=firstName;
		this.lastName=lastName;
		
	}

}
