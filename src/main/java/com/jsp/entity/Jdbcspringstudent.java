package com.jsp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jdbcspringstudent 
{
	@Id
  private int studentUsn;
  private String studentName;
  private String studentCity;
public int getStudentUsn() {
	return studentUsn;
}
public void setStudentUsn(int studentUsn) {
	this.studentUsn = studentUsn;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
public Jdbcspringstudent() {
	
	// TODO Auto-generated constructor stub
}

public Jdbcspringstudent(int studentUsn, String studentName, String studentCity) {
	
	this.studentUsn = studentUsn;
	this.studentName = studentName;
	this.studentCity = studentCity;
}
@Override
public String toString() {
	return "Student [studentUsn=" + studentUsn + ", studentName=" + studentName + ", studentCity=" + studentCity + "]";
}

}
