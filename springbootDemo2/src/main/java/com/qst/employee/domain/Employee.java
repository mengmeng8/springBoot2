package com.qst.employee.domain;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "employee")

/**
 * 
 * 员工的实体
 *
 */
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO) 
  @Column(name = "eid")
  private Integer eid;
  @Column(name = "ename")
  private String  ename;
  @Column(name = "sex")
  private String  sex;
  @Column(name = "birthday")
  private Date  birthday;
  @Column(name = "joinDate")
  private Date  joinDate;
  @Column(name = "eno")
  private String eno;
  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
   //所属部门
  @ManyToOne
  private Department department;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public Date getJoinDate() {
	return joinDate;
}
public void setJoinDate(Date joinDate) {
	this.joinDate = joinDate;
}
public String getEno() {
	return eno;
}
public void setEno(String eno) {
	this.eno = eno;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
  
}
