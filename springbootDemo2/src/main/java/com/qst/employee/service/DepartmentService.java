package com.qst.employee.service;

import java.util.List;

import com.qst.employee.domain.Department;
import com.qst.employee.domain.PageBean;

/**
 * 部门管理业务层的接口
 * @author ymm
 *
 */
public interface DepartmentService {

	PageBean<Department> findByPage(Integer currPage);

	void save(Department department);

	Department findById(Integer did);

	void update(Department department);

	void delete(Department department);

	List<Department> findAll();

}
