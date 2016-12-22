package com.qst.employee.dao;

import java.util.List;

import com.qst.employee.domain.Department;

/**
 * 部门管理DAO层的接口
 * @author ymm
 *
 */
public interface DepartmentDao {

	int findCount();

	List<Department> findByPage(int begin, int pageSize);

	void save(Department department);

	Department findById(Integer did);

	void update(Department department);

	void delete(Department department);

	List<Department> findAll();


}
