package com.qst.employee.service;

import com.qst.employee.domain.Employee;
import com.qst.employee.domain.PageBean;

/**
 * 员工业务层的接口
 * @author ymm
 *
 */
public interface EmployeeService {

	Employee login(Employee employee);

	PageBean<Employee> findByPage(Integer currPage);

	void save(Employee employee);

	Employee findById(Integer eid);

	void update(Employee employee);

	void delete(Employee employee);

	

}
