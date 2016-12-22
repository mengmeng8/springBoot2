package com.qst.employee.dao;

import java.util.List;

import com.qst.employee.domain.Employee;

/**
 * 员工管理的DAO层接口
 * @author ymm
 *
 */
public interface EmployeeDao {

	Employee findByUsernameandPassword(Employee employee);

	int findCount();

	List<Employee> findByPage(int begin, int pageSize);

	void save(Employee employee);

	Employee findById(Integer eid);

	void update(Employee employee);

	void delete(Employee employee);

}
