package com.qst.employee.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 *部门的实体
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "department")
public class Department {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO) 
 @Column(name = "did")
   private Integer did;
 @Column(name = "dname")
   private String dname;
 @Column(name = "ddesc")
   private String ddesc;
   //员工集合
 @OneToMany
private Set<Employee> employees=new HashSet<Employee>();
public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDdesc() {
	return ddesc;
}
public void setDdesc(String ddesc) {
	this.ddesc = ddesc;
}
public Set<Employee> getEmployees() {
	return employees;
}
public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}
   
}
